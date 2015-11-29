package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP_Delphi\\Desktop\\111.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();            //помещаем в line  считаную строку
            int count = 0;
            while (line != null) {
                sb.append(line);
                line = br.readLine();
                count++;                                //вычисляем кол-ство строк
            }
            br.close();                                 //закрываем поток считывания


            BufferedReader brr = new BufferedReader(new FileReader("C:\\Users\\HP_Delphi\\Desktop\\111.txt"));
            String arrey[] = new String[count];                 //создаем массив заданого размера
            for (int i = 0; i < arrey.length; i++){
                arrey[i] = brr.readLine();                          //заполняем массив

            }
//            System.out.println(Arrays.deepToString(arrey));               //выводим массив
            for (int i = 0; i < arrey.length; i++){
                for (int j = 0; j < arrey.length-1; j++){
                    if (arrey[j].length() > arrey[j+1].length()){                   //сортируем массив
                        String h;                                                    //резервная строка
                        h = arrey[j];
                        arrey[j] = arrey[j+1];
                        arrey[j+1]= h;
                    }
                }
            }
            System.out.println(Arrays.deepToString(arrey));                     //выводим отсортированый массив


            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\HP_Delphi\\Desktop\\new111.txt"));
            for (int i = 0; i <arrey.length; i++){
                bw.append(arrey[i]);                                        //Записываем в строку значение отсортированного массива
                bw.newLine();                                               //создание новой строки
            }
            bw.close();                                                     //закрываем поток записи





            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

        System.out.println();

    }
}
