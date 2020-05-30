package io.github.fatihbozik.ch9.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example8 {
    public static void main(String[] args) {
        Path path3 = Paths.get("/data");
        Path path4 = Paths.get("/user/home");

        Path relativePath = path3.relativize(path4);
        System.out.println("RelativePath: " + relativePath);

        Path resolvedPath = path3.resolve(relativePath);
        System.out.println("ResolvedPath: " + resolvedPath);

        System.out.println("NormalizedPath: " + resolvedPath.normalize());

        Path path5 = Paths.get("../a/../b/.."); // ..
        System.out.println(path5.normalize());
    }
}
