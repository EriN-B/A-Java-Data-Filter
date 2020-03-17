package com.company;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Data_File {

    public void DataToNewFile(){
        try {
            File MyFile = new File("C:\\Projects\\Repositorys\\Java-DataFilter\\src\\com\\company\\Data_Files\\Data.txt");
            Scanner myReader = new Scanner(MyFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine().toLowerCase();
                File TextData =  new File ("C:\\Projects\\Repositorys\\Java-DataFilter\\src\\com\\company\\Data_Files\\Filtered_Data.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(TextData));
                writer.write(data);
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
