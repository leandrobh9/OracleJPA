
create user leandro ;

CREATE TABLESPACE leandro DATAFILE 'leandro' 10M;

-- selecionar os tablespaces do banco
select distinct tablespace_name from user_tables;

-- tablespace padrao (se for criado uma tabela, sera criado nesse tablespace)
-- Se um usu�rio criar um objeto, tal como uma tabela ou um �ndice, sem especificar o tablespace, o Oracle o cria no tablespace padr�o do usu�rio
select default_tablespace from user_users;

-- O tablespace SYSTEM (tablespace de sistema) � uma parte obrigat�ria de todo banco de dados Oracle. � onde o Oracle armazena todas as informa��es necess�rias para o seu pr�prio gerenciamento.
-- SYSTEM � o tablespace mais cr�tico do banco de dados porque ele cont�m o dicion�rio de dados. Se por algum motivo ele se tornar indispon�vel, a inst�ncia do Oracle abortar�. Por esse motivo, o tablespace SYSTEM nunca pode ser colocado offline, ao contr�rio de um tablespace comum como, por exemplo, o tablespace USERS.

-- criacao de um tablespace
CREATE TABLESPACE leandro LOGGING DATAFILE 'D:\TI\BD\Oracle\meu_tablespace.dbf' SIZE 10m AUTOEXTEND ON NEXT 100m EXTENT MANAGEMENT LOCAL;

-- apagar tablespace
drop tablespace leandro;

-- criacao do usuario e sua vinculacao com o tablespace
CREATE USER userleandro IDENTIFIED BY Leandro123 DEFAULT TABLESPACE leandro QUOTA UNLIMITED ON  leandro;

-- autoriza o usuario a logar
GRANT CREATE SESSION TO userleandro;

GRANT CREATE TABLE TO userleandro;


