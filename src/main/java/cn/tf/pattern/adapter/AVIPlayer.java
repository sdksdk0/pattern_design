package cn.tf.pattern.adapter;

public  class AVIPlayer implements AdvancedMediaPlayer{
    @Override
    public void playAVI(String fileName) {
        System.out.println("正在播放avi的视频:"+fileName);
    }

    @Override
    public void playWMV(String fileName) {

    }

}
