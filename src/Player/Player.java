package Player;

public class Player {
    public static void main(String args[]) {
        Image f1 = new Image("provImage");
        f1.increaseBrightness();
        f1.show();

        Audio f2 = new Audio("provAudio");
        f2.decreaseVolume();
        f2.play();

        Video f3 = new Video("provVideo",6);
        f3.decreaseBrightness();
        f3.increaseVolume();
        f3.increaseVolume();
        f3.play();


    }
}
