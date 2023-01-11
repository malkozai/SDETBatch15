package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        below line is reserving a box in the computer memory.
        we are calling it box1 if we need the information that we are storing inside the bos
        we can simply say to the computer give us the contents of box1.
        int=> is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        // if we are printing something from a box we don't need ""
        System.out.println(box1); // bring the contents of the box1 and print them on the console
        /*to store whole number (Numbers without decimals point) we have 4 different types of boxes.
        for example number like 10 20 3000 100000 3300000
        1) byte 2) short 3) int 4) long
        byte no larger number then 127
        if we need to store larger number we should try short
        */
        byte box2=127;
        byte box3 =-128;
        short box4=32767;
        short box5=-3256;
        int biggerBox=1234567; // most common type of box
        long maxBox=1236787634534534l; // why we put l with the long and why we don't with the other type

        /*
        reserve a box which can hold the number 10000 call it myBox and print its values on the console
         */
        short myBox=10000;
        System.out.println(myBox);


    }
}