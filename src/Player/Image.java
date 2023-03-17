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

    // overriding Show interface method
    @Override
    public void show() {
        File.convert(title, brightness, "*");
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

    // overriding toString method
    @Override
    public String toString() {
        return "Image{" +
                "title= " + title + "; " +
                "brightness= " + brightness +
                '}';
    }
}
