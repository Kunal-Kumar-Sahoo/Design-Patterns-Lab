package MediaPlayer;

public class vlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play_vlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void play_mp4(String fileName) {}
}
