# Java Fundamentals: Inheritance Lab

## Purpose and Overview

## Feature Tasks and Status

### Restaurant Class

[X] Create a Restaurant Class with constructor and props 'name', 'stars', and 'cost', and a toString method.    
[X] Create unittests to verify constructor is behaving correctly.  
[X] Create unittests to verify toString override method is working as expected.  

### Review Class

[X] Create a Review CLass with a constructor and props 'body', 'author', and 'stars', and a toString method.  
[X] Create unittests to verify constructor is working properly.  
[X] Create unittests to verify toString override method is working as expected.  

### Interaction and Refactoring

[X] A Review should be about a single Restaurant => Implement a solution for this based on the following questions:  

> Should a Review know which Restaurant it is about? Yes
> Should a Restaurant know which Reviews are about it? Yes they should be related

> Is a Restaurant a special type of Review? Vice Versa? No, neither

[X] Update toString and constructor methods appropriately.  
[X] Update unittests to reflect the refactorings completed above.  

### Instance Methods

[X] Add an instance method 'addReview' to the Restaurant class, that takes in a Review type parameter and adds it to the Restaurant instance.  
[X] Add unittests to ensure the method addReview works by creating an association between Restaurant and Review.  

### Associating Reviews

[X] A Restaurant's star rating should change when a review is associated with a Restaurant, via the addReview method.  
[X] Add unittests to verify proper functionality

### Stretch Goals

[ ] Some Restaurants are part of a chain. Implement a means to associate all chain restaurants e.g. McDonald's, and add unittests to verify functionality.  
[ ] Add an updateStarts method to the Review class to update stars *for that review* and, if the Review is associated with a Restaurant the stars for *that restaurant* are updated.
[ ] Refactor your code and get rid of that instance variable for stars and instead make it an instance *method* that calcualtes a restaraunt's star rating on the fly when called.  
[ ] Create another class for User, as in Author of a Review, and limit each User to a single review per Restaurant.  

## Library Architecture

This is a very simple Java Library with 2 Classes: Restaurant; Review.  

![Restaurant and Review Package Architecture](res/Restaurant-Review-Package-Model.jpg);

Restaurant Class is:

- A concrete Class with various members
- A constructor with parameters for initializing an object instance
- Properties name, stars, and priceCategory
- An instance method to add a Review

Review Class is:

- A concrete Class with various members
- A constructor with parameters for initializing an object instance
- Properties for body (review text), author (review Author), and starRating (Ratings Stars of the review)

Both Classes have overridden toString() methods that will return informative state text to the calling method.  

When a Restaurant instance is added, ensure a Name and Price Category is included in the constructor.  
When creating Reviews, ensure the Author Name, Review Body, and Stars Rating (whole number) are included.  

When a Review is added to a Restaurant, the Star Rating will update automatically.

## Build and Test

Install Gradle for your platform.  
Run `./gradlew test` from the Terminal to test the Package from the Package Root directory.  

## Footer

TBD

