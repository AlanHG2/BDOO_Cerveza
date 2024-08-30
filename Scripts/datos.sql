INSERT INTO grano (gra_nombre, gra_procedencia) VALUES
("Cebada", "Jalisco"),
("Trigo", "Hidalgo"),
("Maíz", "Baja California"),
("Centeno", "Coahuila"),
("Avena", "Oaxaca");

INSERT INTO sede (sed_nombre, sed_telefono, sed_tipo, sed_estado, sed_ubicacion) VALUES
("Cerveza Esencia", "5512345678", "Principal", "Jalisco", "Av. Chapultepec 123, Guadalajara"),
("Casa Lúpulo", "5523456789", "Secundaria", "Nuevo León", "Calle Morelos 456, Monterrey"),
("Malta Viva", "5534567890", "Secundaria", "Ciudad de México", "Insurgentes Sur 789, Coyoacán"),
("La Barrica", "5545678901", "Principal", "Qolima", "Av. Universidad 321, Manzanillo"),
("Cañón Cebada", "5556789012", "Principal", "Yucatán", "Calle 60 No. 654, Mérida"),
("Cervecería del Norte", "5511122233", "Principal", "Chihuahua", "Av. Revolución 102, Chihuahua"),
("Lúpulo Fino", "5522233344", "Secundaria", "Puebla", "Calle Juárez 77, Puebla"),
("Malta Dorada", "5533344455", "Principal", "Guanajuato", "Av. Hidalgo 456, León"),
("La Espuma", "5544455566", "Secundaria", "Querétaro", "Blvd. Bernardo Quintana 200, Querétaro"),
("El Barril de Oro", "5555566677", "Principal", "Jalisco", "Calle Independencia 999, Tlaquepaque"),
("Cerveza Artesanal", "5566677788", "Secundaria", "Oaxaca", "Calle de Alcalá 123, Oaxaca"),
("Lúpulo en Flor", "5577788899", "Principal", "Veracruz", "Malecón 101, Veracruz"),
("Cerveza Viva", "5588899900", "Principal", "Baja California", "Av. Internacional 54, Tijuana"),
("La Cebada Pura", "5599900011", "Secundaria", "Sonora", "Blvd. Rodríguez 1200, Hermosillo"),
("El Tanque de Malta", "5510011122", "Principal", "Michoacán", "Calle Madero 300, Morelia");

INSERT INTO expendio (exp_nombre, exp_rfc, exp_ubicacion) VALUES
("La Europea", "ABC010203XYZ", "Av. Insurgentes Sur 1234, Ciudad de México"),
("Beer House", "CDE040506MNO", "Av. Revolución 567, Guadalajara, Jalisco"),
("The Beer Company", "FGH070809PQR", "Calle 5 de Mayo 89, Monterrey, Nuevo León"),
("Hops Beer Shop", "IJK101112STU", "Av. Universidad 456, Coyoacán, Ciudad de México"),
("La Belga", "LMN131415VWX", "Calle Amsterdam 234, Colonia Condesa, Ciudad de México"),
("Cervezas del Mundo", "OPQ161718YZA", "Calle de las Palmas 789, Polanco, Ciudad de México"),
("El Bodegón de la Cerveza", "RST192021BCD", "Calle 16 de Septiembre 456, Guadalajara, Jalisco"),
("Lúpulo y Malta", "EFG222324HIJ", "Blvd. Bernardo Quintana 1200, Querétaro, Querétaro"),
("La Taberna del Lúpulo", "KLM252627NOP", "Paseo de la Reforma 678, Ciudad de México"),
("Brews & Ales", "QRS282930TUV", "Av. Chapultepec 345, Guadalajara, Jalisco"),
("El Barrilito", "WXY313233ABC", "Calle Madero 890, León, Guanajuato"),
("Cerveza y Tradición", "DEF343536GHI", "Av. Juárez 100, Puebla, Puebla"),
("La Cervecera", "JKL373839LMN", "Av. Hidalgo 567, Veracruz, Veracruz"),
("Malta y Lúpulo", "OPQ404142RST", "Calle 60 No. 789, Mérida, Yucatán"),
("El Lúpulo Dorado", "UVW434445XYZ", "Calle Zaragoza 234, Morelia, Michoacán");

