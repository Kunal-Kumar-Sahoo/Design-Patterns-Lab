package MediaPlayer;

public class mp4Player implements AdvancedMediaPlayer {
    @Override
    public void play_mp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }

    @Override
    public void play_vlc(String fileName) {}
}
