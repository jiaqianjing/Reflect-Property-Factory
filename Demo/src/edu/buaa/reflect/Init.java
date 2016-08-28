package edu.buaa.reflect;

import java.io.*;
import java.util.Properties;

/**
 * Created by Administrator on 2016/8/28.
 */
public class Init {
    public static Properties getProper() throws IOException {
        Properties proper = new Properties();
        proper.load(Init.class.getClass().getResourceAsStream("/Animals.properties"));
//        File file = new File("Animals.properties");
//        if(!file.exists()){
//            proper.setProperty("dog","edu.buaa.reflect.Dog");
//            proper.setProperty("cat","edu.buaa.reflect.Cat");
//            proper.store(new FileOutputStream(file),"Animals.properties");
//        }else{
//            proper.load(new FileInputStream(file));
//        }
        return proper;
    }
}
