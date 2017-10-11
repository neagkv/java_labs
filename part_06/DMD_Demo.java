package part_06;
/*
Demonstrate dynamic method dispatch. Refer to java_book_source Example19, but do not copy it verbatim.

 */

class Parent_Class {
        void Hello() {
            System.out.println("Hello() in Parent");
        }
    }

class FChild_Class extends Parent_Class {
        void Hello() {
            System.out.println("Hello() in 1st Child");
        }
    }

class SChild_Class extends Parent_Class {
        void Hello() {
            System.out.println("Hello() in 2nd Child");
        }
    }

class DynDispDemo {

        public static void main(String args[]) {
            Parent_Class parent = new Parent_Class();
            FChild_Class first = new FChild_Class();
            SChild_Class second = new SChild_Class();


            Parent_Class parentRef;
            parent.Hello();

            parentRef = first;
            parentRef.Hello();

            parentRef = second;
            parentRef.Hello();



        }
    }






