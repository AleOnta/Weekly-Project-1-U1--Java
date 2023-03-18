package Player;

public class Audio extends File implements Play, Volume {
    private int length;
    private int volume = 5;

    public Audio(String fileTitle, int audioLength) {
        super(fileTitle);
        length = audioLength;
        System.out.println("type = Audio |");
        System.out.println("|-------------------------------| \n");
    }

    public Audio(String fileTitle,int audioLength, int preferredVolume) {
        this(fileTitle, audioLength);
        volume = preferredVolume;
    }

    // overriding Play interface method
    @Override
    public void play() {
        // super class static method that print in console the volume expressed in "!"
        String convertedVolume = File.convert(volume, "!");
        int i = 0;
        while(i < length) {
            i++;
            if(i < 10) {
                System.out.print("0" + i + ":00 - ");
            } else {
                System.out.print(i + ":00 - ");
            }
            System.out.println(title + " volume: " + convertedVolume);
        }
        System.out.println("\n");
    }

    // overriding Volume interface method
    @Override
    public void increaseVolume() {
        volume++;
    }

    // overriding Volume interface method
    @Override
    public void decreaseVolume() {
        volume--;
    }
}
