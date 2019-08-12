# SCHOOL APP - SPRING MVC

```
Develop the sample web application for managed students and courses of University using SPRING MVC.
```

## Method

> First, clone or download the source code from github

> Then, import the `my_school_db.sql` script to MySQL 

> Then, go to the `spring-servlet.xml`, change your database configuration

```
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
	<property name="driverClassName" value="com.mysql.jdbc.Driver" />
	<property name="url" value="jdbc:mysql://localhost:3306/my_school_db" />
	<property name="username" value="root" />
	<property name="password" value="" />
</bean>
```

> Finally, run the application on `Apache Tomcat Server` :+1:.

## Screenshots

![Shot1](Screenshots/1.png)

![Shot2](Screenshots/2.png)

![Shot3](Screenshots/3.png)

![Shot4](Screenshots/4.png)

![Shot5](Screenshots/5.png)

![Shot6](Screenshots/6.png)