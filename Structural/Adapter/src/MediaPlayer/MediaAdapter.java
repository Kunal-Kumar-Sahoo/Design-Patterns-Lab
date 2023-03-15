package MediaPlayer;

public class MediaAdapter implements Mediaplayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new vlcPlayer();
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new mp4Player();
    }

    @Override
    public void play(String fileName) {
        String audioType = fileName.substring(fileName.length()-3, fileName.length());
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.play_vlc(fileName);
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.play_mp4(fileName);
    }
}
