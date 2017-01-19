# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table message (
  id                            bigint,
  mensagem                      varchar(255),
  usuario_id                    bigint
);

create table user (
  id                            bigserial not null,
  senha                         varchar(255),
  nome                          varchar(255),
  conectado                     boolean,
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists message cascade;

drop table if exists user cascade;

