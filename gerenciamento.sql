drop database gerenciamento;
create database gerenciamento;

use gerenciamento;

create table ordemServico(OS varchar(100), dataa date, situacao varchar(30), solicitante varchar(80), area varchar(50));

create table dadosCliente(Nome varchar(50), telefone int, 
endereco varchar(100), bairro varchar(50), cidade varchar(50), 
uf varchar(50), cep int); 

create table equipamento (equipamentos varchar(50), justificativa varchar(50),
defeito varchar(50), observacoes varchar(50) );


create table servicos(horainicio time, horatermino time, atividade varchar(100),
tecnico varchar(50), tempototal time );

create table loginTecnico(idTecnico int primary key not null auto_increment, nome varchar(80),senha varchar(40));


