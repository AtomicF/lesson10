package ru.innopolis.lesson10;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;

public class Compiler {
    public void runtimeMethod() {
        ClassCreator reader = new ClassCreator();
        File file = new File(reader.fileName);
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, System.out, System.err, file.getPath());
    }
}