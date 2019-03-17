package cn.tf.pattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(PlayType.MP3,"name1");
        audioPlayer.play(PlayType.WMA,"bb");
        audioPlayer.play(PlayType.AVI,"cc");
        audioPlayer.play(PlayType.MP4,"dd");
    }
}
