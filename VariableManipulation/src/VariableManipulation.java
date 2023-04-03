public class VariableManipulation {
    public static void main(String[] args) throws Exception {
        // This code prints the fullName 
        String lastName = "Kamche";
        String firstName = "Yann";
        String fullName;
        fullName = lastName.concat(firstName);
        System.out.println(fullName);

        //This is code displays the multiplication table of 5

        int value = 5;
        for (int i = 0; i <= 10; i++) {
            System.out.println(5 + " * " + i + " = " + value * i);
        }

        //Printing the content of these variables

        int myAge = 20;
        float myAgeFloat = 20.000f;
        char myfirstLetter = 'K';
        boolean amIStudent = true;
        String myGreeting = "Hello";

        System.out.println(myGreeting + "!!! My name is " + fullName + ". I am " + myAge + " years old.");
        System.out.println("My age in float is " + myAgeFloat);
        System.out.println("The first letter of my last name is " + myfirstLetter);
        System.out.println("Am I a student? " + amIStudent );

    }
}
