public class Strings {
    public static void main(String[] args) throws Exception {
        //String is a collection of characters surrounded by double quotes

        String myString = "Hi! How are you doing today?";
        System.out.println(myString);
        
        //Length of a String
        System.out.println("The length of my String is: " + myString.length());

        //Upper and LowerCase
        System.out.println("This is my string in Capital Letter: " + myString.toUpperCase());
        System.out.println("This is my string in small Letter: " + myString.toLowerCase());
        
        //Index of returns the first occurence of a character or word in a string
        System.out.println("Index of today in my String: " + myString.indexOf("today"));

        //String Concatenation
        String firstName = "Yann";
        String lastName = "Kamche";
        System.out.println("My fullName is : " + firstName.concat(lastName));
    }
}
