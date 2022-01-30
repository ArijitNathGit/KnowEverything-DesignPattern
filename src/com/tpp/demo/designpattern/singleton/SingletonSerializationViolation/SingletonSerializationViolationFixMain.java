package com.tpp.demo.designpattern.singleton.SingletonSerializationViolation;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonSerializationViolationFixMain {
    public static void main(String[] args) throws Exception {
        SingletonSerializationViolationFix singletonSVObj1 = SingletonSerializationViolationFix.getInstance();
        SingletonSerializationViolationFix singletonSVObj2 = SingletonSerializationViolationFix.getInstance();
        System.out.println("Singleton before serialization violation Object 1: " + singletonSVObj1);
        System.out.println("Singleton before serialization violation Object 2: " + singletonSVObj1);
        System.out.println();

        ObjectOutputStream outStream1 = new ObjectOutputStream(new FileOutputStream("fixobj1.ser"));
        outStream1.writeObject(singletonSVObj1);

        ObjectOutputStream outStream2 = new ObjectOutputStream(new FileOutputStream("fixobj2.ser"));
        outStream2.writeObject(singletonSVObj2);

        ObjectInputStream inStream1 = new ObjectInputStream(new FileInputStream("fixobj1.ser"));
        ObjectInputStream inStream2 = new ObjectInputStream(new FileInputStream("fixobj2.ser"));

        SingletonSerializationViolationFix singletonSVObj3 = (SingletonSerializationViolationFix) inStream1.readObject();
        System.out.println("Singleton after serialization violation Object 3: " + singletonSVObj3);
        SingletonSerializationViolationFix singletonSVObj4 = (SingletonSerializationViolationFix) inStream2.readObject();
        System.out.println("Singleton after serialization violation Object 4: " + singletonSVObj4);
    }
}
