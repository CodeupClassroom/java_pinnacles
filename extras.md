# IO exercises
## Pizza order

Create a pizza order CLI (Command Line Interface) app using the users input fro the terminal.

- Ask for the size of the pizza, show them at least 3 options, each size will have a different price.
- Ask for the type of pizza, show at least 5 options.
- Ask for any extras, ask for at least 5 options. Each extra will cost $1.50 USD. Ask for 3 at least, since we don't know loops at this point we have to ask 3 times.
- At the end ask for the users info like name, address, phone number and calculate the final price  (Make it look like a ticket). Use the proper data type for each variable that you need to create for your app.

# Methods exercises

All the exercises should use a method for asking the users input in order to avoid copying and pasting the Scanner declaration and usage.

## The average

Write a Java method to compute the average of n numbers, ask for how many numbers to the user first and then for the n numbers. For this example is 3.
   - Input the first number: 100 
   - Input the second number: 200
   - Input the third number: 34
   
Expected Output:
```   
   The average value is 111.33
```

## The Matrix

Write a Java method (takes a number n as input) to displays an n-by-n matrix, don't use Arrays we don't need them yet. You can randomize the values (0, 1) they don't have a specific order.

```
Input a number: 15 
                                  
 1 0 1 0 0 1 1 1 0 1 1 0 1 0 0                            
 0 0 0 1 1 1 0 0 1 1 1 0 1 1 1                            
 1 1 1 1 0 0 1 1 1 1 1 0 0 0 1                            
 0 0 0 1 1 0 1 1 1 0 1 1 1 1 1                            
 0 1 1 0 0 1 1 1 1 1 0 0 1 0 0                            
 1 0 1 0 1 1 1 0 1 0 0 1 1 0 1                            
 1 1 0 1 1 0 1 1 1 1 1 0 1 1 0                            
 0 0 1 1 0 1 0 0 1 0 1 1 0 0 0                            
 1 1 0 1 0 1 0 1 1 1 0 0 1 0 0                            
 0 0 1 0 1 1 1 1 1 0 1 0 1 0 0                            
 0 0 1 1 1 0 0 1 1 1 0 1 0 0 0                            
 1 1 0 0 0 0 1 1 1 1 0 0 0 0 0                            
 0 0 1 1 0 1 0 1 0 1 1 0 1 1 1                            
 0 1 0 1 1 0 1 1 1 0 1 0 1 0 0                            
 1 0 1 1 1 0 1 1 1 0 0 0 0 1 0 
 ```
 ## Funny Java1.Strings
 
 Ask the user for a string with a minimum of 10 characters and a number between 1 and 5. 
 
 Switch the char of the string in the position of the number you asked to the opposite case, either to uppercase or to lowercase. For instance, if your string is 9 characters long, and your number is 2, you should replace characters 2, 4, 6, and 8.
 
 For example this inputs:
 
 - Codeup Rocks!
 - 2
 
 Output:
 ```
 COdEuP roCkS!
 ```
 Example 2:
  - 600 Navarro Street 
  - 3
  
  Output:
  ```
  600 NAvaRro StReeT
  ```
  
## ArrayList extra exercise
  
Using the classes `src/Java1/Product.java`, `src/Java1/Receipt.java` and
`src/Store.java`, we will do some refactoring in `Receipt` to use an `ArrayList` instead of 
the `string` that represents the receipt lines.
  
1. Refactor the `Receipt` class to convert the attribute `lines` to an `ArrayList` of products
   (use a generic collection).
3. Initialize the `ArrayList` in the class constructor.
4. The method `addLine` should only add the product to the `ArrayList` and update its total.
5. Create a new `private` method `formatLines` that returns a `String`. 
   Within that method iterate over your products, and create a string with
   the same format we were using before the refactoring.
6. Call this new method from the existing method `print`
7. Confirm that everything works as expected.
