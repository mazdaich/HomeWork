package lesson_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\lesson_4");

        try(Stream<Path> paths = Files.walk(path)) {
            paths.forEach(System.out::println);
        }

//        try {
//            Files.walk(path)
//                    .forEach(System.out::println);
//            } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


//        Path path = Paths.get("C:\\lesson_4\\num_1\\Exep_1.1");
//
//        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
//            for (Path f : files) {
//                System.out.println(f);
//            }
//        }

        Path path1 = Paths.get("C:\\lesson_4\\num_1\\Exep_1.1\\test_write.txt");
        String str = "string \n";
        List<String> list= List.of("sting 1", "string 2");
        if (!Files.exists(path1)){
            Files.createFile(path1);
        }
        try {
            Files.write(path1, str.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
