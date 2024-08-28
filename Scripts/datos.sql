
INSERT INTO grano (gra_nombre, gra_procedencia) VALUES
("Cebada", "Jalisco"),
("Trigo", "Hidalgo"),
("Maíz", "Baja California"),
("Centeno", "Coahuila"),
("Avena", "Oaxaca");

INSERT INTO sede (sed_nombre, sed_telefono, sed_tipo, sed_estado, sed_ubicacion) VALUES
("Cerveza Esencia", 5512345678, "Principal", "Jalisco", "Av. Chapultepec 123, Guadalajara"),
("Casa Lúpulo", 5523456789, "Secundaria", "Nuevo León", "Calle Morelos 456, Monterrey"),
("Malta Viva", 5534567890, "Secundaria", "Ciudad de México", "Insurgentes Sur 789, Coyoacán"),
("La Barrica", 5545678901, "Principal", "Qolima", "Av. Universidad 321, Manzanillo"),
("Cañón Cebada", 5556789012, "Principal", "Yucatán", "Calle 60 No. 654, Mérida");

INSERT INTO expendio (exp_nombre, exp_rfc, exp_ubicacion) VALUES
("La Europea", "ABC010203XYZ", "Av. Insurgentes Sur 1234, Ciudad de México"),
("Beer House", "CDE040506MNO", "Av. Revolución 567, Guadalajara, Jalisco"),
("The Beer Company", "FGH070809PQR", "Calle 5 de Mayo 89, Monterrey, Nuevo León"),
("Hops Beer Shop", "IJK101112STU", "Av. Universidad 456, Coyoacán, Ciudad de México"),
("La Belga", "LMN131415VWX", "Calle Amsterdam 234, Colonia Condesa, Ciudad de México");

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

NSERT INTO pedido (id_presentacion, id_expendio, ped_cantidad, ped_fecha_orden, ped_fecha_despacho, ped_total, ped_subtotal, ped_iva) VALUES
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

INSERT INTO receta (procedimiento, id_grano, id_cerveza) VALUES
('Maceración y filtrado', 1, 1),
('Molienda y cocción', 2, 2),
('Fermentación y maduración', 3, 3),
('Mezcla y embotellado', 4, 4),
('Clarificación y pasteurización', 5, 5);
