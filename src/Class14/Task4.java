package Class14;

public class Task4 {
    public static void main(String[] args) {

        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */

       /* StringBuilder st = new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
        String str = st.toString(); // converting a StringBuilder to String so that we can call methods from String
        str.split()*/

        String str = "This is sentence i want to reverse";
        String [] arr = str.split(" ");

        /*for(String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));

            }
            System.out.print(" ");*/

            /*String word1 = "This";
            for (int i = word1.length() - 1; i >= 0; i--) {
                System.out.print(word1.charAt(i));

            }
            System.out.println(" ");*/

        // using StringBuilding

        // for understanding this approach is good

        /*for(String word : arr){
            StringBuilder st = new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }*/
         // this approach is best for using

        for(String word : arr) {
            System.out.print(new StringBuilder(word).reverse()+" ");

        }
    }
}
