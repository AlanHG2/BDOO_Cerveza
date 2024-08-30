-- OPTATIVA 1: BASES DE DATOS ORIENTADAS A OBJETOS
--7°1

--Aguilar Jiménez Jade Ameyalli
--Calvo Díaz Obeth Yael
--García García Alan HAzel
--Serrano Muñoz Patricia Itzel

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
("Cervecería Loba", "5556678912", "Principal", "Jalisco", "Pobladito No. 784, Guadalajara"),
("Cervecería Primus", "5526415371", "Secundaria", "Ciudad de México", "Av. Pinos 890, Iztacalco"),
("Cervecería Allende", "5519078432", "Secundaria", "Guanajuato", "Calle Rosas No. 64, San Miguel de Allende"),
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
("Biergarten", "NOP161718YZA", "Av. Álvaro Obregón 299, Colonia Roma, Ciudad de México"),
("El Depósito", "BCD192021EFG", "Calle Morelos 123, Zapopan, Jalisco"),
("Lúpulo Craft Beer Bar", "HIJ222324KLM", "Calle 60 456, Centro, Mérida, Yucatán"),
("La Taberna", "NOP252627OPQ", "Paseo de la Reforma 789, Ciudad de México"),
("Cervecería Reforma", "RST282930UVW", "Av. Juárez 321, Puebla, Puebla");

INSERT INTO fabricante (fab_nombre,id_sede) VALUES
("Cervecería Rrëy", 1),
("Cervecería Principia",2),
("Cervecería Paracaidista",3),
("Cervecería de Colima",4),
("Cervecería Minerva", 5),
("Cervecería Wendlandt", 6),
("Cervecería Baja Brewing", 7),
("Cervecería Fortuna", 8),
("Cervecería Piedra", 9);

INSERT INTO marca(mar_nombre,id_fabricante) VALUES
("Rrey", 1),
("Principia",2),
("Paracaidista",3),
("Interestellar",2),
("Colima",4),
("Minerva", 5),
("Wendlandt", 6),
("Baja Brewing", 7),
("Fortuna", 8),
("Piedra Lisa", 4);

INSERT INTO cerveza(cer_nombre,cer_graduacion, id_marca) VALUES
("Triple Hog",11, 1),
("Extrasolar",6.5,2),
("Sour Sauvin",6,3),
("PSB",13,4),
("Pieda lisa",4.5,5),
("IPA Rrëy", 7.2, 1), 
("Quantum", 8.0, 2),  
("Barrel Aged", 10.5, 3), 
("Supernova", 12.5, 4), 
("Colimita", 4.2, 5), 
("Ámbar Minerva", 6.2, 6), 
("Harry Polanco", 7.0, 6), 
("Vaquita Marina", 5.3, 7),  
("Cayaco", 4.5, 8),  
("Piedra Lisa", 4.5, 9),
("Colonial", 5.8, 6),
("La Lupulosa", 7.5, 5),
("Por Favor", 4.2, 7), 
("Café Colima", 5.0, 9),
("Lager Clara", 4.8, 1),  
("Pale Ale", 5.2, 2),  
("Imperial Stout", 9.0, 3), 
("Blonde Ale", 4.5, 4),  
("Amber Ale", 5.0, 5),  
("Weissbier", 5.4, 6),  
("Dubbel", 6.5, 7),  
("Tripel", 8.0, 8),  
("Porter", 6.0, 9), 
("Helles", 4.9, 10);

