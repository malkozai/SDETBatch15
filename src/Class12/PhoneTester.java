package Class12;

public class PhoneTester {
    public static void main(String[] args) {

        Phone Iphone = new Phone();
        Iphone.brand = "Iphone";
        Iphone.color = "Silver";
        Iphone.price = 1500;
        Iphone.version = 11;
        Iphone.isUnlocked = true;
        Iphone.ringing();
        Iphone.sendingMessages();
        Iphone.calling();
        Iphone.usingGPS();
        Iphone.playingGames();

        Phone googlePixel=new Phone();
        googlePixel.brand="Pixel";
        googlePixel.color="black";
        googlePixel.price=900 ;
        googlePixel.version=7 ;
        googlePixel.storage=512 ;
        googlePixel.isUnlocked=false;
        googlePixel.sendingMessages();


        Phone s22Ultra=new Phone();
        s22Ultra.brand="Samsung ";
        s22Ultra.color="Silver";
        s22Ultra.price=700 ;
        s22Ultra.version=9;
        s22Ultra.storage=64 ;
        s22Ultra.isUnlocked=false;
        s22Ultra.ringing();
    }
}
