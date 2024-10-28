CREATE TABLE produto(
	id 			UUID				PRIMARY KEY,
	nome 		varchar(250)		NOT NULL,
	preco		NUMERIC(10,2)		NOT NULL,
	quantidade	INT					NOT NULL
	

);

SELECT 8 FROM PRODUTO