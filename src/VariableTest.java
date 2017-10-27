public class VariableTest {

    public static String globalString = "VariableTest";

    public static void main(String[] args) {

        //Java passes everything by value
        //primitive types pass the actual value
        int i = 6;
        testInt(i);
        System.out.println("i is " + i);

        //String are immutable
        String string = "hello";
        testString(string);
        System.out.println(string);

        //Object types pass the value which is the reference
        //although we initialize a new object, since it is an object it points to the same place in memory
        String[] stringArray = {"a","b", "c"};
        testArray(stringArray);
        System.out.println(stringArray[1]);

        testClassVariable();
        System.out.println(globalString);
    }

    private static void testClassVariable() {
        globalString = "changing";
    }

    private static void testString(String string) {
        string = "goodbye";
    }

    public static void testInt(int i) {
        i = 10;
    }

    public static void testArray(String[] strings) {
        strings[1] ="z";
    }
}
