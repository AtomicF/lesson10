package ru.innopolis.lesson10;

import java.io.*;
import java.nio.file.Files;

public class Loader extends ClassLoader {

    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            byte[] b = Files.readAllBytes(new File(name + ".class").toPath());

            return defineClass(null, b, 0, b.length);
        } catch (IOException e) {
            return super.loadClass(name);
        }
    }
}
