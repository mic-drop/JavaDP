package stateDP;

public class OnState implements LightState {
    @Override
    public void pressSwitch(LightSwitch lightSwitch) {
        System.out.println("Turning off the lights");
        lightSwitch.setLightState(new OffState());
        System.out.println("lights off");
    }
}
