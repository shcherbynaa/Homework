public class Hw4T2Classes {

    public static void methOfMainClass(){
        System.out.println("Method of main class used in nested inner class");
    }

    static AnonInterface anInterface = new AnonInterface() {
        @Override
        public void anonClassTest() {
            System.out.println("Hi from ANONYMOUS class.");
        }
    };

     static void innerClassMethod(){
         System.out.println("Begin of inner class method");

         class InnerClass{
            void innerClassTest(){
                System.out.println("Hi from INNER class");
            }
         }

         InnerClass innerClass = new InnerClass();
         innerClass.innerClassTest();

     }

     class NestedInnerClass{
         public void nestedInnerClassTest(){
             System.out.println("Nested inner class");
         }
     }

     public static void methodLocalClass(){

         final String s = "Hello";

         class LocalClass{

             void printText(){
                 System.out.println("Hello from local class");
             }
         }
         LocalClass localClass = new LocalClass();
         localClass.printText();
     }

    public static void main(String[] args){

        anInterface.anonClassTest();

        System.out.println();
        innerClassMethod();
        System.out.println();

        Hw4T2Classes.NestedInnerClass innerClass = new Hw4T2Classes(). new NestedInnerClass();
        innerClass.nestedInnerClassTest();

        System.out.println();
        methodLocalClass();

    }
}
