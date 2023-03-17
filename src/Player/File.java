package Player;

public class File {
    protected String title;

    public File() {
        System.out.print("New file created ");
    }
    public File(String fileTitle) {
        this();
        title = fileTitle;
    }
}
