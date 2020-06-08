USE restdb;
create table restaurant (
                         id int NOT NULL AUTO_INCREMENT,
                         name varchar(100),
                         address  varchar(100),
                         specialty varchar(100),
                         latitude decimal(10, 8),
                         longitude decimal(11, 8),
                         notes varchar(1000),
                         PRIMARY KEY (id)
);