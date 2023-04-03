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
    }
}
