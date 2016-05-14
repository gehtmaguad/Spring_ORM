# Spring_ORM
Simple Spring ORM Example with MySQL comparing Hibernate, JPA and JDO Mappers.

This is an example of how to use different ORM Mappers.
Dependencies are managed through Maven.

It assumes you have a MySQL database running on localhost,
which can be accessed through user root and password spring.

A Person Object is stored in the databse for all three examples (Hibernate, JPA, JDO)
The database is named CBSLAB3 and the table has the following layout:

```
mysql> use CBSLAB3;                                                                                                            Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> 
mysql> describe Person;  
+--------------+--------------+------+-----+---------+----------------+
| Field        | Type         | Null | Key | Default | Extra          |
+--------------+--------------+------+-----+---------+----------------+
| id           | int(11)      | NO   | PRI | NULL    | auto_increment |
| age          | int(11)      | NO   |     | NULL    |                |
| firstname    | varchar(255) | YES  |     | NULL    |                |
| phone_number | int(11)      | NO   |     | NULL    |                |
| surname      | varchar(255) | YES  |     | NULL    |                |
+--------------+--------------+------+-----+---------+----------------+
5 rows in set (0,00 sec)
```
In case of JDO one has to enhance the Person class manually before persisting it. 
That can be achieved on the command line with the following two commands in the root directory of the JDO example:
```
markus@ubuntu:~/SpringORM/CBS_JDO$ export CLASSPATH=target/classes:lib/datanucleus-enhancer-3.0.1.jar:lib/datanucleus-core-3.0.10.jar:lib/datanucleus-api-jdo-3.0.7.jar:lib/jdo-api-3.1-SNAPSHOT-20110926.jar:lib/asm-3.3.jar

markus@ubuntu:~/SpringORM/CBS_JDO$ java -cp target/classes:$CLASSPATH org.datanucleus.enhancer.DataNucleusEnhancer target/classes/model/*.class
```
