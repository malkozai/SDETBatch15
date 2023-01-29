package Class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        // this is how we create 2D arrays
        // in array numbers starts from zero (0)

        String [][] thomsonTrain = new String[3][]; // A 2D array which can hold 3 one D arrays, each of size 3
        String [] cabin0 = {"Yamin", "Mohammad", "Alkozai"};
        String [] cabin1 = {"Nabi", "Saud", "Anees"};
        String [] cabin2 = {"Safi", "Abera", "Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        // in the first [] bracket we specify the address of 1 D ARRAY // first [] (cabin)
        // in the second [] bracket we specify the value of the index  // second [] (Alkozai) the seat
        System.out.println(thomsonTrain[0][2]); // cabin 0 index 2(Alkozai) will be printed
        System.out.println(thomsonTrain[2][1]); // cabin 2 index 1(Abera) will be printed

        // if we sout and add the (Arrays.toString(thomsonTrain[0])) will print all the index value
        System.out.println(Arrays.toString(thomsonTrain[0]));
    }
}
