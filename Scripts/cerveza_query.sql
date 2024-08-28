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

-- 6. Número de cervezas con más de 500 unidades vendidas en la ´última semana
