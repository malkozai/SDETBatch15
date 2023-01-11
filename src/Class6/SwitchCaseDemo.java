package Class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country = "Afghanistan";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ // toLowerCase() converts the text to lowercase USA=>usa

            case "usa":
                System.out.println("Burger");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            default:
                System.out.println("Wrong Country");

        }
    }
}
