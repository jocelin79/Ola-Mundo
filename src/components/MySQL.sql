CREATE TABLE pessoas (
	id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
	nome VARCHAR(20), NOT NULL,
	nascimento DATE
);

INSERT INTO pessoas (nome, nascimento) VALUES ('Nathally', '1990 05 22');

SELECT * FROM 'pessoa';
SELECT nome FROM 'pessoa';

UPDATE pessoa SET nome = 'Nathally Souza' WHERE id = 2;

UPDATE pessoa SET nome = 'Marcela' WHERE id = 3;

UPDATE pessoa SET nome = 'Flávio' WHERE id = 5;

DELETE FROM pessoa WHERE id=5;

SELECT * FROM pessoa ORDER BY nome;

SELECT * FROM pessoa ORDER BY DESC

UPDATE pessoa SET genero = 'F' WHERE id=1;

UPDATE pessoa SET genero = 'M' WHERE id = 2;

SELECT COUNT(id), genero FROM pessoa GROUP BY genero;

INSERT INTO pessoa (nome, nascimento, genero) VALUES ('Paula', '1998 10 22', 'F');

