-- CREATE DATABASE IF NOT EXISTS cervezas ;
-- use cervezas ;

-- grano
CREATE TABLE IF NOT EXISTS grano (
    id_grano INT NOT NULL AUTO_INCREMENT,
    gra_nombre VARCHAR(25) NOT NULL,
    gra_procedencia VARCHAR (25) NOT NULL,
    PRIMARY KEY (id_grano))
ENGINE = InnoDB;

-- sede
CREATE TABLE IF NOT EXISTS sede (
    id_sede INT NOT NULL AUTO_INCREMENT,
    sed_nombre VARCHAR (50) NOT NULL,
    sed_telefono VARCHAR(10) NOT NULL,
    sed_tipo VARCHAR (25) NOT NULL,
    sed_estado VARCHAR (25) NOT NULL,
    sed_ubicacion VARCHAR (100) NOT NULL,
    PRIMARY KEY (id_sede))
ENGINE = InnoDB;

-- expendio
CREATE TABLE IF NOT EXISTS expendio (
    id_expendio INT NOT NULL AUTO_INCREMENT,
    exp_nombre VARCHAR (50) NOT NULL,
    exp_rfc VARCHAR (15) NOT NULL,
    exp_ubicacion VARCHAR (100) NOT NULL,
    PRIMARY KEY (id_expendio))
ENGINE = InnoDB;

-- fabricante
CREATE TABLE IF NOT EXISTS fabricante(
    id_fabricante INT NOT NULL AUTO_INCREMENT,
    fab_nombre VARCHAR(40) NOT NULL,
    id_sede INT NOT NULL,
    PRIMARY KEY (id_fabricante),
    INDEX fab_sed (id_sede ASC),
    CONSTRAINT fab_sed
        FOREIGN KEY (id_sede)
        REFERENCES sede (id_sede)
        ON DELETE RESTRICT
        ON UPDATE CASCADE)
ENGINE=InnoDB;
 
-- marca
CREATE TABLE IF NOT EXISTS marca(
    id_marca INT NOT NULL AUTO_INCREMENT,
    mar_nombre VARCHAR(50) NOT NULL,
    id_fabricante INT NOT NULL,
    PRIMARY KEY (id_marca),
    INDEX mar_fab(id_fabricante ASC),
    CONSTRAINT mar_fab
        FOREIGN KEY (id_fabricante)
        REFERENCES fabricante (id_fabricante)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
)
ENGINE=InnoDB;
-- cerveza
CREATE TABLE IF NOT EXISTS cerveza
(
    id_cerveza INT NOT NULL AUTO_INCREMENT,
    cer_nombre VARCHAR(30) NOT NULL,
    cer_graduacion FLOAT NOT NULL,
    id_marca INT NOT NULL,
    PRIMARY KEY (id_cerveza),
    INDEX cer_mar(id_marca ASC),
    CONSTRAINT
        FOREIGN KEY (id_marca)
        REFERENCES marca(id_marca)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
)
ENGINE=InnoDB;

-- lote
CREATE TABLE IF NOT EXISTS lote
(
  id_lote INT NOT NULL AUTO_INCREMENT,
  id_cerveza INT NOT NULL,
  lot_fecha_prod DATE NOT NULL,
  lot_fecha_cadu DATE NOT NULL,
  lot_cantidad INT NOT NULL,
  PRIMARY KEY (id_lote),
  INDEX lot_cer (id_cerveza ASC),
  CONSTRAINT lot_cer
   	FOREIGN KEY (id_cerveza)
    	REFERENCES cerveza (id_cerveza)
    	ON DELETE NO ACTION
    	ON UPDATE CASCADE
)
ENGINE = InnoDB; 

