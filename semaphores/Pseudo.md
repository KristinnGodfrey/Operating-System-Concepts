---
tags: [Stýrikerfi]
title: Assignment 13
created: '2020-03-03T13:37:20.196Z'
modified: '2020-03-03T14:24:23.098Z'
---

# Assignment 13

Use semaphores to solve the following synchronisation problem of a young family consisting
of a mother, father, and two twin children (having the same behaviour): their day starts with
each of them going to toilet first (useToilet()). The order of going to toilet is arbitrary
and only one toilet exists. After the father has used the toilet, he prepares a drink for the
children (prepareDrinks()); after the mother has used the toilet, she prepares food for the
children (prepareFood()). If both food and drink are ready, the children have breakfast
(haveBreakfast() – mother and father are so busy with the kids that they do not have
breakfast themselves). Once the children have finished breakfast, the mother takes the child
and drives the child to school (takeAndDriveToSchool()) and the father clears the table
(clearTable()). Each process finishes behaviour after these steps

![sema](Screenshots/sema.png)

## Solution

```
Semaphore toilet = new Semaphore(1);
Semaphore breakfast = new Semaphore(2);
Semaphore drinks = new Semaphore(1);
Semaphore food = new Semaphore(1);

child() {
    toilet.wait();     
    useBathroom();
    toilet.signal();


    drinks.wait();
    food.wait();
    haveBreakfast();
    breakfast.signal();           
}

mother() {
    toilet.wait();
    useBathroom();
    toilet.signal();            

    prepareFood();
    food.signal();            

    breakfast.wait();
    takeAndDriveToSchool();
}

father() {      
    toilet.wait();      
    useBathroom();   
    toilet.signal();


    prepareDrinks();
    drinks.signal();

    breakfast.wait();
    clearTable();      
}
```
