//Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);

package geekbrains;


import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static String COOL = "12345678900UYGVNKJNBVVCFGHBBV121314152728292222202i";
    static Random rnd = new Random();

    public static void main(String[] args) {

        createFile(" text_1.txt ", createString(100));
        createFile(" text_2.txt ", createString(100));
    }

    public static String createString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(COOL.charAt(rnd.nextInt(COOL.length())));
        }

        return sb.toString();
    }

    public static void createFile(String fileName, String text) {
        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.write(text);
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}