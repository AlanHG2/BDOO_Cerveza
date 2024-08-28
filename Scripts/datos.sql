INSERT INTO fabricante (fab_nombre,id_sede) VALUES
("Cervecería Rrëy", 1),
("Cervecería Principia",2),
("Cervecería Paracaidista",3),
("Cervecería de Colima",4),

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