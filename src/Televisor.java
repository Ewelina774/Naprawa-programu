public class Televisor {

    boolean isOn;

    Televisor (boolean status) {
        isOn = status;
    }

    void turnOn (){
        isOn = true;
    }

    void turnOff () {
        isOn = false;
    }

    void showStatus () {
        System.out.println("Czy telewizor jest włączony?" + isOn);
    }
}
