package stateDP;

public class LightSwitch {

    private LightState lightState;

    public LightSwitch() {
        lightState = new OffState();
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    public void click(){
        lightState.pressSwitch(this);
    }
}