INSERT INTO fabricante (fab_nombre,id_sede) VALUES
("Cervecería Rrëy", 1),
("Cervecería Principia",2),
("Cervecería Paracaidista",3),
("Cervecería de Colima",4);

INSERT INTO marca(mar_nombre,id_fabricante) VALUES
("Rrey", 1),
("Principia",2),
("Paracaidista",3),
("Interestellar",2),
("Colima",4);

INSERT INTO cerveza(cer_nombre,cer_graduacion, id_marca) VALUES
("Triple Hog",11, 1),
("Extrasolar",6.5,2),
("Sour Sauvin",6,3),
("PSB",13,4),
("Pieda lisa",4.5,5);

INSERT INTO lote (id_cerveza, lot_fecha_prod, lot_fecha_cadu, lot_cantidad) VALUES
(1, '2024-01-15', '2024-07-15', 1000),
(2, '2024-02-20', '2024-08-20', 1500),
(3, '2024-03-10', '2024-09-10', 1200),
(4, '2024-04-05', '2024-10-05', 800),
(5, '2024-05-30', '2024-11-30', 950);

INSERT INTO presentacion (id_cerveza, pre_descripcion, pre_tipo_envase, pre_capacidad) VALUES
(1, 'Lata 355 ml', 'Lata', 355),
(2, 'Botella 500 ml', 'Vidrio', 500),
(3, 'Botella 330 ml', 'Vidrio', 330),
(4, 'Lata 473 ml', 'Lata', 473),
(5, 'Botella 1 L', 'Vidrio', 1000);

INSERT INTO pedido (id_presentacion, id_expendio, ped_cantidad, ped_fecha_orden, ped_fecha_despacho, ped_total, ped_subtotal, ped_iva) VALUES
(1, 1, 100, '2024-08-01', '2024-08-02', 2500.00, 2100.00, 400.00),
(2, 2, 200, '2024-08-03', '2024-08-04', 6000.00, 5000.00, 1000.00),
(3, 3, 150, '2024-08-05', '2024-08-06', 4200.00, 3600.00, 600.00),
(4, 4, 80, '2024-08-07', '2024-08-08', 2560.00, 2240.00, 320.00),
(5, 5, 120, '2024-08-09', '2024-08-10', 4800.00, 4200.00, 600.00);

INSERT INTO almacen (alma_existencia, alma_capacidad, id_presentacion, id_expendio) VALUES
(500, 1000, 1, 1),
(200, 800, 2, 2),
(150, 600, 3, 3),
(300, 1200, 4, 4),
(250, 1000, 5, 5);

INSERT INTO venta (vent_precioU, vent_cantidad, vent_fecha, id_expendio, id_presentacion) VALUES
(25, 100, '2024-08-15', 1, 1),
(30, 150, '2024-08-16', 2, 2),
(28, 200, '2024-08-17', 3, 3),
(32, 80, '2024-08-18', 4, 4),
(27, 120, '2024-08-19', 5, 5);

INSERT INTO venta (vent_precioU, vent_cantidad, vent_fecha, id_expendio, id_presentacion) VALUES
(29, 110, '2024-08-20', 1, 3),
(33, 140, '2024-08-21', 2, 1),
(26, 160, '2024-08-22', 3, 2),
(35, 90, '2024-08-23', 4, 5),
(31, 130, '2024-08-24', 5, 4),
(30, 115, '2024-08-25', 1, 2),
(28, 180, '2024-08-26', 2, 3),
(32, 150, '2024-08-27', 3, 1),
(34, 95, '2024-08-28', 4, 3),
(29, 125, '2024-08-29', 5, 2);


INSERT INTO receta (procedimiento, id_grano, id_cerveza) VALUES
('Maceración y filtrado', 1, 1),
('Molienda y cocción', 2, 2),
('Fermentación y maduración', 3, 3),
('Mezcla y embotellado', 4, 4),
('Clarificación y pasteurización', 5, 5);
