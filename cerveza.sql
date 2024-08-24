CREATE DATABASE IF NOT EXISTS cervezas ;
use cervezas ;

-- grano
CREATE TABLE IF NOT EXISTS grano (
    id_grano INT NOT NULL AUTO_INCREMENT,
    gra_nombre VARCHAR(15) NOT NULL,
    gra_procedencia VARCHAR (25) NOT NULL,
    PRIMARY KEY (id_grano))
ENGINE = InnoDB ;

-- sede
CREATE TABLE IF NOT EXISTS sede (
    id_sede INT NOT NULL AUTO_INCREMENT,
    sed_nombre VARCHAR (20) NOT NULL,
    sed_telefono INT NOT NULL,
    sed_tipo VARCHAR (15) NOT NULL,
    sed_estado VARCHAR (10) NOT NULL,
    sed_ubicacion VARCHAR (100) NOT NULL,
    PRIMARY KEY (id_sede))
ENIGNE = InnoDB ;

-- expendio
CREATE TABLE IF NOT EXISTS expendio (
    id_expendio INT NOT NULL AUTO_INCREMENT,
    exp_nombre VARCHAR (15) NOT NULL,
    exp_rfc INT NOT NULL,
    exp_ubicacion VARCHAR (100) NOT NULL,
    PRIMARY KEY (id_expendio)
    UNIQUE (exp_rfc))
ENGINE = InnoDB ;

-- fabricante
CREATE TABLE IF NOT EXISTS fabricante(
    id_fabricante INT NOT NULL AUTO_INCREMENT,
    fab_nombre VARCHAR(40) NOT NULL,
    id_sede INT NOT NULL,
    PRIMARY KEY (id_fabricante),
    INDEX fab_sed (id_sede ASC)
    CONSTRAINT fab_sed
        FOREIGN KEY (id_sede)
        REFERENCES sede (id_sede)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
)
ENGINE=InnoDB;

-- marca
CREATE TABLE IF NOT EXISTS marca(
    id_marca INT NOT NULL AUTO_INCREMENT,
    mar_nombre VARCHAR(50) NOT NULL,
    id_fabricante INT NOT NULL,
    PRIMARY KEY (id_marca),
    INDEX mar_fab(id_fabricante ASC)
    CONSTRAINT mar_fab
        FOREIGN KEY (id_fabricante)
        REFERENCES fabricante (id_fabricante)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);
ENGINE=InnoDB;
-- cerveza
CREATE TABLE IF NOT EXISTS cerveza
(
    id_cerveza INT NOT NULL AUTO_INCREMENT,
    cer_nombre VARCHAR(30) NOT NULL,
    cer_graduacion FLOAT NOT NULL,
    id_marca INT NOT NULL,
    PRIMARY KEY (id_cerveza),
    INDEX cer_mar(id_marca ASC)
    CONSTRAINT
        FOREIGN KEY (id_marca)
        REFERENCES marca(id_marca)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);
ENGINE=InnoDB;