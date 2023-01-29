package Class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name1 = "Mohammad";
        String name2 = "Yamin";
        String name3 = "Ibrahim";
        String name4 = "Sulaiman";
        String name5 = "Ayesha";

        String [] names = {"Mohammad", "Yamin","Ibrahim","Sulaiman","Ayesha"};
        System.out.println(names[1]);
        System.out.println(names[4]);
       // System.out.println(names[5]); this one will give us error because there is no name on the index number 5
        // System.out.println(names[-5]); error because index can't be negative
        // write a loop to print all the names from array


        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }


    }
}
