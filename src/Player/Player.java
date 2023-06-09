package Player;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    public static Scanner myScan = new Scanner(System.in);

    private static ArrayList<File> fileArray = new ArrayList<File>();
    public static void main(String[] args) {
        System.out.println("Welcome to the Epicode Player, what would you rather do? \n");
        while(fileArray.size() < 5) {
            runMyPlayer();
        }
        System.out.println("\n");
        playOrShow();
    }

    private static void runMyPlayer() {
        System.out.println("     CHOSE DESIRED FILE    ");
        System.out.println("|--------------------------|");
        System.out.println("| 1 = Add a new Image file |");
        System.out.println("|--------------------------|");
        System.out.println("| 2 = Add a new Audio file |");
        System.out.println("|--------------------------|");
        System.out.println("| 3 = Add a new Video file |");
        System.out.println("|--------------------------|");
        String title;
        int brightness, volume, length;
        switch (myScan.nextInt()) {
            case 0:
                System.out.println("Okay then, shutting off the player...");
            // in case user select 1 - system will proceed with the creation of a new image
            case 1:
                System.out.println("|-----------------------------------|");
                System.out.println("| Perfect, let's add a new image:   |");
                System.out.println("|-----------------------------------|");
                title = askForTitle();
                System.out.println("|---------------------------------------------------------------|");
                System.out.println("| Would you like to set a personal brightness to the image? y/n |");
                System.out.println("|---------------------------------------------------------------|");
                String answer = myScan.next();
                if (Objects.equals(answer, "y")) {
                    brightness = askForBrightness();
                    System.out.println("|-------------------------------|");
                    System.out.println("| Perfect!                      |");

                    Image i = new Image(title, brightness);
                    fileArray.add(i);
                } else {
                    System.out.println("|-------------------------------|");
                    System.out.println("| Okay then.                    |");
                    Image i = new Image(title);
                    fileArray.add(i);
                }
                break;
            // in case user select 2 - system will proceed with the creation of a new audio
            case 2:
                System.out.println("|-----------------------------------|");
                System.out.println("| Perfect, let's add a new Audio:   |");
                System.out.println("|-----------------------------------|");
                title = askForTitle();
                System.out.println("|-----------------------------------------------------------|");
                System.out.println("| Would you like to set a personal volume to the audio? y/n |");
                System.out.println("|-----------------------------------------------------------|");
                answer = myScan.next();
                if (Objects.equals(answer, "y")) {
                    volume = askForVolume();
                    length = askForLength();
                    System.out.println("|-------------------------------|");
                    System.out.println("| Perfect!                      |");
                    Audio a = new Audio(title, length, volume);
                    fileArray.add(a);
                } else {
                    System.out.println("Okay then.");
                    length = askForLength();
                    Audio a = new Audio(title, length);
                    fileArray.add(a);
                }
                break;
            // in case user select 3 - system will proceed with the creation of a new video
            case 3:
                System.out.println("|-----------------------------------|");
                System.out.println("| Perfect, let's add a new Video:   |");
                System.out.println("|-----------------------------------|");
                title = askForTitle();
                length = askForLength();
                System.out.println("|-------------------------------|");
                System.out.println("| Perfect!                      |");
                Video v = new Video(title, length);
                fileArray.add(v);
                break;
            default:
                System.out.println("Incorrect value, please, insert an integer value between 1 & 3");
                break;

        }

    }
    // static Player method to let the user set the title of the file he is creating through console
    private static String askForTitle() {
        System.out.println("| Insert the title of the new file: |");
        System.out.println("|-----------------------------------|");
        return myScan.next();
    }
    // static Player method to let the user set the brightness of the file he is creating through console
    private static int askForBrightness() {
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("| Okay, then digit in the terminal an integer number between 1 & 10: |");
        System.out.println("|--------------------------------------------------------------------|");
        int bright = 0;
        boolean okay = true;
        while (okay) {
            if (myScan.hasNextInt()) {
                bright = myScan.nextInt();
            } else {
                System.out.println("|-----------------------------------------------|");
                System.out.println("| Unfit type of input, please insert an integer |");
                System.out.println("|-----------------------------------------------|");
                myScan.next();
                continue;
            }
            okay = false;
        }
        return bright;
    }
    // static Player method to let the user set the volume of the file he is creating through console
    private static int askForVolume() {
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("| Okay, then digit in the terminal an integer number between 1 & 10: |");
        System.out.println("|--------------------------------------------------------------------|");
        int volume = 0;
        boolean okay = true;
        while (okay) {
            if (myScan.hasNextInt()) {
                volume = myScan.nextInt();
            } else {
                System.out.println("|-----------------------------------------------|");
                System.out.println("| Unfit type of input, please insert an integer |");
                System.out.println("|-----------------------------------------------|");
                myScan.next();
                continue;
            }
            okay = false;
        }
        return volume;
    }
    // static Player method to let the user set the length of the file he is creating through console
    private static int askForLength() {
        System.out.println("|-------------------------------------------------------------------------------------------|");
        System.out.println("| Okay, then digit in the terminal an integer number between 1 & 59 as length of the audio: |");
        System.out.println("|-------------------------------------------------------------------------------------------|");
        int length = 0;
        boolean okay = true;
        while (okay) {
            if (myScan.hasNextInt()) {
                length = myScan.nextInt();
            } else {
                System.out.println("|-----------------------------------------------|");
                System.out.println("| Unfit type of input, please insert an integer |");
                System.out.println("|-----------------------------------------------|");
                myScan.next();
                continue;
            }
            okay = false;
        }
        return length;
    }
    // static Player method to let the user display in console the desired file
    private static void playOrShow() {
        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("| Okay, player memory is at its full capacity                               |");
        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("| What file would you like to run? Digit the index of the file in question: |");
        System.out.println("|---------------------------------------------------------------------------|");
        printAllFileTitle();
        int pick = 6;
        while(true) {
            // printing again list of file available only if the cicle isn't at its first round.
            if (pick != 6) {
                printAllFileTitle();
                System.out.println("\n|----------------------------------------------------------|");
                System.out.println("| Select an another file or press 0 to shut off the player |");
                System.out.println("|----------------------------------------------------------|");
            }
            pick = myScan.nextInt();
            // casting the selected file as his real Class to call his own methods
            if (pick == 0) {
                // if pick is equals to 0, system will shut off
                System.out.println("|---------------------------------------------|");
                System.out.println("| Shutting off the player, see you next time! |");
                System.out.println("|---------------------------------------------|");
                System.out.println("| Made by Alessandro Ontani                   |");
                System.out.println("|---------------------------------------------|");
                break;
            } else if (fileArray.get(pick - 1) instanceof Image i) {
                i.show();
            } else if (fileArray.get(pick - 1) instanceof Audio a) {
                a.play();
            } else {
                Video v = (Video) fileArray.get(pick - 1);
                v.play();
            }
        }
    }

    // calling a static Player method to print all files available in memory (fileArray)
    private static void printAllFileTitle() {
        for(int i = 0; i < fileArray.size(); i++) {
            System.out.println("|----------------------------------------|");
            System.out.println("| " + (i + 1) + " - " + fileArray.get(i).title);
        }
        System.out.println("|----------------------------------------|");
    }
}
