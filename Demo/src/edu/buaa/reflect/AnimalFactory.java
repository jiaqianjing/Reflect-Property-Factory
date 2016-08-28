package edu.buaa.reflect;

/**
 * Created by Administrator on 2016/8/28.
 */
public class AnimalFactory {
    public static  Animals getInstance(String ClassName){
        Animals animals = null;
        try {
            animals = (Animals) Class.forName(ClassName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return animals;
    }
}
