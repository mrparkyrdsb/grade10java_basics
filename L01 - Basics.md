# Java Basics Lesson 1

## Our Basic Java Program Boilerplate

```java
// Inside Main.java
class Main {
    public static void main(String[] args) {
        // Your java code goes here.
    }
}
```
### Boilerplate
> Boilerplate code, also known as __boilerplate__, is the part of code that has to be repeatedly in use with no or a little modification.

### How To Use Our Boilerplate
1. For every replit program we create, we will be coding inside our ```Main.java``` file.
2. You can copy the boilerplate to help you start your code.
3. Do not modify any code given in the boilerplate, only code in the section under _"your java code goes here."_
4. After you have programmed, you can ```run``` your code by clicking the run button at top.

### Our First Java Program
```java
// Inside Main.java
class Main {
    public static void main(String[] args) {
        // Your java code goes here.
        System.out.println("Hello, World!");
    }
}
```
This program is written in Java to output the message ```Hello, World!``` into the [console](https://jupyterlab.readthedocs.io/en/stable/user/code_console.html).

```java
System.out.println("Hello, World!");
```
The code above is a way to output a text message to the program's console.

#### Key Points for Programming Java.
1. _Capitalization Matters:_ ```System != system```
2. _Indentations Matter:_ It should be __4 spaces per indentation__ and it should be consistent for all indentations in your code.
```java
// GOOD:
public static void main(String[] args) {
    // Your java code goes here.
    System.out.println("Hello, World!");
}
// BAD:
public static void main(String[] args) {
  // Your java code goes here.
 System.out.println("Hello, World!");
}
```
3. Most lines in Java ends with a semicolon ```;```.
4. Spelling matters: ```println vs. printn```
5. The label after ```class``` should be the same as the file's name

## [Curiculum Document Reference](https://www.edu.gov.on.ca/eng/curriculum/secondary/computer10to12_2008.pdf)
- __B1.1:__ use correct terminology to describe programming concepts
- __B3.1:__ write clear and maintainable code using proper programming standards
