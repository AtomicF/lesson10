package ru.innopolis.lesson10;

import java.io.*;

public class ClassCreator {
    /**
     *  File for writing the code read from the console
     */
    public final String fileName = "SomeClass.java";
    /**
     * Method reads text from console and writes to file
     */
    public void readFromConsole() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            bufferedWriter.write("package ru.innopolis.lesson10;\n" +
                    "\n" +
                    "public class SomeClass implements Worker {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void doWork() {");

            String str;
            while (!(str = reader.readLine()).equals("")) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }

            bufferedWriter.write(" }\n" +
                    "}");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

