## Getters, Setters and Constructors

## Getters and Setters

* Initialising/updating/accessing instance variables is done by defining specific methods for each purpose

* These methods are called **Accessor/Mutator** methods or **Getter/Setter** methods

* Initialise/update an instance variable using:

  * `circleA.setX(10.0);    // mutator method or setter`

* Access an instance variable using:

  * `double x = circleA.getX();    // accessor method or getter`

## The Circle Class with Getters and Setters

```java
public class Circle {
    public double centreX, centreY, radius;
    
    public double getCentreX() {
        return centreX;
    }

    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    public double getCentreY() {
        return centreY;
    }

    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
```

## Constructors

`        Circle circleA = new Circle();`

* The right hand side invokes (or calls) a class’ **constructor**

* Constructors are **methods**

* Constructors are used to initialise objects

* Constructors have the same name as as the class

* Constructors cannot return values

* A class can have one or more constructors, each with a different set of parameters (called overloading; tbc)

> **Constructor:** A method used to **create** and **initialise** an object.

## Defining Constructors

```java
public <ClassName>(<arguments>) {
    <block of code to execute>
}
```

Default Circle constructor:

```java
        public class Circle {
            public double centreX, centreY, radius;
            public Circle() {
                centreX = 10.0;
                centreY = 10.0;
                radius = 5.0;
            }
        }
```

## Method Overloading

* Methods have the same name; are distinguished by their signature:

  * number of arguments

  * type of arguments

  * position of arguments

* Any method can be overloaded (Constructors or other methods).

* **Method Overloading:** This is a form of polymorphism (same method - different behaviour)

* *Do not to confuse with Method Overriding* 

> **Polymorphism:** Ability to process objects differently depending on their data type or class.
>
> **Method Overloading:** Ability to define methods with the same name but with different signatures (argument types and/or numbers).

## Introducing the “this” keyword

> **this:** A reference to the calling object, the object that owns/is executing the method.

```java
public class Circle {
    public double centreX, centreY, radius;
    
    public Circle() {
        this.centreX = 10.0;
        this.centreY = 10.0;
        this.radius = 5.0;
    }
    
    public Circle(double centreX, double centreY, double radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
    }
}
```

## Using Static Variables

```java
// CountCircle.java
public class Circle {
    public static int numCircles = 0;
    public double centreX, centreY, radius;

    public Circle(double x, double y, double r) {
        centreX = x; centreY = y; radius = r;
        numCircles++;
    }
}
```

## Using Static Methods

* Static methods can only call other static methods

* Static methods can only access static data

* Static methods cannot refer to Java keywords such as, this or super (will be introduced later) - because they are related to objects (class instances).

* Do not make all methods and attributes in your classes static; if you do that you may end up writing procedural programs using Java as opposed to good OO programs - RIP marks in assessments

***Important:** Before deciding to make an attribute or a method **static**, think carefully - consider whether it is a class level member or an instance specific member.*

## 

## Static Members

> **Static Members:** Methods and attributes that are not specific to any object of the class.
>
> **Static Variables:** A variable that is shared among all objects of the class; a single instance is shared among all objects of the class. Such an attribute is accessed using the class name.

## Standard Methods

* equals method

* toString method

* copy method

### *equals*

```java
    public boolean equals(<ClassName> var) {
        return <boolean expression>;
    }
```

* It is useful to be able to compare if two objects are **equal**

* Doing the equality test with == operator will only check if references are equal as opposed to checking if objects are equal

* How to determine if objects are equal is up to you; use **one or more** properties of the objects

#### Adding equals to Circle Class

```java
public boolean equals(Circle circle) {
    return Double.compare(circle.centreX, centreX) == &&              Double.compare(circle.centreY, centreY) == 0 && Double.compare(circle.radius,  radius) == 0;
}
```