package Adapter;

/**
 * @Title: Mp4Player
 * @Description: AdvancedMediaPlayer的Mp4实现类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 14:19
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
