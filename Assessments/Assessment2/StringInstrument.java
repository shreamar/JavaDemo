package Assessment2;

public class StringInstrument extends Instrument{

    private int stringNumber;

    @Override
    public void playSound(){
        playSound(stringNumber);
    }
    public void playSound(int stringNumber){
        //procedure here
    }
}
