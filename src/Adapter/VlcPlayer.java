package Adapter;

/**
 * @Title: VlcPlayer
 * @Description: AdvancedMediaPlayer的Vlc实现类
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/26 14:18
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
