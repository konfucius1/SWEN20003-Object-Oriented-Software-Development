# Object Oriented Programming

Program splits apart into self contained objects into “micro-programs”

**class** and **object**

## Class

A class is the blueprint, the definition, description of an idea.

A class define ***attributes*** and ***behaviours***

**Attributes** | **Behaviour**
--- | ---
name | walk  
height | run 
weight | jump
gender | speak
age | sleep
Attribute is the data or ***property***

Behaviour is the function or ***method***

**Class is the idea**, **the object is the thing**. *We create object based on the class*, like creating a house based on the blueprint. One class can create multiple objects, just like how one can make 500 apple pie from a single recipe. 

### Object

has a unique identity, state, and behaviour.

## Class

Methods are set within the object

```java
// Class Template
class Circle {
    // Radius of circle
    double radius = 1;        // data field
    
    // Construct a circle object
    Circle (double newRadius) {
        radius = newRadius;
    }
    
    // Return the AREA of circle
    double getArea() {
        return radius * radius * Math.PI;
    }
    
    // Return the PERIMETER of circle
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Set new radius for circle
    double setRadius(double newRadius) {
        radius = newRadius;
    }
}
```