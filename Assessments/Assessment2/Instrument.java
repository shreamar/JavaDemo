package Assessment2;

public abstract class Instrument {
    private String name;
    public String[] sound;

    public abstract void playSound();

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
