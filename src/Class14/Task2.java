package Class14;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String num = "asdfasDDGGREW323426*&%(0()@#$";
        System.out.println(num.replace("[^A-Za-z0-9]", "").length());

    }
}
