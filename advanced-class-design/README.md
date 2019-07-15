# Advanced Class Design

## Access Modifiers

Imagine the following classes exists.

```java
package cat;

public class BigCat {
    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;

    public static void main(String[] args) {
	BigCat cat = new BigCat();
	System.out.println(cat.name);
	System.out.println(cat.hasFur);
	System.out.println(cat.hasPaws);
	System.out.println(cat.id);
    }
}
```

```java
package cat.species;

public class Lynx extends BigCat { }
```

Now, suppose `Lynx` class has main method that instantiates a BigCat and tries to print out all four variables. Which variables will be allowed?

```java
package cat.species;

import cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {
	BigCat cat = new BigCat();
	System.out.println(cat.name);
	// System.out.println(cat.hasFur);   // DOES NOT COMPILE
	// System.out.println(cat.hasPawns); // DOES NOT COMPILE
	// System.out.println(cat.id);       // DOES NOT COMPILE
    }
}
```

- `cat.name` **compiles** because any code can access public members.
- `cat.hasFur` is tricky one.
protected allows subclasses and code in the same package to access members.
**Does not compile** because code is being accessed via the variable rather than by inheritance, it doesnt benefit from protected.
If the code in main was `Lynx cat = new Lynx();` would be compile.
- `cat.hasPawns` **does not compile** because only code in the same package can access code with default access.
- `cat.id` **does not compile** because only code in the same class can access private members.

To review the rules for access modifiers at a glance, see below table.

| Can access                                                                | Is that member is `private`? | If that member has default (package private) access? | If that member is `protected`? | If that member is `public`? |
| ------------------------------------------------------------------------- | -------------------------- | ---------------------------------------------------- | ---------------------------- | ------------------------- |
| Member in the same class                                                  | yes                        | yes                                                  | yes                          | yes                       |
| Member in another class in the same package                               | no                         | yes                                                  | yes                          | yes                       |
| Member in another class in the same package                               | no                         | no                                                   | yes                          | yes                       |
| Method/field in a class (that is not a superclass) in a different package | no                         | no                                                   | no                           | yes                       |

## Overloading and Overriding 

Overloading and overriding happen only when the method name is the same. _Overriding_ occurs when the method signature is the same. _The method signature_ is the method name and the parameter list. For _overloading_, the method parameters must vary by type and/or number.

When multiple overloaded methods are present, Java looks for the closest match first. It tries to find the following: 
* Exact match by type
* Matching a superclass type
* Converting to a larger primitive type
* Converting to an autoboxed type
* Varargs

For overriding, the overridden method has a few rules:
* The access modifier must be same or more accessible.
* The return type must be the same or a more restrictive type, also known as _covariant return types_.
* If any checked exception thrown, only the same exceptions or subclasses of those exceptions are allowed to be thrown.
* The method must not be `static`. (If they are, the method is hidden not overridden.)

```java
public class Bobcat {
  public void findDen() { }
}
```

```java
public class BobcatKitten extends Bobcat {
  // overriding because it has the same method signatures  
  public void findDen() { } 
  
  // overloading because it has the same method name but different parameter list
  public void findDen(boolean b) { }
  
  // not an override or overload because it has different method name
  public int findden() throws Exception { return 0; }
}
```

## Abstract Classes

* An `abstract` class may contain any number of methods including zero. The methods can be abstract or concrete.
* Abstract methods may not appear in a class that is not `abstract`.
* The first concrete subclass of an `abstract` class is required to implement all `abstract` methods that were not implemented by superclass.

```java
abstract class Cat {
    // 1. abstract void clean(); // independently compiles
    // 2. leave it blank         // independently compiles
    // 3. void clean() {}        // independently compiles
}

class Lion extends Cat {
    void clean() {}
}
```

## _Static_ and _Final_

* `final` prevents a variable from changing or a method from being overridden. 
* `static` makes a variable shared at the class level and uses the class name to refer to a method.
* `static` and `final` are allowed to be added on the class level too. `static` keyword used on nested classes. Using `final` on a class means that it cannot be subclassed.
* Methods and classes cannot be both `abstract` and `final`.

## Imports

## Using _instanceof_

## Understanding Virtual Method Invocation

## Annotating Overridden Methods

## Coding _equals_, _hashCode_ and _toString_

## Working with _Enums_

## Creating Nested Classes 


