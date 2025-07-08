Importance of @Transactional Annotation in Spring
The @Transactional annotation is used in Spring to manage transactions automatically when working with databases.

Why it is important:
Manages Transactions Automatically:

When @Transactional is applied to a method, Spring automatically starts a transaction before the method runs.

If the method completes successfully, the transaction is committed.

If any exception occurs, the transaction is rolled back.

Maintains Data Integrity:

Ensures that a group of operations either all succeed or all fail, preventing partial updates in the database.

Hibernate Session Management:

Spring takes care of opening and closing the Hibernate session during the transaction.

You don’t need to manage the session manually.

Clean and Simple Code:

Reduces the need for manual transaction handling code.

Promotes the separation of business logic and transaction management.
Example:
java
Copy code
@Transactional
public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
Optional<Country> result = countryRepository.findById(countryCode);
if (!result.isPresent()) {
throw new CountryNotFoundException("Country not found");
}
return result.get();
}
In the above method:

The @Transactional annotation makes sure that any interaction with the database happens within a transaction.

If the Country is not found and an exception is thrown, any pending database changes will be rolled back.
