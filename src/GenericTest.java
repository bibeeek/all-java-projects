public class GenericTest {

    public static void main(String[] args) {
        //GENERICS= enable types (classes and interfaces) to be parameters when defining
        // classes ,interface and methods

        // a benefit is to eliminate the need to create multiple version
        //of methods or classes for various data types
        // use 1 version for all reference data types

        Integer[] intarray={1,2,3,4,5};
        Double[] doublearray={1.1,2.2,3.3};
       Character[] chararr={'a','v','c'};
       String[] strarray={"bjb","ccc"};


       displayArray(intarray);

        System.out.println(getFirst(intarray));

    }
    public static <Thing> void  displayArray(Thing[] array) {

        for (Thing x : array) {   //or write T
            System.out.print(x + " ");
        }
    }
      public static <Thing> Thing getFirst(Thing[] array ){
            return array[0];
        }

}
