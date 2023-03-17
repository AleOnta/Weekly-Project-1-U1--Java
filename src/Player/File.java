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

    public static String convert(int n, String ch) {
        String converted = "";
        for (int i = 0; i < n; i++) {
            converted += ch;
        }
        return converted;
    }

    public static void convert(String title, int n, String ch) {
        String converted = "";
        for (int i = 0; i < n; i++) {
            converted += ch;
        }
        System.out.println( title + " " + converted);
    }

}
