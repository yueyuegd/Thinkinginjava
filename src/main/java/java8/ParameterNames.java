package java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 为了在Java运行时获得Java程序中方法的参数名称：
 * 1.语言层面：使用反射API和Parameter.getName()方法
 * 2.字节码层面：使用心得javac编译器以及-parameters参数
 */
public class ParameterNames {
    public static void main(String[] args) throws Exception{
        Method method = ParameterNames.class.getMethod("main", String[].class);
        for (final Parameter parameter : method.getParameters()) {
            System.out.println("Parameters: " + parameter.getName());
        }
    }
}
