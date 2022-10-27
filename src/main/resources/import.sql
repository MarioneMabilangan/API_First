INSERT INTO GRUPO(GRUPO) VALUES('DAM');
INSERT INTO GRUPO(GRUPO) VALUES('DAM2');
INSERT INTO GRUPO(GRUPO) VALUES('DAW');

INSERT INTO CURSOS(CURS,GRUPS_CURS,AULA) VALUES('Grau Superior', 'DAM2', 'Dibuix');
INSERT INTO CURSOS(CURS,GRUPS_CURS,AULA) VALUES('Grau Superior', 'ASIX2', 'A.43');
INSERT INTO CURSOS(CURS,GRUPS_CURS,AULA) VALUES('Grau Superior', 'DAW2', 'A46');

INSERT INTO ALUMNE(nom, cognoms, email, grupo_id) VALUES('Marione', 'Basaysay Mabilangan', 'mbasaysa@jaumebalmes.net', 2);
INSERT INTO ALUMNE(nom, cognoms, email, grupo_id) VALUES('Jesus', 'Cristo', 'jcristo@jaumebalmes.net', 3);
INSERT INTO ALUMNE(nom, cognoms, email, grupo_id) VALUES('Jose', 'Ricardo', 'jfrancis@jaumebalmes.net', 2);

INSERT INTO CUANDO(ENTRADA, SALIDA, ALUMNE_ID, AULA_ID) VALUES('15:30:01','21:00:01','1','1');
INSERT INTO CUANDO(ENTRADA, SALIDA, ALUMNE_ID, AULA_ID) VALUES('15:30:01','21:00:01','2','1');
INSERT INTO CUANDO(ENTRADA, SALIDA, ALUMNE_ID, AULA_ID) VALUES('15:30:01','21:00:01','3','3');