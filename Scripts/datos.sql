
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