INSERT INTO lote (id_cerveza, lot_fecha_prod, lot_fecha_cadu, lot_cantidad) VALUES
(1, '2024-01-15', '2024-07-15', 1000),
(2, '2024-02-20', '2024-08-20', 1500),
(3, '2024-03-10', '2024-09-10', 1200),
(4, '2024-04-05', '2024-10-05', 800),
(6, '2024-01-20', '2024-07-20', 1100),
(7, '2024-02-15', '2024-08-15', 950),
(8, '2024-03-22', '2024-09-22', 1200),
(9, '2024-04-30', '2024-10-30', 800),
(10, '2024-05-18', '2024-11-18', 1300),
(11, '2024-06-25', '2024-12-25', 1000),
(12, '2024-07-14', '2025-01-14', 1500),
(13, '2024-08-07', '2025-02-07', 1100),
(14, '2024-09-11', '2025-03-11', 1400),
(15, '2024-10-29', '2025-04-29', 1000),
(16, '2024-01-10', '2024-07-10', 1200),
(17, '2024-02-28', '2024-08-28', 800),
(18, '2024-03-15', '2024-09-15', 1300),
(19, '2024-04-25', '2024-10-25', 900),
(20, '2024-05-05', '2024-11-05', 1000),
(21, '2024-06-22', '2024-12-22', 1100),
(22, '2024-07-10', '2025-01-10', 1400),
(23, '2024-08-19', '2025-02-19', 950),
(24, '2024-09-08', '2025-03-08', 1200),
(25, '2024-10-15', '2025-04-15', 1100),
(26, '2024-01-22', '2024-07-22', 1050),
(27, '2024-02-27', '2024-08-27', 950),
(28, '2024-03-11', '2024-09-11', 1250),
(29, '2024-04-19', '2024-10-19', 1000),
(1, '2024-07-20', '2025-01-20', 1200),
(2, '2024-08-15', '2025-02-15', 1300),
(3, '2024-09-10', '2025-03-10', 1250),
(4, '2024-10-05', '2025-04-05', 1100),
(5, '2024-11-30', '2025-05-30', 900),
(6, '2024-01-10', '2024-07-10', 1500),
(7, '2024-02-15', '2024-08-15', 1400),
(8, '2024-03-22', '2024-09-22', 1300),
(9, '2024-04-30', '2024-10-30', 1200),
(10, '2024-05-18', '2024-11-18', 1100),
(11, '2024-06-25', '2024-12-25', 1400),
(12, '2024-07-14', '2025-01-14', 1350),
(13, '2024-08-07', '2025-02-07', 1250),
(14, '2024-09-11', '2025-03-11', 1150),
(15, '2024-10-29', '2025-04-29', 1050),
(16, '2024-01-20', '2024-07-20', 1000),
(17, '2024-02-28', '2024-08-28', 1500),
(18, '2024-03-15', '2024-09-15', 1350),
(19, '2024-04-25', '2024-10-25', 1250),
(20, '2024-05-05', '2024-11-05', 1150),
(21, '2024-06-22', '2024-12-22', 1050),
(22, '2024-07-10', '2025-01-10', 1300),
(23, '2024-08-19', '2025-02-19', 1200),
(24, '2024-09-08', '2025-03-08', 1100),
(25, '2024-10-15', '2025-04-15', 1000),
(26, '2024-01-22', '2024-07-22', 1400),
(27, '2024-02-27', '2024-08-27', 1350),
(28, '2024-03-11', '2024-09-11', 1250),
(29, '2024-04-19', '2024-10-19', 1150);


INSERT INTO presentacion (id_cerveza, pre_descripcion, pre_tipo_envase, pre_capacidad) VALUES
(1, 'Lata 355 ml', 'Lata', 355),
(2, 'Botella 500 ml', 'Vidrio', 500),
(3, 'Botella 330 ml', 'Vidrio', 330),
(4, 'Lata 473 ml', 'Lata', 473),
(5, 'Botella 1 L', 'Vidrio', 1000),
(6, 'Botella 355 ml', 'Vidrio', 355),
(7, 'Lata 500 ml', 'Lata', 500),
(8, 'Botella 750 ml', 'Vidrio', 750),
(9, 'Botella 330 ml', 'Vidrio', 330),
(10, 'Lata 355 ml', 'Lata', 355),
(11, 'Botella 500 ml', 'Vidrio', 500),
(12, 'Botella 1.5 L', 'Vidrio', 1500),
(13, 'Lata 473 ml', 'Lata', 473),
(14, 'Botella 355 ml', 'Vidrio', 355),
(15, 'Lata 330 ml', 'Lata', 330),
(16, 'Botella 750 ml', 'Vidrio', 750),
(17, 'Lata 500 ml', 'Lata', 500),
(18, 'Botella 500 ml', 'Vidrio', 500),
(19, 'Botella 1 L', 'Vidrio', 1000),
(20, 'Lata 355 ml', 'Lata', 355),
(21, 'Botella 330 ml', 'Vidrio', 330),
(22, 'Lata 473 ml', 'Lata', 473),
(23, 'Botella 750 ml', 'Vidrio', 750),
(24, 'Lata 500 ml', 'Lata', 500),
(25, 'Botella 500 ml', 'Vidrio', 500),
(26, 'Botella 355 ml', 'Vidrio', 355),
(27, 'Lata 330 ml', 'Lata', 330),
(28, 'Botella 1 L', 'Vidrio', 1000),
(29, 'Lata 473 ml', 'Lata', 473),
(1, 'Botella 500 ml', 'Vidrio', 500),
(1, 'Botella 750 ml', 'Vidrio', 750),
(2, 'Lata 355 ml', 'Lata', 355),
(2, 'Botella 330 ml', 'Vidrio', 330),
(3, 'Lata 473 ml', 'Lata', 473),
(3, 'Botella 500 ml', 'Vidrio', 500),
(4, 'Botella 750 ml', 'Vidrio', 750),
(4, 'Botella 330 ml', 'Vidrio', 330),
(5, 'Lata 500 ml', 'Lata', 500),
(5, 'Botella 750 ml', 'Vidrio', 750),
(6, 'Lata 330 ml', 'Lata', 330),
(6, 'Botella 1 L', 'Vidrio', 1000);

