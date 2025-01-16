import com.alibaba.fastjson.JSON;
import org.example.TestSet;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        String serJson1 = "{\"@type\":\"org.example.TestSet\",\"abc\":\"666\"}";
        TestSet testSet1 = (TestSet) JSON.parse(serJson1);
        Class<?> clazz = testSet1.getClass();

        // 获取当前类的属性和值
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("属性名: " + field.getName() + ", 值: " + field.get(testSet1));
        }
    }
}
