package MediaPlayer;

public class AudioPlayer implements Mediaplayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String fileName) {
        String audioType = fileName.substring(fileName.length()-3, fileName.length());

        if(audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 file: " + fileName);

        else if(audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(fileName);
        }

        else if(audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(fileName);
        }

        else
            System.out.println("Invalid media type: " + audioType);
    }
}
