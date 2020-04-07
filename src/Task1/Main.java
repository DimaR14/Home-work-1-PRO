package Task1;

import javafx.application.Application;
import javafx.stage.Stage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Task1 {
    @MyTest(a = 5, b = 19
    )
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws InvocationTargetException, IllegalAccessException {
    Class<?> cls = Task1.class;
    Method[] methods = cls.getDeclaredMethods();
    for(Method m : methods){
        if(m.isAnnotationPresent(MyTest.class)){
            MyTest test = m.getAnnotation(MyTest.class);
            int res = (Integer)m.invoke(null, test.a(),test.b());
            System.out.println(res);
        }

    }

    }
}
