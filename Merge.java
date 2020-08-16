
//Написать программу, «склеивающую» эти файлы,
// то есть вначале идет текст из первого файла, потом текст из второго.

package geekbrains;

import java.io.*;
import java.util.Random;

public class Merge {

    static String COOL = "12345678900UYGVNKJNBVVCFGHBBV121314152728292222202i";
    static Random rnd = new Random();

    public static void main(String[] args) {
        glueFiles ( new String[]{"text_1.txt","text_2.txt"},"text_3.txt");
    }
    public static void glueFiles(String[] names, String distinationName){
        try{
            FileOutputStream fos = new FileOutputStream(distinationName);
            for (String name: names){
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if(i != -1){
                        fos.write(i);
                    }
                }while (i != -1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String createString(int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++){
            sb.append(COOL.charAt(rnd.nextInt(COOL.length())));
        }
        return sb.toString();
    }

    public static void createFile(String fileName, String text){
        try{
            PrintWriter pw = new PrintWriter(fileName);
            pw.write(text);
            pw.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}