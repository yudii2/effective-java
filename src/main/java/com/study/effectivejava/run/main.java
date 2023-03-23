package com.study.effectivejava.run;

import com.study.effectivejava.item01.Fixel;
import com.study.effectivejava.item01.MessageService;
import com.study.effectivejava.item01.MessageServiceFactory;
import com.study.effectivejava.item03.PrivateSingleton;

import java.lang.reflect.*;

public class main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        PrivateSingleton instance = PrivateSingleton.INSTANCE;

        Class<? extends Class> instanceClass = PrivateSingleton.class.getClass();

        // TODO 해결해야
        AccessibleObject.setAccessible(instanceClass.getConstructors(), true);

        Constructor<PrivateSingleton> constructor = PrivateSingleton.class.getConstructor();

        System.out.println("name: " + constructor.getName());

        Method[] methods = instanceClass.getMethods();
        for (Method method : methods) {
            System.out.println("method: " + method.getName());
        }

        // Creates object of desired method by
        // providing the method name and parameter class as
        //  arguments to the getDeclaredMethod() method
        Method methodcall1
                = instanceClass.getDeclaredMethod("method2", int.class);

        // Invoking the method at runtime
        methodcall1.invoke(instance, 19);

        // Creates object of the desired field by
        // providing the name of field as argument to the
        // getDeclaredField() method
        Field field = instanceClass.getDeclaredField("s");

        // Allows the object to access the field
        // irrespective of the access specifier used with
        // the field
        field.setAccessible(true);

        // Takes object and the new value to be assigned
        // to the field as arguments
        field.set(instance, "JAVA");


    }
}
