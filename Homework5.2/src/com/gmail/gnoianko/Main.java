package com.gmail.gnoianko;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File fileOne = new File("E:\\КУРСИ JAVA\\javaOOP\\IdeaProjectsOOP\\Homework5.2\\One.txt");
        File fileTwo = new File("E:\\КУРСИ JAVA\\javaOOP\\IdeaProjectsOOP\\Homework5.2\\Two.txt");
        File fileResult = new File("E:\\КУРСИ JAVA\\javaOOP\\IdeaProjectsOOP\\Homework5.2\\Result.txt");
        FileWork.saveEqualsWords(fileOne, fileTwo, fileResult);
    }


}
