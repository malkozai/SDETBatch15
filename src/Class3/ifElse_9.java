package Class3;

public class ifElse_9 {
    public static void main(String[] args) {

        char c = 'M';
        if(c=='M'){
            System.out.println("Male");
        }
        String name = "Nat";

        // with non-primitive data type such as String we can't use == symbol.
        if(name.equals("Mohammad")){
            System.out.println("Amazing Student");
        }
        // ! symbol can change true to false and false to true

        if(!name.equals("Mohammad")) {
            // ! exclamation means not and will reverse
            System.out.println("Super Amazing Student");
        }
    }
}
