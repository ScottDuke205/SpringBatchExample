# SpringBatchExample
Spring Batch in Spring Boot | CSV to Database | Tech Primers


This is an updated version of:
1. GitHub: https://github.com/TechPrimers/spring-batch-example-1
2. YouTube: https://www.youtube.com/watch?v=1XEX-u12i0A

Built using:
1. Intellij Idea: v2021.2
2. Spring Framework: v2.5.0
3. Lombok
4. Gradle
5. Java 16

Changes:
1. SpringBatchConfig.java - Fixed the itemReader method. Using ClassPathResource rather than Rsource.
2. User.java - uses Lombok to handle getters, setters and toString().
3. application.properties
   a. Added the H2 database definitions to matched the ones shown in the video.
   b. Chanded input=file:users.csv to input=users.csv.
   
These are the SQL scripts shown in the video.

select * from user;

select * from batch_job_execution;
select * from batch_job_execution_context;

select * from batch_step_execution;
select * from batch_step_execution_context;
