package io.github.fatihbozik.ch1.nestedclasses.innerclasses.example3;

/**
 * @author Fatih Bozik
 */
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

        A.B.C c2 = new A().new B().new C();
    }
}
