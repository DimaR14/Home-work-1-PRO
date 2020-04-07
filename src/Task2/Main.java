package Task2;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {

        TextContainer ct = new TextContainer("Home work is done");
        Class<?> cls =  ct.getClass();
        if(!cls.isAnnotationPresent(SaveTo.class)){
            System.out.println("ERORRRR");
            return;
        }
        SaveTo save = cls.getAnnotation(SaveTo.class);
        String path = save.path();
        Method[] methods = cls.getDeclaredMethods();
        for(Method m1 : methods){
            if(m1.isAnnotationPresent(Save.class)){
                m1.invoke(ct,path);
                System.out.println("DONE");
                break;
            }
        }

    }
}