# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table article (
  id                        integer not null,
  title                     varchar(20) not null,
  content                   clob not null,
  constraint pk_article primary key (id))
;

create table tag (
  id                        integer not null,
  name                      varchar(20) not null,
  description               varchar(100),
  user_id                   integer,
  constraint pk_tag primary key (id))
;

create table user (
  id                        integer not null,
  name                      varchar(100) not null,
  email                     varchar(100) not null,
  password                  varchar(100) not null,
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;

create sequence article_seq;

create sequence tag_seq;

create sequence user_seq;

alter table tag add constraint fk_tag_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_tag_user_1 on tag (user_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists article;

drop table if exists tag;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists article_seq;

drop sequence if exists tag_seq;

drop sequence if exists user_seq;

