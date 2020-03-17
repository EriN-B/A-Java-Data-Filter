package com.company;

public class Main {

    public String FilterWord = "ist";

    public static void main(String[] args) {
        Main m1 = new Main();

        Data_File d = new Data_File();

        Filter_Data fd = new Filter_Data();

        d.DataToNewFile(); //Class to put Text into new Text File

        System.out.println("The Text Contains the Filtered Word: " + "''"+m1.FilterWord+"''"+", " + fd.Filter()+ " times"); //Class to Filter the Text for (a) Word/s
    }
}
