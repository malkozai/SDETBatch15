package Class10;

public class D2ArrayDemo1 {
    public static void main(String[] args) {

        int [][] matrix = { {10,20,30},
                            {55,22,45},
                            {100,220,450}
        };

     //  System.out.println(matrix[2][1]); // first [] bracket is for row 2 and second [] bracket is for colom 2

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
