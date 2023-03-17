package Player;

public class Image extends File implements Brightness, Show{
    private int brightness = 5;

    public Image(String fileTitle) {
        super(fileTitle);
        System.out.println("type = Image");
    }
    public Image(String fileTitle, int preferredBrightness) {
        this(fileTitle);
        brightness = preferredBrightness;
    }

    @Override
    public void show() {
        String convertedBrightness = "";
    for (int i = 0; i < brightness; i++) {
        convertedBrightness += "*";
    }
    System.out.println( title + " " + convertedBrightness);
    }

    @Override
    public void increaseBrightness() {
        brightness++;
    }

    @Override
    public void decreaseBrightness() {
        brightness--;
    }


}
