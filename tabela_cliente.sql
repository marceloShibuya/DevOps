/*drop table tb_cliente cascade constraints*/

CREATE TABLE TB_CLIENTE ( 
     cd_cliente          NUMBER(6)      NOT NULL,
     nm_nome             VARCHAR2(30)   NOT NULL,
     nr_cpf              VARCHAR2(30)   NOT NULL,
     ds_senha            VARCHAR2(20)   NOT NULL
     );
    
ALTER TABLE TB_CLIENTE
    ADD CONSTRAINT PK_TB_CLIENTE PRIMARY KEY (cd_cliente);
    
ALTER TABLE TB_CLIENTE
    ADD CONSTRAINT UN_TB_CLIENTE_CPF UNIQUE (nr_cpf);

COMMIT