# SQL-CRUD-Example
CRUD MySQL Example using Java Server Faces

MAKE SURE CONNECTOR/J JAR FILE IS IN /OPT/TOMEE/LIB/

wget https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-java-8.0.20.tar.gz

database: MOMandPOPvideo

create table inventory (
product_id varchar(255) not null,
movie_id varchar(255),
format varchar(255),
price double(6,2),	
distributor varchar(255),
dist_sn varchar(255),
dist_id varchar(255),
date_last_rental date,
date_last_returned date,
primary key (product_id)
)

create table movie_info (
movie_id varchar(255),
title varchar(255),
category varchar(255),
running_length int(10),
year_released year,
rating varchar(255),
director varchar(255),
actor_list varchar(255),
academy_awards varchar(255),
primary key (movie_id))
				{awd_type(movie|actor|director),year}	

table: customers
customer_id			varchar(255),
firstname			varchar
lastname			varchar
address				varchar
zipcode				int
telephone			int
movies_rented		pairs			{product_id,date_rented}

Main Pages:

- listusers.xhtml
- insertuser.xhtml
- deleteuser.xhtml
- updateuser.xhtml

Component Templates:

- header
- menu
- content
- footer
