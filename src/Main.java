import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static String slash = File.separator;
    private static String g = "Games" + slash;
    private static StringBuilder logo = new StringBuilder();

    private static void createFile(String pathFile) {
        File fileCreate = new File(g + pathFile);
        try {
            if (fileCreate.createNewFile()) logo.append("Создан файл " + fileCreate.getName() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void createDirectory(String pathDirectory) {
        File directoryCreate = new File(g + pathDirectory);
        if (directoryCreate.mkdir())logo.append("Создана директория " + directoryCreate.getName() + "\n");
    }

    public static void main(String[] args) {

        createDirectory("src");
        createDirectory("res");
        createDirectory("savegames");
        createDirectory("temp");
        createDirectory("src" + slash + "main");
        createDirectory("src" + slash + "test");

        createFile("src" + slash + "main" + slash + "Main.java");
        createFile("src" + slash + "main" + slash + "Utils.java");

        createDirectory("res" + slash + "drawables");
        createDirectory("res" + slash + "vectors");
        createDirectory("res" + slash + "icons");

        createFile("temp" + slash + "temp.txt");

        File tempJava = new File(g + "temp" + slash + "temp.txt");

        try(BufferedWriter logoWrite = new BufferedWriter(new FileWriter(tempJava))) {
            logoWrite.write(logo.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
