package Class9;

public class ArraysDemo4 {
    public static void main(String[] args) {

        // store these numbers A B c d e F in an array

       char [] alphabet = {'A', 'B', 'c', 'd', 'e', 'F'};

       alphabet [0] = 'n'; // updating the elements at index 0

        for (int i = 0; i < alphabet.length; i++) {
           System.out.println(alphabet[i]);
        }

    }
}
