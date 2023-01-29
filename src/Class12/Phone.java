package Class12;

public class Phone {

    String brand;
    String color;
    int price;
    int version;
    double storage;
    boolean isUnlocked;

    void ringing() {
        System.out.println("Ringing Ringing");
    }
    void sendingMessages() {
            System.out.println("SMS");
        }
    void calling(){
        System.out.println("Sending and receiving calls");
    }
    void usingGPS(){
        System.out.println("Showing a Map");
    }
    void playingGames(){
        System.out.println("Video games");
    }
}
