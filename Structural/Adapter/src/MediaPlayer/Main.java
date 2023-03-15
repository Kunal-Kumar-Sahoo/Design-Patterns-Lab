package MediaPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("Hello.mp3");
        audioPlayer.play("Tropic-Thunder.mp4");
        audioPlayer.play("The Space Between Us.vlc");
        audioPlayer.play("Cycling.avi");
    }
}
