INSERT into produto (id, NOME, CODIGO, DESCRICAO, IMAGEM, CODIGO_BARRAS) values (1,'RELOGIO','FF453677','DIGITAL','/src/g.jpg','19BBY');
INSERT into produto (id, NOME, CODIGO, DESCRICAO, IMAGEM, CODIGO_BARRAS) values (2,'COMPUTADOR','FF453677','LAPTOP','/src/g.jpg','19BBY');

INSERT into Unidade (id, NOME, idProduto) values (1,'TEMPO',1);
INSERT into Unidade (id, NOME, idProduto) values (2,'PESO',2);

INSERT into CARACTERISTICA (id, DESCRICAO, idProduto) values (1,'BLACK',1);
INSERT into CARACTERISTICA (id, DESCRICAO, idProduto) values (2,'GREY',2);