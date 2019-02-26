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

     class nestedInnerClass{
         public void nestedInnerClassTest
     }


    public static void main(String[] args){
        anInterface.anonClassTest();

        System.out.println();
        innerClassMethod();
    }
}
