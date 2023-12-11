public class LightSwitch {
    private boolean lightsOn;

    public LightSwitch(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public LightSwitch() {
        this.lightsOn = false;
    }

    public void printInfo() {
        if (lightsOn) {
            System.out.println("Lights are on");
        } else {
            System.out.println("Lights are off.");
        }
    }

    protected void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }
}

public class Dimmer extends LightSwitch {
    private int brightness;

    public Dimmer() {
        super(false);  
        setBrightness(0);  
    }

    public Dimmer(boolean lightsOn, int brightness) {
        super(lightsOn);
        setBrightness(brightness);
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            setLightsOn(brightness > 0);  
        } else {
            System.out.println("Invalid brightness value. Please use a value between 0 and 100.");
        }
    }

    @Override
    public void printInfo() {
        if (brightness == 50) {
            System.out.println("Brightness is 50.");
        } else if (brightness == 0) {
            System.out.println("Lights are off.");
        } else {
            System.out.println("Brightness is "+ brightness + ".");
        }
    }

    public static void main(String[] args) {
        Dimmer dimmer = new Dimmer(false, 0);
        dimmer.printInfo();

        dimmer.setBrightness(50);
        dimmer.printInfo(); 
    }
}
