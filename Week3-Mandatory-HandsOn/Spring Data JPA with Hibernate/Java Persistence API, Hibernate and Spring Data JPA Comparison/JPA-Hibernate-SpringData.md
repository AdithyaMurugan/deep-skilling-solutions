Java Persistence API (JPA) :
Definition:
JPA is a specification (like a rulebook) provided by Java for Object-Relational Mapping (ORM). It defines standard annotations and interfaces for mapping Java classes to database tables.

Key point:
JPA does not implement the functionality—it just provides the blueprint.

Example:
If you define an entity like this using JPA:

java
Copy code
@Entity
public class Student {
@Id
private int id;
private String name;
}
It just describes what a persistent entity should look like. To actually save this object to the database, you need a provider like Hibernate.

Hibernate :
Definition:
Hibernate is the most popular implementation of JPA. It provides the actual logic to map, store, update, and query data in the database using Java objects.

Extra Features:
Besides implementing JPA, Hibernate adds powerful features like:

Lazy/eager loading

Caching

Dirty checking

Native SQL support

Example:
Once you write your entity using JPA, Hibernate takes care of SQL generation behind the scenes:

java
Copy code
Session session = sessionFactory.openSession();
session.beginTransaction();
session.save(student); // Hibernate converts this to INSERT query
session.getTransaction().commit();
So Hibernate handles the actual DB operations.

Spring Data JPA :
Definition:
Spring Data JPA is a Spring framework project built on top of JPA (and usually Hibernate). It helps you create repositories with no boilerplate code by just writing interfaces.

Main Feature:
You can write just an interface like this:

java
Copy code
public interface StudentRepository extends JpaRepository<Student, Integer> {
List<Student> findByName(String name);
}
And Spring Data JPA auto-generates the implementation and SQL queries at runtime!

Example:
No need to write INSERT, SELECT, etc. Spring Boot + Spring Data JPA can save and retrieve objects just by calling repository.save() or repository.findAll().
