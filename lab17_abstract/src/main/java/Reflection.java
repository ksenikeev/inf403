import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reflection {

    private Date date = new Date();

    public static String test1(String str) {
        return str.toUpperCase();
    }

    public String test2(String dateFormat) {
        return new SimpleDateFormat(dateFormat).format(date);
    }

    public static void main(String ... args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = Reflection.class.getMethods();

        for (Method method : methods) {
            if (method.getName().equals("test1")) {
                System.out.println(method.invoke(null, "Привет"));
            }
            System.out.println(method.getName());
        }
    }
}
