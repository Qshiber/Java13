package org.SDA.Exceptions.Exercises.Ex1;


import com.google.gson.Gson;

import java.io.*;
import java.util.List;

public class FileManager {

    private static void writeToTextFile(String filePath, String text) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    private static String readFromTextFile(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String wholeText = "";
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                wholeText += "\n" + currentLine;
            }

            return wholeText;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        } catch (IOException e) {
            System.out.println("Error");
            return null;
        }
    }

    public static <T> T readFromJSON(String filePath, Class<T> clazz) {
        Gson gson = new Gson();
        String json = readFromTextFile(filePath);
        T obj = gson.fromJson(json, clazz);
        return obj;
    }

    public static <T> void writeToJson(String filePath, T obj) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        writeToTextFile(filePath, json);
    }

}
