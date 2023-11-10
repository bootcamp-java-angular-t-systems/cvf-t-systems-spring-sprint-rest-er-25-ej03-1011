-- Inserts para la tabla "almacenes"
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen1', 100);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen2', 150);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen3', 200);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen4', 120);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen5', 180);

-- Inserts para la tabla "cajas"
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('A123', 'Objetos1', 50, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('B456', 'Objetos2', 75, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('C789', 'Objetos3', 100, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('D101', 'Objetos4', 30, 4);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('E202', 'Objetos5', 90, 5);
