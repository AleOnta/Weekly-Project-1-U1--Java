package Player;

public class Audio extends File implements Play, Volume {
    private int volume = 5;

    public Audio(String fileTitle) {
        super(fileTitle);
        System.out.println("type = Audio");
    }

    public Audio(String fileTitle,int preferredVolume) {
        this(fileTitle);
        volume = preferredVolume;
    }


    @Override
    public void play() {
        // super class static method that print in console the volume expressed in "!"
        File.convert(title, volume, "!");
    }

    @Override
    public void increaseVolume() {
        volume++;
    }

    @Override
    public void decreaseVolume() {
        volume--;
    }
}
