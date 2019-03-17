package cn.tf.pattern.adapter;

//之前的实现类
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(Enum audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(PlayType.MP3.equals(audioType)){
            System.out.println("正在播放MP3"+fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(PlayType.AVI.equals(audioType)
                || PlayType.WMA.equals(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("不支持的格式");
        }
    }
}
