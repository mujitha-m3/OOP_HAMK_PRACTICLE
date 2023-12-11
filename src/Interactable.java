abstract class Interactable {
    public boolean isOn = false;

    public abstract void interact();
}


class Door extends Interactable {
    @Override
    public void interact() {
        if (!isOn) {
            System.out.println("Door opened");
            isOn = true;
        } else {
            System.out.println("Door closed");
            isOn = false;
        }
    }
}

class LightSwitch extends Interactable {
    @Override
    public void interact() {
        if (!isOn) {
            System.out.println("Lights turned on");
            isOn = true;
        } else {
            System.out.println("Lights turned off");
            isOn = false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        LightSwitch lightSwitch = new LightSwitch();

        door.interact();          
        door.interact();         
        System.out.println(door.isOn);  

        lightSwitch.interact();    
        lightSwitch.interact();    
        System.out.println(lightSwitch.isOn);  // Output: false
    }
}