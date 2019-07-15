# Advanced Class Design

## Access Modifiers

Imagine the following classes (BigCat and Lynx) exists.

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

import cat.BigCat;

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
	System.out.println(cat.hasFur);   // DOES NOT COMPILE
	System.out.println(cat.hasPawns); // DOES NOT COMPILE
	System.out.println(cat.id);       // DOES NOT COMPILE
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

```java
public class ListHelper {
    public List<String> copyAndSortList(List<String> original) {
        List<String> list = new ArrayList<String>(original);
        sort(list);
        return list;
    }
}
```

How many different ways can you think of to write imports that will make this code compile.

<br/>

```java
import static java.util.Collections.sort;
// or using wildcard -> import static java.util.Collections.*;

import java.util.List;
import java.util.ArrayList;   
// or using wildcard -> import java.util.*;

public class ListHelper {
    public List<String> copyAndSortList(List<String> original) {
        List<String> list = new ArrayList<String>(original);
        sort(list);
        return list;
    }
}
```

## Using _instanceof_

* In `a instanceof B`, the expression returns true if the reference to which a points is an instance of class B, a subclass of B (directly or indirectly), or a class that implements the B interface (directly or indirectly).

* All Java classes inherit from `Object`, which means that x instanceof Object is usually true except for one case where it is `false`. 

```java
class HeavyAnimal { }
class Hippo extends HeavyAnimal { }
class Elephant extends HeavyAnimal { }

class Test {
    public static void main(String[] args){
      HeavyAnimal hippo = new Hippo();
      boolean b1 = hippo instanceof Object;           // true
      boolean b2 = hippo instanceof HeavyAnimal;      // true
      boolean b3 = hippo instanceof Hippo;            // true
      boolean b4 = hippo instanceof Elephant;         // false
      
      Hippo nullHippo = null;
      boolean b5 = nullHippo instanceof Object;       // false

      Hippo anotherHippo = new Hippo();
      boolean b6 = anotherHippo instanceof Elephant;  // DOES NOT COMPILE
      boolean b7 = 15 instanceof Elephant;            // DOES NOT COMPILE
    }
}
```

* The compiler knows that there is no possible way for a `Hippo` variable reference to be an Elephant, since Hippo doesn't extend Elephant directly or indirectly.

* The compilation checks only applies when `instanceof` is called on a class. When checking whether an object is an instanceof an interface. Java waits until runtime to do the check. The reason is that a subclass could implement that interface and the compiler wouldn't know it.
  The compiler knows an interface could be added, so the instanceof statement could be true for some subclasses, whereas there is no possible way to turn a Hippo into an Elephant.

```java
interface Mother { }
class HeavyAnimal { }
class Hippo extends HeavyAnimal { }
class Test {
    public static void main(String[] args){
        HeavyAnimal hippo = new Hippo();
        boolean b8 = hippo instanceof Mother;
    }
}
```

It so happens that `Hippo` does not implement Mother. The compiler allows the statement because there could later be a class such a this:

```java
class MotherHippo extends Hippo implements Mother { }
```

## Understanding Virtual Method Invocation

## Annotating Overridden Methods

## Coding _equals_, _hashCode_ and _toString_

## Working with _Enums_

```java
enum Season {
    WINTER, SPRING, SUMMER, FALL;
}
```

```java
final class Season extends Enum<Season> {
    public static final Season WINTER;
    public static final Season SPRING;
    public static final Season SUMMER;
    public static final Season FALL;
    private static final Season[] $VALUES;

    private Season(String name, int ordinal) {
	super(name, ordinal);
    }

    static {
	WINTER = new Season("WINTER", 0);
	SPRING = new Season("SPRING", 1);
	SUMMER = new Season("SUMMER", 2);
	FALL = new Season("FALL", 3);
	$VALUES = new Season[] {
		WINTER, SPRING, SUMMER, FALL
	};
    }

    public static Season[] values() {
	return $VALUES.clone();
    }

    public static Season valueOf(String name) {
	return Enum.valueOf(Season.class, name);
    }
}
```

## Creating Nested Classes 


