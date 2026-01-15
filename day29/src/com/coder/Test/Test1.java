package com.coder.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test1 {
    public static void main(String[] args) throws Exception {
        ResourceBundle bundle=ResourceBundle.getBundle("value");
        Class<?> aClass = Class.forName("com.coder.Test.Student");
        Object obj = aClass.getConstructor().newInstance();
        Field[] fields=aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            String value=bundle.getString(name);
            if (field.getType().getSimpleName().equals("String"))
                field.set(obj,value);
            else if (field.getType().getSimpleName().equals("int"))
                field.set(obj,Integer.parseInt(value));
        }
        Student student= (Student) obj;
        System.out.println(student);

    }
}
