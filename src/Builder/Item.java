package Builder;

import Builder.Packing.Packing;

/**
 * @Title: Item
 * @Description: 一个表示食物条目的接口
 * @author: youqing
 * @version: 1.0
 * @date: 2018/12/28 10:01
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
