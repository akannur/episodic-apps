How i work?

Server Start: gradle bootrun
Test Cases: gradle test


SQL:

Local:
Creating DB: mysql -uroot -e "create database episodic_shows"
Migration using flyway: gradle flywayMigrate

Prod:
cf env app-name
gradle flywayMigrate -Dflyway.url="jdbc:mysql://us-cdbr-iron-east-03.cleardb.net/ad_9746d3bdfa939bd?user=bbaebb720ae18a\u0026password=f1529b80" -Dflyway.user="bbaebb720ae18a" -Dflyway.password="f1529b80"