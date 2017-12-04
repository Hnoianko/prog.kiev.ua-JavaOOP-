package com.gmail.gnoianko;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        MyFileFilter mFF = new MyFileFilter("doc");
        File folderFrom = new File("D:\\Input");
        File folderTo = new File("D:\\Output");
        try {
            FilesCopy.copyFolder(folderFrom, folderTo, mFF);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


