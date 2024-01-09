package com.bootcoding.java.filehandling.file;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {

        //FileOutputStream
        try{
            String text = "Writing in the file using FileOutputStream...";
            FileOutputStream writer = new FileOutputStream(new File("src/main/resources/write/test.txt"), true);
            writer.write(text.getBytes());
            writer.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

        //BufferedWriter
        try{
            String text = "\nWriting in the file using BufferWriter...";
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/main/resources/write/test.txt"), true));
            writer.write(text);
            writer.flush();
            writer.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

        //PrintStream
        try{
            String text = "\nWriting in the file using PrintStream...";
            PrintStream writer = new PrintStream(new FileOutputStream(new File("src/main/resources/write/test.txt"), true));
            writer.println(text);
            writer.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