INSERT INTO pedido (id_presentacion, id_expendio, ped_cantidad, ped_fecha_orden, ped_fecha_despacho, ped_total, ped_subtotal, ped_iva) VALUES
(1, 1, 100, '2024-08-01', '2024-08-02', 2500.00, 2100.00, 400.00),
(2, 2, 200, '2024-08-03', '2024-08-04', 6000.00, 5000.00, 1000.00),
(3, 3, 150, '2024-08-05', '2024-08-06', 4200.00, 3600.00, 600.00),
(34, 3, 300, '2024-08-05', '2024-08-06', 5220.00, 4500.00, 720.00),
(35, 3, 210, '2024-08-05', '2024-08-06', 7656.00, 6600.00, 1056.00),
(4, 4, 80, '2024-08-07', '2024-08-08', 2560.00, 2240.00, 320.00),
(5, 5, 120, '2024-08-09', '2024-08-10', 4800.00, 4200.00, 600.00),
(1, 1, 120, '2024-08-15', '2024-08-16', 3000.00, 2520.00, 480.00),
(1, 2, 100, '2024-08-17', '2024-08-18', 2500.00, 2100.00, 400.00),
(2, 2, 180, '2024-08-19', '2024-08-20', 5400.00, 4500.00, 900.00),
(2, 3, 220, '2024-08-21', '2024-08-22', 6600.00, 5500.00, 1100.00),
(3, 3, 160, '2024-08-23', '2024-08-24', 4480.00, 3840.00, 640.00),
(3, 4, 140, '2024-08-25', '2024-08-26', 3920.00, 3360.00, 560.00),
(4, 4, 100, '2024-08-27', '2024-08-28', 3200.00, 2800.00, 400.00),
(4, 5, 90, '2024-08-29', '2024-08-30', 2880.00, 2520.00, 360.00),
(5, 5, 130, '2024-08-31', '2024-09-01', 5200.00, 4550.00, 650.00),
(5, 1, 110, '2024-09-02', '2024-09-03', 4400.00, 3850.00, 550.00),
(6, 2, 200, '2024-09-04', '2024-09-05', 7000.00, 6000.00, 1000.00),
(6, 3, 150, '2024-09-06', '2024-09-07', 5250.00, 4500.00, 750.00),
(7, 1, 170, '2024-09-08', '2024-09-09', 5950.00, 5100.00, 850.00),
(7, 4, 140, '2024-09-10', '2024-09-11', 4900.00, 4200.00, 700.00),
(8, 5, 190, '2024-09-12', '2024-09-13', 6650.00, 5700.00, 950.00),
(8, 2, 160, '2024-09-14', '2024-09-15', 5600.00, 4800.00, 800.00),
(9, 3, 130, '2024-09-16', '2024-09-17', 4550.00, 3900.00, 650.00),
(9, 1, 140, '2024-09-18', '2024-09-19', 4900.00, 4200.00, 700.00),
(10, 4, 180, '2024-09-20', '2024-09-21', 6300.00, 5400.00, 900.00),
(10, 5, 170, '2024-09-22', '2024-09-23', 5950.00, 5100.00, 850.00),
(11, 2, 150, '2024-09-24', '2024-09-25', 5250.00, 4500.00, 750.00),
(11, 3, 160, '2024-09-26', '2024-09-27', 5600.00, 4800.00, 800.00),
(12, 1, 200, '2024-09-28', '2024-09-29', 7000.00, 6000.00, 1000.00),
(12, 5, 180, '2024-09-30', '2024-10-01', 6300.00, 5400.00, 900.00);

INSERT INTO almacen (alma_existencia, alma_capacidad, id_presentacion, id_expendio) VALUES
(500, 1000, 1, 1),
(200, 800, 2, 2),
(150, 600, 3, 3),
(300, 1200, 4, 4),
(250, 1000, 5, 5),
(500, 1000, 1, 1),
(200, 800, 2, 2),
(150, 600, 3, 3),
(300, 1200, 4, 4),
(250, 1000, 5, 5),
(450, 1000, 1, 6),
(180, 800, 2, 7),
(170, 600, 3, 8),
(280, 1200, 4, 9),
(300, 1000, 5, 10),
(600, 1200, 1, 2),
(220, 800, 2, 3),
(160, 600, 3, 4),
(350, 1200, 4, 5),
(280, 1000, 5, 6),
(400, 1000, 1, 7),
(210, 800, 2, 8),
(180, 600, 3, 9),
(290, 1200, 4, 10),
(320, 1000, 5, 1);

