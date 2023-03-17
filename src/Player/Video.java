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

    @Override
    public void play() {
        // super class static method that return the amount of "!" or "*" based on param volume or brightness
        String convertedVolume = File.convert(volume, "!");
        String convertedBrightness = File.convert(brightness, "*");
        int i = 0;
        while(i < length) {
            i++;
            System.out.print("0" + i + ":00 - ");
            System.out.println(title + " volume: " + convertedVolume + ", brightness: " + convertedBrightness);
        }
        System.out.println("\n");
    }

    @Override
    public void increaseBrightness() {
        brightness++;
    }

    @Override
    public void decreaseBrightness() {
        brightness--;
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
