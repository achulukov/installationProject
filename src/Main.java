import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder logo = new StringBuilder();


        File src = new File("Games/src");
        if (src.mkdir())logo.append("Создана директория " + src.getName() + "\n");

        File res = new File("Games/res");
        if (res.mkdir())logo.append("Создана директория " + res.getName() + "\n");

        File savegames = new File("Games/savegames");
        if (savegames.mkdir())logo.append("Создана директория " + savegames.getName() + "\n");

        File temp = new File("Games/temp");
        if (temp.mkdir())logo.append("Создана директория " + temp.getName() + "\n");

        File main = new File("Games/src/main");
        if (main.mkdir())logo.append("Создана директория " + main.getName() + "\n");

        File test = new File("Games/src/test");
        if (test.mkdir())logo.append("Создана директория " + test.getName() + "\n");

        File mainJava = new File("Games/src/main/Main.java");
        try {
            if (mainJava.createNewFile()) logo.append("Создан файл " + mainJava.getName() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File utilsJava = new File("Games/src/main/Utils.java");
        try {
            if (utilsJava.createNewFile()) logo.append("Создан файл " + utilsJava.getName() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File drawables = new File("Games/res/drawables");
        if (drawables.mkdir())logo.append("Создана директория " + drawables.getName() + "\n");

        File vectors = new File("Games/res/vectors");
        if (vectors.mkdir())logo.append("Создана директория " + vectors.getName() + "\n");

        File icons = new File("Games/res/icons");
        if (icons.mkdir())logo.append("Создана директория " + icons.getName() + "\n");

        File tempJava = new File("Games/temp/temp.txt");
        try {
            if (tempJava.createNewFile()) logo.append("Создан файл " + tempJava.getName() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try(BufferedWriter logoWrite = new BufferedWriter(new FileWriter(tempJava))) {
            logoWrite.write(logo.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