INSERT INTO venta (vent_precioU, vent_cantidad, vent_fecha, id_expendio, id_presentacion) VALUES
(25, 100, '2024-08-15', 1, 1),
(30, 150, '2024-08-16', 2, 2),
(28, 200, '2024-08-17', 3, 3),
(32, 80, '2024-08-18', 4, 4),
(27, 120, '2024-08-19', 5, 5),
(29, 110, '2024-08-20', 1, 3),
(33, 140, '2024-08-21', 2, 1),
(26, 160, '2024-08-22', 3, 2),
(35, 90, '2024-08-23', 4, 5),
(31, 130, '2024-08-24', 5, 4),
(30, 115, '2024-08-25', 1, 2),
(28, 180, '2024-08-26', 2, 3),
(32, 150, '2024-08-27', 3, 1),
(34, 95, '2024-08-28', 4, 3),
(29, 125, '2024-08-29', 5, 2),
(25, 100, '2024-08-15', 1, 1),
(30, 150, '2024-08-16', 2, 2),
(28, 200, '2024-08-17', 3, 3),
(32, 80, '2024-08-18', 4, 4),
(27, 120, '2024-08-19', 5, 5),
(29, 110, '2024-08-20', 1, 3),
(33, 140, '2024-08-21', 2, 1),
(26, 160, '2024-08-22', 3, 2),
(35, 90, '2024-08-23', 4, 5),
(31, 130, '2024-08-24', 5, 4),
(30, 115, '2024-08-25', 1, 2),
(28, 180, '2024-08-26', 2, 3),
(32, 150, '2024-08-27', 3, 1),
(34, 95, '2024-08-28', 4, 3),
(29, 125, '2024-08-29', 5, 2),
(31, 140, '2024-08-30', 6, 1),
(27, 90, '2024-08-31', 7, 2),
(33, 110, '2024-09-01', 8, 3),
(30, 200, '2024-09-02', 9, 4),
(32, 150, '2024-09-03', 10, 5),
(28, 130, '2024-09-04', 6, 2),
(29, 120, '2024-09-05', 7, 3),
(34, 140, '2024-09-06', 8, 4),
(31, 110, '2024-09-07', 9, 5),
(30, 140, '2024-09-08', 10, 1),
(35, 160, '2024-09-09', 6, 3),
(32, 100, '2024-09-10', 7, 4),
(29, 130, '2024-09-11', 8, 5),
(33, 170, '2024-09-12', 9, 2),
(28, 140, '2024-09-13', 10, 3);

INSERT INTO receta (procedimiento, id_grano, id_cerveza) VALUES
('Maceración y filtrado', 4, 1),
('Maceración y filtrado', 1, 1),
('Maceración y filtrado', 2, 1),
('Maceración y filtrado', 3, 1),
('Molienda y cocción', 2, 2),
('Fermentación y maduración', 3, 3),
('Mezcla y embotellado', 4, 4),
('Clarificación y pasteurización', 5, 5),
('Maceración y filtrado', 1, 6),
('Maceración y filtrado', 2, 6),
('Maceración y filtrado', 3, 6),
('Molienda y cocción', 2, 7),
('Fermentación y maduración', 3, 8),
('Mezcla y embotellado', 4, 9),
('Clarificación y pasteurización', 5, 10),
('Maceración y filtrado', 1, 11),
('Maceración y filtrado', 2, 11),
('Maceración y filtrado', 3, 11),
('Molienda y cocción', 2, 12),
('Fermentación y maduración', 3, 13),
('Mezcla y embotellado', 4, 14),
('Clarificación y pasteurización', 5, 15),
('Maceración y filtrado', 1, 16),
('Maceración y filtrado', 2, 16),
('Maceración y filtrado', 3, 16),
('Molienda y cocción', 2, 17),
('Fermentación y maduración', 3, 18),
('Mezcla y embotellado', 4, 19),
('Clarificación y pasteurización', 5, 20),
('Maceración y filtrado', 1, 21),
('Maceración y filtrado', 2, 21),
('Maceración y filtrado', 3, 21),
('Molienda y cocción', 2, 22),
('Fermentación y maduración', 3, 23),
('Mezcla y embotellado', 4, 24),
('Clarificación y pasteurización', 5, 25),
('Maceración y filtrado', 1, 26),
('Maceración y filtrado', 2, 26),
('Maceración y filtrado', 3, 26),
('Molienda y cocción', 2, 27),
('Fermentación y maduración', 3, 28),
('Mezcla y embotellado', 4, 29);
