package edu.buaa.reflect;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2016/8/28.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Properties pro = Init.getProper();
            Animals dog = AnimalFactory.getInstance(pro.getProperty("dog"));
            Animals cat = AnimalFactory.getInstance(pro.getProperty("cat"));
            dog.run();
            cat.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
