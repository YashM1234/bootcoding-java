package com.bootcoding.java.filehandling.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile{
    public static void main(String[] args) {
        File file = new File("src/main/java/com/bootcoding/java/filehandling/file/CreateFile.java");

        //BufferedReader
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }

        //Scanner
        try {
            Scanner readFile = new Scanner(file);
            while(readFile.hasNext()){
                System.out.println(readFile.nextLine());
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }

        //FileReader
        try{
            FileReader readChar = new FileReader(file);
            int i;
            while((i = readChar.read()) != - 1){
                System.out.print((char) i);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
