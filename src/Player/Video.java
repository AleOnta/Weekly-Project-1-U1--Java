package Player;

public class Video extends File implements Play, Volume, Brightness {

    private int volume = 5;
    private int brightness = 5;
    private int length;

    public Video(String fileTitle, int videoLength) {
        super(fileTitle);
        length = videoLength;
        System.out.println("type = Video");
    }

    // overriding Play interface method
    @Override
    public void play() {
        // super class static method that return the amount of "!" or "*" based on param volume or brightness
        String convertedVolume = File.convert(volume, "!");
        String convertedBrightness = File.convert(brightness, "*");
        int i = 0;
        while(i < length) {
            i++;
            if(i < 10) {
                System.out.print("0" + i + ":00 - ");
            } else {
                System.out.print(i + ":00 - ");
            }
            System.out.println(title + " volume: " + convertedVolume + ", brightness: " + convertedBrightness);
        }
        System.out.println("\n");
    }

    // overriding Brightness interface method
    @Override
    public void increaseBrightness() {
        brightness++;
    }

    // overriding Brightness interface method
    @Override
    public void decreaseBrightness() {
        brightness--;
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
