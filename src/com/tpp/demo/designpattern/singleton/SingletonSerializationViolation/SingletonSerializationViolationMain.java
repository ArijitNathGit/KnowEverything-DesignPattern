package com.tpp.demo.designpattern.singleton.SingletonSerializationViolation;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonSerializationViolationMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        SingletonSerializationViolation singletonSVObj1 = SingletonSerializationViolation.getInstance();
        SingletonSerializationViolation singletonSVObj2 = SingletonSerializationViolation.getInstance();
        System.out.println("Singleton before serialization violation Object 1: " + singletonSVObj1);
        System.out.println("Singleton before serialization violation Object 2: " + singletonSVObj1);
        System.out.println();

        ObjectOutputStream outStream1 = new ObjectOutputStream(new FileOutputStream("obj1.ser"));
        outStream1.writeObject(singletonSVObj1);

        ObjectOutputStream outStream2 = new ObjectOutputStream(new FileOutputStream("obj2.ser"));
        outStream2.writeObject(singletonSVObj2);

        ObjectInputStream inStream1 = new ObjectInputStream(new FileInputStream("obj1.ser"));
        ObjectInputStream inStream2 = new ObjectInputStream(new FileInputStream("obj2.ser"));

        SingletonSerializationViolation singletonSVObj3 = (SingletonSerializationViolation) inStream1.readObject();
        System.out.println("Singleton after serialization violation Object 3: " + singletonSVObj3);
        SingletonSerializationViolation singletonSVObj4 = (SingletonSerializationViolation) inStream2.readObject();
        System.out.println("Singleton after serialization violation Object 4: " + singletonSVObj4);
    }
}
