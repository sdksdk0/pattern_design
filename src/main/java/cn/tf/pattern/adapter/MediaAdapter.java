package cn.tf.pattern.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(Enum audioType){
        if(PlayType.AVI.equals(audioType)){
            advancedMediaPlayer = new AVIPlayer();
        }else if(PlayType.WMA.equals(audioType)){
            advancedMediaPlayer = new WMAPlayer();
        }else{
            System.out.println("不支持的格式");
        }
    }


    @Override
    public void play(Enum audioType, String fileName) {
        if(PlayType.AVI.equals(audioType)){
            advancedMediaPlayer.playAVI(fileName);
        }else if(PlayType.WMA.equals(audioType)){
            advancedMediaPlayer.playWMV(fileName);
        }else{
            System.out.println("不支持的格式");
        }

    }
}
