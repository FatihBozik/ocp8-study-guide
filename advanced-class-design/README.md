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