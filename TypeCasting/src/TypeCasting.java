public class TypeCasting {
    public static void main(String[] args) throws Exception {
        /*
        Type Casting means assigning the value of one primitive data type
         to another. There are two types 
         - Narrow and Widening Casting*/ 

         //1) Widening Casting
         int myNum = 9;
         float myNewNum = myNum;
         System.out.println(myNum);
         System.out.println(myNewNum);

         //2) Narrow Casting
         double myDouble = 1234.4534d;
         int myNewInt = (int) myDouble;
         System.out.println(myDouble);
         System.out.println(myNewInt);

         
    }
}
