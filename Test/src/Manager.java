import javafx.scene.control.Button;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Name:         {ClassName}
 * Effect:         {ClassEffect}
 * Date:           5/24/2017
 * Tested:        False
 *
 * @author {Stanusoiu Mihai-Teodor}
 * @version 1.0
 */
public class Manager {
    public Manager(Controller controller) {
        Field[] fields = controller.getClass().getFields();
        for (Field field : fields) {
            if (field.getAnnotation(FirstAnnotation.class) != null) {
                try {
                    Object object = field.get(controller);
                    Method method = field.getType().getMethod("setVisible", boolean.class);
                    method.invoke(object, Boolean.FALSE);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
