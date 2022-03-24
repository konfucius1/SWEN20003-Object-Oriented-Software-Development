## Introduction

Four basic concepts of programming languages:

* Calculation: constants, variables, operators, expressions

* Selection: if-else, switch, etc.

* Iteration: while, do, for

* **Abstraction:** The process of creating self-contained units of software that allows the solution to be parameterised and therefore more general purpose

*This is where Object-Oriented Programming is different to functional programming*

In OOP, abstraction is not functions. 

## Abstraction in Object Oriented Languages

Abstraction in OO is provided through an Abstract Data Type - which contains *data* and *functions* that operate on data. 

In Java, a **Class** is an implementation on an **ADT**

*Time to unlearn what you learned from foc and foa!*

## Classes

* A ‘generalisation’ of a real world entity

  * A physical real world thing (student or book)

  * An abstract real world thing (university subject)

  * An even more abstract thing like a list or a string (data)

* Represents a template for things that have common properties

* Contains ***attributes*** and ***methods***

* Defines a new **data type**

> **Class:** Fundamental unit of abstraction in OOP. Blueprint for something that exists which has **attributes** and **methods**

## Objects

* Object is an ***instance*** of a class

* Contain **state** - values given to the attribute, or dynamic information

* “X is of type A” == “X is an object of class A” == “X is an instance of the class A”

> **Object**: A specific, concrete example of a class
>
> **Instance**: An object that exists in your code

## Applications

1. Highlight the nouns are they are the classes that starts the application

2. Identify entities == classes

3. Identify attributes and methods of each class

4. Identify methods (not a function) but are operations

## Object Oriented Features

Key features of OO design paradigm:

* **Data Abstraction**: the technique of creating new data types that are well suited to an application by defining new classes.

* **Encapsulation**: the ability to group data (attributes) and methods that manipulate the data to a single entity though defining a class.

## Defining a Class

Syntax:

```java
<visibility modifier> class <ClassName> {
    <attribute declarations>
    // <visibility modifier> <type> <variable name>;
    
    <method declarations>
    // <visibility modifier> <void or typeReturned> myMethod(paramList) 
    //{
    //    variable declarations
    //    statements
    //}
}
```

### Attributes

* Attributes are known as **instance variables** 

* They are not local variables because local variables cannot maintain state

### Method

* If the method returns data, the data type must be specified in the method definition, otherwise, it is defined a **`void`**

* If the method returns data, the method body must contain a return statement, which returns a variable of the specified return type.

* Variables can be declared inside the method - *local variables*

A bare bone class:

```java
// Circle.java - Circle class definition
public class Circle {
    public double centreX; // centre x coordinate
    public double centreY; // centre y coordinate
    public double radius; // radius   
    
    public double computeCircumference () {
        double circum = 2 * Math.PI * radius;
        return circum;
    }
    
    public double computeArea () {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    // this is changing the state of the object
    public void resize (double factor) {
        radius = radius * factor;
    }
}
```

## Classes: behind the scenes

From example above.

1. Create a file Circle.java and write the code \*the file name should match the class name

2. Compile the class using the command `javac Circle.java` this creates a file `Circle.class`

3. Circle becomes a derived data type that be used in a Java program.

## Using the Circle class

Previously creating the Circle class, we have created a new data type Circle - **Data Abstraction**

* Variables of type Circle can be now defined in a program

* Circle is a **Derived Data Type** (as opposed to a Primitive Data Type such int, float)

```java
// CircleTest.java: A test program to test the Circle class
public class CircleTest {
    public static void main(String args[]) {
        // Only initialised reference to Circle objects
        // think of this as pointer variable that points to nothing 
        // Null reference
        Circle circleA;
        Circle circleB;
    }
}
```

## The null Reference

> null: The Java keyword for “no object here”. Null objects can’t be “accessed” to get variables or methods, or used in any way.

## Instantiating a Class

Objects are **null** until they are ***instantiated\*.***

\* To create an object of class

`        Circle circlA = new Circle();`

> new: Directs to JVM to allocate memory for an object

## Creating Objects

```java
// CircleTest.java: A test program to test the Circle class
public class CircleTest {
    public static void main(String args[]) {
        // Only initialised reference to Circle objects
        // think of this as pointer variable that points to nothing 
        // Null reference
        Circle circleA, circleB;
        circleA = new Circle();
        circleB = new Circle();
        
    }
}
```

No need to worry about memory leaks or garbage values because of Java Automatic Garbage Collection. Automatically frees the memory of unused objects, but may slow program down a bit. 

## Using Instance Variables and Methods

Syntax:

```java
    <objectName>.<variableName>;
    <objectName>.<methodName>(<arguments>); 
```

Example:

```java
        Circle circleA = new Circle();
        double area;
        
        // Initialise centre and radius
        circleA.centreX = 2.0;
        circleA.centreY = 2.0;
        circleA.radius = 1.0;
        
        // Invoking methods or sending a "message" to methods
        area = circleA.computeArea();
        aCircle.resize(2.0);
```