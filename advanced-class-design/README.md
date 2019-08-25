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
| Member in a superclass in a different package                               | no                         | no                                                   | yes                          | yes                       |
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

A **virtual method** is a method in which the specific implementation is not determined until runtime. In fact, all non-final, non-static, and non-private Java methods are considered virtual methods, since any of them can be overridden at runtime.

```java
abstract class Animal {
    public void careFor() {
	play();
    }

    public void play() {
	System.out.println("pet animal");
    }
}

class Lion extends Animal {
    public void play() {
	System.out.println("toss in meat");
    }
}

public class PlayWithAnimal {
    public static void main(String... args) {
	Animal animal = new Lion();
	animal.careFor(); // toss in meat
    }
}
```

Only `Animal` superclass has a `careFor` method, it executes. That method calls play.
Java looks for overridden methods, and it sees that Lion implements `play`. Even though the call
is from the Animal class, Java still looks at subclasses.

## Annotating Overridden Methods

An *annotation* is extra information about the program, and it is type of *metadata*. It begins with an `@` symbol and can be used by the compiler or even at runtime.

```java
class BobcatMother {
    public void findDen() { }
}

class Bobcat extends BobcatMother {
    @Override
    public void findDen() { }
    
    @Override
    public void findDen(boolean b) { } // DOES NOT COMPILE
}
```

## Coding _equals_, _hashCode_ and _toString_

All classes in Java inherit from `java.lang.Object`, either directly or indirectly, which means that all classes inherit any methods defined in `Object`.

### *toString*

Java automatically calls the `toString` method if you try to print out an object. Some classes supply a humanreadable implementation of `toString` and others do not.

```java
public static void main(String[] args) {
    System.out.println(new ArrayList()); // []
    System.out.println(new String[0]);   // [Ljava.lang.String;@61bbe9ba
}
```

Providing nice human-readable output is going to make things easier for developers working with your code. They can simply print out your object and understand what it represents.

```java
public class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
	this.name = name;
	this.weight = weight;
    }

    @Override
    public String toString() {
	return "name: " + name + ", weight: " + weight;
    }

    public static void main(String[] args) {
	Hippo hippo = new Hippo("Harry", 768);
	System.out.println(hippo); // name: Harry, weight: 768.0
    }
}
```

#### The Easy Way to Write `toString` Methods

