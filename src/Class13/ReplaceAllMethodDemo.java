package Class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str = "khkhLKHLL34343KHLlhlhe**&^%(*^)(*^%";
        System.out.println(str.replaceAll("[A-Z]", "@"));
        // only those upper chase letter from A to Z is replaced to @ with this method
        System.out.println(str.replaceAll("[a-z]", "*"));
        // only those upper chase letter from a to z is replaced to * with this method
        System.out.println(str.replaceAll("[0-9]", "#"));
        // only the numbers from 0 to 9 will be replaced to # with this method
        System.out.println(str.replaceAll("[A-Za-z]", "#"));
        // with this method we can change all the upper and lower case letter to #
        System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
        // with this method we can change all the upper and lower and numbers from 0-9 to #
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "#"));
        // with this method we can change all the characters to #
        System.out.println(str.replaceAll("[^A-Za-z0-9]", " "));


    }
}
