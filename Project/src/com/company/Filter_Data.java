package com.company;

import java.io.*;
import java.util.Scanner;

public class Filter_Data {

    Main m = new Main();

    public String Contains;

    public int ContainNum;

    public int Filter(){
        try {
            File MyFile = new File("C:\\Projects\\Repositorys\\Java-DataFilter\\src\\com\\company\\Data_Files\\Data.txt");
            Scanner myReader = new Scanner(MyFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine().toLowerCase();
                if (data.contains(m.FilterWord)){
                    ContainNum++;
                }

            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return ContainNum;
    }
}
