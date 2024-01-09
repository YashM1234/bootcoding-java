package com.bootcoding.java.filehandling.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("src/main/resources/createFile/text.txt");
        try{
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("File has been created!");
            }else{
                file.delete();
                System.out.println("File has been deleted!");
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
