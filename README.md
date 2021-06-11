# SpringBatchExample
Spring Batch in Spring Boot | CSV to Database | Tech Primers


This is an updated version of:
1. GitHub: https://github.com/TechPrimers/spring-batch-example-1
2. YouTube: https://www.youtube.com/watch?v=1XEX-u12i0A

Built using:
1. Intellij Idea: v2021.2
2. Spring Boot: v2.5.0
3. Spring Batch
4. Lombok
5. Gradle
6. Java 16

Changes:
1. SpringBatchConfig.java - Fixed the itemReader method. Using ClassPathResource rather than Rsource.
2. User.java - uses Lombok to handle getters, setters, toString and constructors.
3. application.properties
   a. Added the H2 database definitions to matched the ones shown in the video.
   b. Chanded input=file:users.csv to input=users.csv.
4. Added column "type" to users.csv in middle to demonstrate skipping of columns not used. ```lineTokenizer.setIncludedFields(new int[]{0, 1, 3, 4});```
   
Access using browser:
1. H2 - localhost:8081/h2-console
2. load data - localhost:8081/load
   
These are the SQL scripts shown in the video.

```
select * from user;

select * from batch_job_execution;
select * from batch_job_execution_context;

select * from batch_step_execution;
select * from batch_step_execution_context;
```
