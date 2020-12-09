package DesignPatterns;

public class polymorphism {

    public class A {
        public String show(D obj) {
            return ("A and D");
        }

        public String show(A obj) {
            return ("A and A");
        }

    }

    public class B extends A{
        public String show(B obj){
            return ("B and B");
        }

        public String show(A obj){
            return ("B and A");
        }
    }

    public class C extends B{

    }

    public class D extends B{

    }

    public class Test {

        /**
        public static void main(String[] args) {
            A a1 = new A();
            A a2 = new B();
            B b = new B();
            C c = new C();
            D d = new D();

            System.out.println("1--" + a1.show(b));
            System.out.println("2--" + a1.show(c));
            System.out.println("3--" + a1.show(d));
            System.out.println("4--" + a2.show(b));
            System.out.println("5--" + a2.show(c));
            System.out.println("6--" + a2.show(d));
            System.out.println("7--" + b.show(b));
            System.out.println("8--" + b.show(c));
            System.out.println("9--" + b.show(d));
        }
         */
    }

    /**
    case study:
        the return answer should be:
    1 -- A and A
     2 -- A and A
     3 -- A and D
     4 -- B and A
     5 -- B and A
     6 -- A and D
     7 -- B and B
     8 -- B and B
     9 -- A and D
     */

}

