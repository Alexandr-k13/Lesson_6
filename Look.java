
//* Написать программу,которая проверяет присутствует ли указанное
// пользователем слово в файле (работаем только с латиницей).

package geekbrains;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Look {

    public static void main(String[] args) {
        LookFile("Think.txt","wunderful");

    }
    public static void LookFile(String fileName, String word){
        try{
            FileInputStream fis = new FileInputStream(fileName);
            int symbol = 0;
            int index = 0;
            byte[] wordBytes = word.getBytes();
            do{
                symbol = fis.read();
                if (wordBytes[index] == symbol){
                    index++;
                    if (index == wordBytes.length){
                        System.out.println("Слово найдено.");
                        break;
                    }
                }else{
                    index = 0;
                }
            }while (symbol != -1);


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
