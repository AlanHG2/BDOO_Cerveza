-- OPTATIVA 1: BASES DE DATOS ORIENTADAS A OBJETOS
--7°1

--Aguilar Jiménez Jade Ameyalli
--Calvo Díaz Obeth Yael
--García García Alan HAzel
--Serrano Muñoz Patricia Itzel

-- 1. Datos y nombre de fabricante de las cervezas de tipo x
SELECT 
    cerveza.cer_nombre AS NombreCerveza,
    cerveza.cer_graduacion AS Graduacion,
    marca.mar_nombre AS Marca,
    fabricante.fab_nombre AS Fabricante,
    sede.sed_nombre AS Sede
FROM
    cerveza
JOIN 
    marca ON cerveza.id_marca = marca.id_marca
JOIN 
    fabricante ON marca.id_fabricante = fabricante.id_fabricante
JOIN 
    sede ON fabricante.id_sede = sede.id_sede
WHERE 
    cerveza.cer_nombre = 'Extrasolar';

-- 2. Cervezas que produce el fabricante x con graduacion (nombre cerveza, graduacion)
SELECT 
    cerveza.cer_nombre AS NombreCerveza,
    cerveza.cer_graduacion AS GraduacionAlcoholica,
    fabricante.fab_nombre AS Fabricante
FROM 
    cerveza
JOIN 
    marca ON cerveza.id_marca = marca.id_marca
JOIN 
    fabricante ON marca.id_fabricante = fabricante.id_fabricante
WHERE 
    fabricante.fab_nombre = 'Cervecería Principia' and cerveza.cer_graduacion = 6.5;

-- 3. Cantidad total de cervezas de nombre x producidas
SELECT 
    cerveza.cer_nombre AS NombreCerveza,
    SUM(lote.lot_cantidad) AS TotalProducido
FROM 
    lote
JOIN 
    cerveza ON lote.id_cerveza = cerveza.id_cerveza
WHERE 
    cerveza.cer_nombre = 'PSB';

--4 Datos de cerveza y fabricante con mayor número de ventas en expendios (Nombre cerveza, fabricante, cantidad vendida)
SELECT 
    cerveza.cer_nombre AS NombreCerveza,
    fabricante.fab_nombre AS Fabricante,
    SUM(venta.vent_cantidad) AS CantidadVendida
FROM 
    venta
JOIN 
    presentacion ON venta.id_presentacion = presentacion.id_presentacion
JOIN 
    cerveza ON presentacion.id_cerveza = cerveza.id_cerveza
JOIN 
    marca ON cerveza.id_marca = marca.id_marca
JOIN 
    fabricante ON marca.id_fabricante = fabricante.id_fabricante
GROUP BY 
    cerveza.id_cerveza, fabricante.id_fabricante
ORDER BY 
    CantidadVendida DESC
LIMIT 1;

-- 5. Cervezas con más de 3 ingredientes (Nombre, número de ingredientes)
SELECT 
    cerveza.cer_nombre AS Nombre_Cerveza,
    COUNT(receta.id_grano) AS Numero_Granos
FROM 
    receta
JOIN
    cerveza ON receta.id_cerveza = cerveza.id_cerveza
GROUP BY
    cerveza.cer_nombre
HAVING
    COUNT(receta.id_grano) > 3;

-- 6. Número de cervezas con más de 500 unidades vendidas en la última semana
SELECT 
    COUNT(*) AS NumCervezas
FROM 
    (
        SELECT 
            cerveza.id_cerveza
        FROM 
            venta
        JOIN 
            presentacion ON venta.id_presentacion = presentacion.id_presentacion
        JOIN 
            cerveza ON presentacion.id_cerveza = cerveza.id_cerveza
        WHERE 
            venta.vent_fecha >= CURDATE() - INTERVAL 20 DAY
        GROUP BY 
            cerveza.id_cerveza
        HAVING 
            SUM(venta.vent_cantidad) > 100
    ) AS CervezasVendidas;

-- 7. Expendios en el estado x
SELECT * FROM sede WHERE sed_estado = ‘Jalisco’;

-- 8. Cerveza más vendida en cada expendio (nombre expendio, nombre cerveza)
SELECT  
    e.exp_nombre AS nombre_expendio, 
    c.cer_nombre AS nombre_cerveza 
FROM  
    expendio e 
JOIN  
    venta v ON e.id_expendio = v.id_expendio 
JOIN  
    presentacion p ON v.id_presentacion = p.id_presentacion 
JOIN  
    cerveza c ON p.id_cerveza = c.id_cerveza 
WHERE  
    (v.id_expendio, v.vent_cantidad) IN ( 
        SELECT  
            v2.id_expendio, 
            MAX(v2.vent_cantidad) 
        FROM  
            venta v2 
        GROUP BY  
            v2.id_expendio 
    ) 
GROUP BY  
    e.exp_nombre, c.cer_nombre;

--9. Número de cervezas que produce el fabricante x
SELECT FROM 
    f.fab_nombre AS nombre_fabricante,
    COUNT(c.id_cerveza) AS numero_cervezas
    fabricante f
JOIN 
    marca m ON f.id_fabricante = m.id_fabricante
JOIN 
    cerveza c ON m.id_marca = c.id_marca
WHERE 
    f.fab_nombre = ' Cervecería Principia '
GROUP BY 
    f.fab_nombre;

--10.  Número de cervezas disponibles en los expendios de menor a mayor (nombre cerveza, nombre expendio, existencia)
SELECT 
    c.cer_nombre AS nombre_cerveza,
    e.exp_nombre AS nombre_expendio,
    SUM(a.alma_cantidad) AS existencia
FROM 
    expendio e
JOIN 
    almacen a ON e.id_expendio = a.id_expendio
JOIN 
    presentacion p ON a.id_presentacion = p.id_presentacion
JOIN 
    cerveza c ON p.id_cerveza = c.id_cerveza
GROUP BY 
    c.cer_nombre, e.exp_nombre
ORDER BY 
    existencia ASC;

-- TRIGGER: Agregar un campo a la entidad Cerveza que almacene y actualice la existencia total de esa cerveza,
-- es decir, la sumatoria de las existencias de ese producto en todos los expendios.
DELIMITER $$
CREATE TRIGGER update_cerveza_existencia
BEFORE INSERT ON almacen
FOR EACH ROW
BEGIN
    DECLARE total_existencia INT;
    -- Calcular la suma total de existencias de la cerveza
    SELECT SUM(alma_existencia)
    INTO total_existencia
    FROM almacen
    WHERE id_presentacion = NEW.id_presentacion;
    -- Actualizar el campo cer_existencia_total en la tabla cerveza
    UPDATE cerveza
    SET cer_existencia_total = total_existencia
    WHERE id_cerveza = (
        SELECT id_cerveza
        FROM presentacion
        WHERE id_presentacion = NEW.id_presentacion
    );
END $$
DELIMITER ;

--------------------------------------------------------------------------------------------------------------------------