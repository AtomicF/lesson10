package ru.innopolis.lesson10;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        ClassCreator reader = new ClassCreator();
        reader.readFromConsole();
        Compiler runtime = new Compiler();
        runtime.runtimeMethod();
        Loader loader = new Loader();
        try {
            Class<?> someClass = loader.loadClass("SomeClass");
            Worker worker = (Worker) someClass.getConstructors()[0].newInstance();
            worker.doWork();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
