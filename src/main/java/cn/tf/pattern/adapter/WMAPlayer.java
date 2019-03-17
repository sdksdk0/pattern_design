package cn.tf.pattern.adapter;

public  class WMAPlayer implements AdvancedMediaPlayer {
    @Override
    public void playAVI(String fileName) {

    }

    @Override
    public void playWMV(String fileName) {
        System.out.println("正在播放wmv格式的视频："+fileName);
    }
}
