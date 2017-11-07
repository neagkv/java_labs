package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */



class Exercise_09 {

    static void vaMeth(String... v) {

        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        StringBuilder buildAString = new StringBuilder();

        for (String a : v) {

            buildAString.append(a);
        }

        System.out.println(buildAString.toString());

        for (int i = 0; i < v.length; i++)

            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {

        vaMeth("This", "is", "varargs");
        vaMeth("I", "am", "a", "String");
        vaMeth("Hello", "World");
    }
}




