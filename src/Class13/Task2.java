package Class13;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create a String and print it in reverse order (Sunday → yadnuS).
         */

        String str = "Sunday";
       // for (int i = 0; i < str.length(); i++) {
         //   System.out.println(str.charAt(i));

        //    for (int j = 5; j >=0 ; j--) {
         //       System.out.println(str.charAt(j));

          //  }
    //    }

            // or

        for (int k = str.length()-1; k>=0; k--) {
            System.out.println(str.charAt(k));

        }
    }
}
