import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String FilePath = "src/The Tututu (Slowed Version)(PagalWorld.com.so).wav";
        File file = new File(FilePath);
        try(Scanner sc = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String res = "";
            while (!res.equals('Q')){
                System.out.println("P --> Play");
                System.out.println("S --> Stop");
                System.out.println("R --> Reset");
                System.out.println("Q --> Quit");
                System.out.println("Enter Your Choice :- ");
                res = sc.next().toUpperCase();
                switch (res) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        clip.close();
                        break;
                    default:
                        System.out.println("Invalid Choice...!");
                }

            }
            System.out.println("No Problem Detected...!");
        }
        catch (FileNotFoundException e){
            System.out.println("File is Not Available ");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio File Is Not Supported...!");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resources...!");
        }
        catch (IOException e){
            System.out.println("Something Want to Wrong...!");
        }
        finally {
            System.out.println("Bye...!");
        }
     }
}