package Assessment2;

public class WindInstrument extends Instrument{

    private float windSpeed;

    @Override
    public void playSound(){
        playSound(windSpeed);
    }

    public void playSound(float windSpeed){
        //procedure here
    }
}