[Apache Commons Lang](https://commons.apache.org/proper/commons-lang/) provides some methods that you might wish were in core Java.

```java
package ToString;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

class Hippo {
    private String name;
    private double weight;
       
    // Constructor
    
    @Override
    public String toString() {
      // Hippo[name=Harry,weight=768.0]
      return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE); 
      
      // ToString.Hippo@12a89a7[name=Harry,weight=768.0]
      // return ToStringBuilder.reflectionToString(this); 
    }
}

class HippoTest {
    public static void main(String[] args){
      Hippo hippo = new Hippo("Harry", 768);
      System.out.println(hippo);
   } 
}
```

You might be wondering what this reflection thing is that is mentioned in the method name. *Reflection* is a technique used in Java to look at information about class at runtime. This lets the `ToStringBuilder` class determine what are all of the instance variables and to construct a String with each.

### *equals*

Checking if two objects are equivalent uses the `equals()` method, or at least it does if the developer implementing the method overrides `equals()`.

```java
String s1 = new String("lion");
String s2 = new String("lion");
System.out.println(s1.equals(s2)); // true

StringBuilder sb1 = new StringBuilder("lion");
StringBuilder sb2 = new StringBuilder("lion");
System.out.println(sb1.equals(sb2)); // false
```

`String` does have an `equals` method. It checks that the values are the same. `StringBuilder` uses the implementation of `equals()` provided by `Object`, which simply check if the two objects being referred to are the same.

```java
public class Lion {
    private int id;
    private int age;
    private String name;

    public Lion(int id, int age, String name) {
	this.id = id;
	this.age = age;
	this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
	if (!(obj instanceof Lion)) {
	    return false;
	}
	Lion otherLion = (Lion) obj;
	return (this.id == otherLion.id);
    }
}
```

#### The Contract for `equals()` Methods

Java provides a number of rules in the contact for the `equals()` method.

The `equals()` method implements an equivalence relation on non-null object references.
* It is *reflexive*: For any non-null reference value x, `x.equals(x)` should return `true`.
* It is *symmetric*: For any non-null reference values x and y, `x.equals(y)` should return true if and only if `y.equals(x)` returns true. 
* It is *transitive*: For any non-null reference values x, y and z, if `x.equals(y)` returns `true` and `y.equals(z)` returns true, then `x.equals(z)` should return true.
* It is *consistent*: For any non-null reference values x and y, multiple invocations of `x.equals(y)` consistently return `true` or consistently return `false`, provided no information used in equals comparisons on the objects is modified.
* For any non-null reference value x, `x.equals(null)` should return `false`.

#### Easy Way to Write `equals()` Methods

If you want all of the instance variables to be checked, your `equals()` method can be one line with Apache Commons Lang library:
```java
public boolean equals(Object obj) {
  return EqualsBuilder.reflectionEquals(this, obj);
}
``` 

This is nice. However, for `equals()`, it is common to look at just one or two instance variables rather than all of them.
```java
@Override
public boolean equals(Object obj) {
    if (!(obj instanceof Lion)) {
        return false;
    }
    Lion other = (Lion) obj;
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(id, other.id)
        .append(name, other.name)
        .isEquals();
}
```

### *hashCode*

Whenever you override `equals()`, you are also expected to override `hashCode()`. The hash code is used when storing the object as a key in a map. 

A *hash code* is a number that puts instances of a class into a finite number of categories. 

```java
class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
	if (rank == null || suit == null) {
	    throw new IllegalArgumentException();
	}
	this.rank = rank;
	this.suit = suit;
    }

    public boolean equals(Object obj) {
	if (!(obj instanceof Card)) {
	    return false;
	}
	Card other = (Card) obj;
	return rank.equals(other.rank) && suit.equals(other.suit);
    }

    public int hashCode() {
	return rank.hashCode();
    }
}
```

In the constructor, you make sure that neither instance variable is `null`. This check allows `equals()` to be simpler because you don't have to worry about `null` there. The `hashCode()` method is quite simple. It asks the `rank` for its hash code and uses that. 

But what do you do if you have primitive and need the hash code? The hash code is just a number. You can just use a primitive number as is or divide to get a smaller `int`. Remember that all of the instance variables don't need to be used in a `hashCode()` method. It is common not to include `boolean` and `char` variables in the hash code.

#### The Contract for `hashCode()` Methods

* Within the same program, the result of `hashCode()` must not change. This means that you shouldn't include variables that change in figuring out the hash code.

* If `equals()` returns `true` when called with two objects, calling `hashCode()` on each of those objects must return the same result. This means `hashCode()` can use a subset of the variables that `equals()` uses.

* If `equals()` returns `false` when called with two objects, calling `hashCode()` on each of those objects does not have return a different values. This means `hashCode()` results do not need to be unique when called on unequal objects.

```java
public int hashCode() { return id; } // Legal
public int hashCode() { return 6; } // Legal but isn't particularly efficient
public long hashcode() { return id; } // DOES NOT COMPILE
public int hashCode() { return id * 7 + age; } // is not legal because it is used
                                               // more variables than equals()
```

#### The Easy Way to Write `hashCode()` Methods

The easiest way to write hash code your own. Just pick the key fields that identify your object (and don't change during the program)
 and combine them:
 
```java
public int hashCode() {
  return keyField + (7 * otherKeyField.hashCode());   
}
```

It is common to multiply by a prime number when combining multiple fields int the hash code. This makes the hash code more unique, which helps when distributing objects into buckets.  

## Working with _Enums_

In programming, it is common to have a type that can only have a finite set of values.
An *enumerations* is like a fixed set of constants. In Java, an `enum` is a class that represents an enumeration. It is much better than a bunch of constants because it provides type-safe checking. With numeric constants, you can pass an invalid value and not find out until runtime. With `enums`, it is impossible to create an invalid enum type without introducing a compiler error.

Enumerations show up whenever you have a set of items whose types are known at compile time. Common examples are the days of the week, months of the year or the cards in a deck.

To create a enum , use `enum` keyword instead of `class` keyword. Then list all of the valid types for that enum.

```java
enum Season {
    WINTER, SPRING, SUMMER, FALL;
}
```

Since `enum` is like a set of constants, use the uppercase letter convention that you used for constants.  

Behind the scenes, an enum is a type of class that mainly contains `static` members. It also includes some helper methods like `name()`or `values()`.

```java
Season s = Season.SUMMER;
System.out.println(Season.SUMMER); // SUMMER
System.out.println(s == Season.SUMMER); // true
``` 

An enum provides a method to get an array fo all the values. You can use this like any normal array, including in a loop. 

```java
for(Season season: Season.values()) {
    System.out.println(season.name() + " " + season.ordinal()); // WINTER 0
                                                                // SPRING 1
                                                                // SUMMER 2
                                                                // FALL 3
}
```
 
You can't compare an `int` and `enum` value directly anyway.
```java
if(Season.SUMMER == 2) { } // DOES NOT COMPILE
```

You can also create an `enum` from `String`. The `String` passed in must match exactly.
```java
Season s1 = Season.valueOf("SUMMER"); // SUMMER
Season s2 = Season.valueOf("summer"); // throws IllegalArgumentException
```

Another thing that you can't do is extend an enum.
```java
public enum ExtendedSeason extends Season { } // DOES NOT COMPILE
```

### Using *Enums* in *Switch* Statements

`Enums` may be used in `switch` statements. 

```java
Season summer = Season.SUMMER;

switch (summer) {
    case WINTER:
       System.out.println("Winter");
       break;
    case SUMMER:
       System.out.println("Summer");
       break;
    // case Season.FALL: // DOES NOT COMPILE
    //	  System.out.println("Fall");
    // 	  break;
    // case 2: // DOES NOT COMPILE
    //    System.out.println("2");
    //    break;
    default:
       System.out.println("Default");
}
```

### Adding Constructors, Fields, And Methods

`Enums` can have more in them than just values. It is common to give state to each one.

```java
enum Season {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium"); // This semicolon required if
                    // there is anything in the enum
                    // besides the values.

    private String expectedVisitors;
    private Season(String expectedVisitors) {
	this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors() {
	System.out.println(expectedVisitors);
    }
    
    public static void main(String[] args) {
    	Season.SUMMER.printExpectedVisitors(); // High
    }
}
```

Notice how we don't appear to call the constructor. We just say that we want he `enum` value. The first time that we ask for any of the enum values, Java constructs all of the enum values. After that, Java just returns the already-constructed `enum` values. Given that explanation, you can see why this code calls the constructor only once.

```java
public enum OnlyOne {
    ONCE(true);

    private OnlyOne(boolean b) {
	System.out.println("constructing");
    }

    public static void main(String[] args) {
	OnlyOne firstCall = OnlyOne.ONCE;  // prints constructing
	OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
    }
}
```

It is possible for a Java enum to have abstract methods too. If an enum has an abstract method, then each instance of the enum must implement it. Here is a Java enum abstract method example:

```java
enum Season {
    WINTER {
	@Override
	public void printHours() {
	    System.out.println("9am-3pm");
	}
    },
    SPRING {
	@Override
	public void printHours() {
	    System.out.println("9am-5pm");
	}
    },
    SUMMER {
	@Override
	public void printHours() {
	    System.out.println("9am-7pm");
	}
    },
    FALL {
	@Override
	public void printHours() {
	    System.out.println("9am-5pm");
	}
    };

    public abstract void printHours();
}
```

If we don't want each and every `enum` value to have a method, we can create a default implementation and override it only for the specific cases:

```java
public enum Season {
    WINTER {
	@Override
	public void printHours() {
	    System.out.println("short hours");
	}
    },
    SUMMER {
	@Override
	public void printHours() {
	    System.out.println("long hours");
	}
    },
    SPRING, FALL;
    
    public void printHours() {
	System.out.println("Default hours");
    }
}
```

### Behind The Scenes Enum

```java
enum Season {                     // final class Season extends Enum<Season> {
    WINTER, SPRING, SUMMER, FALL  //     public static final Season WINTER;
}                                 //     public static final Season SPRING;
                                  //     public static final Season SUMMER;
                                  //     public static final Season FALL;
                                  //     private static final Season[] $VALUES;
                                  //
                                  //     private Season(String name, int ordinal) {
                                  //        super(name, ordinal);
                                  //     }
                                  //
                                  //     static {
                                  //        WINTER = new Season("WINTER", 0);
                                  //        SPRING = new Season("SPRING", 1);
                                  //        SUMMER = new Season("SUMMER", 2);
                                  //        FALL = new Season("FALL", 3);
                                  //	       $VALUES = new Season[] {
                                  //		      WINTER, SPRING, SUMMER, FALL
                                  //        };
                                  //     }
                                  //
                                  //     public static Season[] values() {
                                  //        return $VALUES.clone();
                                  //     }
                                  //
                                  //     public static Season valueOf(String name) {
                                  //        return Enum.valueOf(Season.class, name);
                                  //     }
```

```java
enum Season {                              // abstract class Season extends Enum<Season> {
    WINTER {                               //    public static final Season WINTER;
	@Override                          //    public static final Season SPRING;
	public void printHours() {         //    public static final Season SUMMER;
	    System.out.println("9am-3pm"); //    public static final Season FALL;
	}                                  //    private static final Season[] $VALUES;
    },                                     //
    SPRING {                               //    private Season(String name, int ordinal) {
	@Override                          //       super(name, ordinal);
	public void printHours() {         //    }
	    System.out.println("9am-5pm"); //
	}                                  //    static {
    },                                     //       WINTER = Season("WINTER", 0) {
    SUMMER {                               //          @Override
	@Override                          //          public void printHours() {
	public void printHours() {         //             System.out.println("9am-3pm");
	    System.out.println("9am-7pm"); //          }
	}                                  //       };
    },                                     //       SPRING = Season("SPRING", 1) {
    FALL {                                 //          @Override
	@Override                          //          public void printHours() {
	public void printHours() {         //             System.out.println("9am-5pm");
	    System.out.println("9am-5pm"); //          }
	}                                  //       };
    };                                     //       SUMMER = Season("SUMMER", 2) {
                                           //          @Override
    public abstract void printHours();     //          public void printHours() {
}                                          //             System.out.println("9am-7pm");
                                           //          }
                                           //       };
                                           //       FALL = Season("FALL", 3) {
                                           //          @Override
                                           //          public void printHours() {
                                           //             System.out.println("9am-5pm");
                                           //          }
                                           //       };
                                           //       $VALUES = new Season[] {
                                           //          WINTER, SPRING, SUMMER, FALL
                                           //       };
                                           //    }
                                           //
                                           //    public static Season[] values() {
                                           //       return $VALUES.clone();
                                           //    }
                                           //
                                           //    public static Season valueOf(String name) {
                                           //       return Enum.valueOf(Season.class, name);
                                           //    }
                                           // }
```

## Creating Nested Classes 

A *nested class* is a class that is defined within another class. A nested class that is not `static` is called an *inner class*. There are four types of nested classes.

* A member inner class is a class defined at the same level as instance variables. It is not static. Often, this is just referred to as an inner class without explicitly saying the type.
* A local inner class is defined within a method.
* An anonymous inner class is a special case of a local inner class that does not have a name.
* A static nested class is a `static` class that is defined at the same level as `static` variables.

There are a few benefits of using inner classes. They can encapsulate helper classes by restricting them to containing class. They can make it easy to create a class that will be used in only one place. They can make the code easier to read. They can also make yhe code harder to read when used improperly.

### Member Inner Classes

A *member inner class* is defined at the member level of a class (the same level as the methods, instance variables, and the constructors). Member inner classes have the following properties:
* Can be declared `public`, `private`, or `protected` or default access.
* Can extend any class and implement interfaces.
* Can be `abstract` or `final`.
* Cannot declare static fields or methods except for stativc final fields.
* Can access members of the outer class including `private` members.

```java
public class Outer {
    private String greeting = "Hi";

    protected class Inner {
        public int repeat = 3;
        public void go() {
            for(int i = 0; i < repeat; i++) {
		System.out.println(greeting);
	    }
	}
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
	Outer outer = new Outer();
	outer.callInner();
    }
}
```

There is another way to instantiate `Inner` that looks odd at first. This syntax isn't used often enough to get used to it.
```java
public static void main(String[] args){
  Outer outer = new Outer();
  Inner inner = outer.new Inner(); // create the inner class
  inner.go;
}
```

Inner classes can have the same variable names as outer classes. There is a special way of calling `this` to say which class you want to access. You also aren't limited to just one inner class. Please never do this in code you write.

```java
public class A {
    private int x = 10;

    class B {
	private int x = 20;

	class C {
	    private int x = 30;

	    public void allTheX() {
		System.out.println(x);            // 30
		System.out.println(this.x);       // 30
		System.out.println(C.this.x);     // 30
		System.out.println(B.C.this.x);   // 30
		System.out.println(A.B.C.this.x); // 30

		System.out.println(B.this.x);     // 20
		System.out.println(A.B.this.x);   // 20
		
		System.out.println(A.this.x);     // 10
	    }
	}
    }

    public static void main(String[] args) {
	A a = new A();
	A.B b = a.new B();
	A.B.C c = b.new C();
	c.allTheX();
	
	// Create c2 object in one line
	A.B.C c2 = new A().new B().new C();
    }
}
``` 

#### `.class` Files for Inner Classes
Compiling the `A.java` class with which we have been working creates three class files. `A.class` you should be expecting. For the inner class B, the compiler creates `A$B.class`. For the inner class C, the compiler creates `A$B$C.class`.

#### Private Interfaces

The interface itself does not have to be `public`, though. Just line any inner class, an inner interface can be `private`. This means that interface can only be referred to within the current outer class.

```java
public class CaseOfPrivateInterface {
    private interface Secret {
        public void shh();
    }
    class DontTell implements Secret {
        public void shh() { }
    }
}
```

### Local Inner Classes

A *local inner class* is a nested class defined within a method. Like local variables, a local inner class declaration does not exist until the method is invoked, and it goes out of scope when method returns. This means that you can create instances only from within method. Those instances can still be returned from the method. This is  just how local variables work. Local inner classes have the following properties:

* They do not have an access specifier.
* They cannot be declared `static` and cannot declare `static` fields or methods except for static final fields.
* They have access to all fields and methods of the enclosing class.
* They do not have access to local variables of a method unless those variables are `final` or effectively final.

```java
public class Outer {
    private int length = 5;
    public void calculate() {
	final int width = 20;
	class Inner {
	    public void multiply() {
		System.out.println(length + width);
	    }
	}
	Inner inner = new Inner();
	inner.multiply();
    }
    public static void main(String[] args) {
	Outer outer = new Outer();
	outer.calculate();
    }
}
```

The compiler is generating a class file from your inner class. A separate class has no way to refer to local variables. If the local variables `final`, Java can handle it by passing it to the constructor of the inner class or by storing it in the class file. If it weren't effectively final, these tricks wouldn't work because the value could change after the copy was made.

**Effectively final:** A variable or parameter whose value is never changed after it is initialized is effectively final.

### Anonymous Inner Classes

An *anonymous inner class* is a local inner class that does not have a name. It is declared and instantiated all in one statement using the `new` keyword. Anonymous inner classes are required to extend an existing class or implement an existing interface. They are useful when you have a short implementation that will not be used anywhere else.

```java
public class AnonInner {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
	    int dollarsOff() {
		return 3;
	    }
	};
        return basePrice - sale.dollarsOff();
    }
}
``` 

Now we convert this same example to implement an `interface` instead of extending an `abstract` class.

```java
public class AnonInner {
    interface SaleTodayOnly {
	int dollarsOff();
    }
    public int admission(int basePrice) {
	SaleTodayOnly sale = new SaleTodayOnly() {
	    @Override
	    public int dollarsOff() {
		return 0;
	    }
	};
	return basePrice - sale.dollarsOff();
    }
}
```

You can define anonymous inner class right where they are needed, even if that is an argument to another method:

```java
public class AnonInner {
    interface SaleTodayOnly {
	int dollarsOff();
    }
    public int pay() {
	return admission(5, new SaleTodayOnly() {
	    public int dollarsOff() {
		return 3;
	    }
	});
    }
    public int admission(int basePrice, SaleTodayOnly sale) {
	return basePrice - sale.dollarsOff();
    }
}
```

### Static Nested Classes

A *static nested class* is a static class defined at the member level. It can be instantiated without an object of the enclosing class, so it can't access the instance variables without an explicit object of enclosing class. For example, `new OuterClass().var` allows access to the instance variable `var`.

It is like regular class except for the following.
* The nesting creates a namespace because the enclosing class name must be used to refer to it.
* It can be made `private` or use one of the other access modifiers to encapsulate it.
* The enclosing class can refer to the fields and methods of the `static` nested class.

```java
public class Enclosing {
    static class Nested {
	private int price = 6;
    }
    public static void main(String[] args) {
	Nested nested = new Nested();
	System.out.println(nested.price);
    }
}
```

---

#### Importing a `static` Nested Class

Importing a `static` nested class is interesting. You can import it using a regular import:

```java
package bird;
public class Toucan {
    public static class Beak { }
}
```

```java
package watcher;
import bird.Toucan.Beak; // regular import ok
public class BirdWatcher {
    Beak beak;
}
```

And since it is `static`, alternatively you can use a `static` import:

```java
import static bird.toucan.Beak;
```

Either one will compile. Java treats the `static` nested class as if it were a namespace.

---

To review the four type of nested classes, make sure that you know the information in below table.

|                                                   | Member inner class                                  | Local inner class                     | Anonymous inner class                                  | `static` nested class                                           |
| ------------------------------------------------- | --------------------------------------------------- | ------------------------------------- | ------------------------------------------------------ | --------------------------------------------------------------- |
| Access modifiers allowed                          | `public`, `protected`, `private`, or default access | None. Already local to method.        | None. Already local to statement.                      | `public`, `protected`, `private`, or default access             |
| Can extend any class and any number of interfaces | Yes                                                 | Yes                                   | No - must have exactly one superclass or one interface | Yes                                                             |
| Can be `abstract`                                 | Yes                                                 | Yes                                   | N/A - because no class definition                      | Yes                                                             |
| Can be `final`                                    | Yes                                                 | Yes                                   | N/A - because no class definition                      | Yes                                                             |
| Can access instance members of enclosing class    | Yes                                                 | Yes                                   | Yes                                                    | No (not directly; requires an interface of the enclosing class) |
| Can access local variables of enclosing class     | No                                                  | Yes - if `final` or effectively final | Yes - if `final` or effectively final                  | No                                                              |
| Can declare `static` methods                      | No                                                  | No                                    | No                                                     | Yes                                                             |