-- presentación
CREATE TABLE IF NOT EXISTS presentacion
(
  id_presentacion INT NOT NULL AUTO_INCREMENT,
  id_cerveza INT NOT NULL,
  pre_descripcion VARCHAR(50) NOT NULL,
  pre_tipo_envase VARCHAR(50) NOT NULL,
  pre_capacidad INT NOT NULL,
  INDEX pre_cer (id_cerveza ASC), 
  PRIMARY KEY (id_presentacion),
  CONSTRAINT pre_cer
   	FOREIGN KEY (id_cerveza)
    	REFERENCES cerveza (id_cerveza)
    	ON DELETE NO ACTION
    	ON UPDATE CASCADE
)
ENGINE = InnoDB;

-- pedido
CREATE TABLE IF NOT EXISTS pedido
(
  id_pedido INT NOT NULL AUTO_INCREMENT,
  id_presentacion INT NOT NULL,
  id_expendio INT NOT NULL,
  ped_cantidad INT NOT NULL,
  ped_fecha_orden DATE NOT NULL,
  ped_fecha_despacho DATE NOT NULL,
  ped_total DOUBLE NOT NULL,
  ped_subtotal DOUBLE NOT NULL,
  ped_iva DOUBLE NOT NULL,
  INDEX ped_pre(id_presentacion ASC),
  INDEX ped_exp(id_expendio ASC),
  PRIMARY KEY (id_pedido),
  CONSTRAINT ped_pre
   	FOREIGN KEY (id_presentacion)
    	REFERENCES presentacion (id_presentacion)
    	ON DELETE NO ACTION
    	ON UPDATE CASCADE,
  CONSTRAINT ped_exp
   	FOREIGN KEY (id_expendio)
    	REFERENCES expendio (id_expendio)
    	ON DELETE NO ACTION
    	ON UPDATE CASCADE
)
ENGINE = InnoDB;


-- almacén
CREATE TABLE IF NOT EXISTS almacen
(
    id_almacen INT NOT NULL AUTO_INCREMENT,
    alma_existencia INT NOT NULL,
    alma_capacidad INT NOT NULL,  
    id_presentacion INT NOT NULL,
    id_expendio INT NOT NULL,
    PRIMARY KEY (id_almacen),  
    INDEX alm_pres (id_presentacion ASC),
    INDEX alm_ex (id_expendio ASC),
    CONSTRAINT alm_pres
        FOREIGN KEY (id_presentacion)
        REFERENCES presentacion(id_presentacion)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT alm_ex
        FOREIGN KEY (id_expendio)
        REFERENCES expendio(id_expendio)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
)
ENGINE = InnoDB;

-- venta
CREATE TABLE IF NOT EXISTS venta
(
  id_venta INT NOT NULL AUTO_INCREMENT,
  vent_precioU INT NOT NULL,
  vent_cantidad INT NOT NULL,
  vent_fecha DATE NOT NULL,
  id_expendio INT NOT NULL,
  id_presentacion INT NOT NULL,
  PRIMARY KEY (id_venta),
  INDEX ven_ex (id_expendio ASC),
  INDEX ven_pres (id_presentacion ASC),
  CONSTRAINT ven_ex
        FOREIGN KEY (id_expendio)
        REFERENCES expendio(id_expendio)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,  
  CONSTRAINT ven_pres
       FOREIGN KEY (id_presentacion)
       REFERENCES presentacion(id_presentacion)
       ON DELETE RESTRICT
       ON UPDATE CASCADE  
)
ENGINE = InnoDB;


-- recetas
CREATE TABLE  IF NOT EXISTS receta
(
  id_receta INT NOT NULL AUTO_INCREMENT,
  procedimiento VARCHAR(100) NOT NULL,
  id_grano INT NOT NULL,
  id_cerveza INT NOT NULL,
  PRIMARY KEY (id_receta),
  INDEX rec_gra ( id_grano  ASC),
  INDEX rec_cer( id_cerveza ASC),
  CONSTRAINT rec_gra
     FOREIGN KEY (id_grano) 
     REFERENCES grano(id_grano),
CONSTRAINT rec_cer
  FOREIGN KEY (id_cerveza) 
   REFERENCES cerveza(id_cerveza)
   ON DELETE RESTRICT
    ON UPDATE CASCADE
)
ENGINE = InnoDB;