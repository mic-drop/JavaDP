package stateDP;

public class OffState  implements LightState{
    @Override
    public void pressSwitch(LightSwitch lightSwitch) {
        System.out.println("Turning on the lights");
        lightSwitch.setLightState(new OnState());
        System.out.println("Lights on");
    }
}
