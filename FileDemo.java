/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package aaajava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileDemo {
    static int lineCount;
    static Student arr[];

    public static void main(String[] args) {
        try {
            FileReader inFile=new FileReader("data.txt");
            Scanner input=new Scanner(inFile);

           lineCount = 0;
                BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
                while (reader.readLine() != null) {
                    lineCount++;
                }
  arr =new Student[lineCount];
for (int i=0;i<lineCount;i++){
    arr[i]=new Student();
    arr[i].setId(input.nextInt());
    arr[i].setfName(input.next());
    arr[i].setlNAme(input.next());
    arr[i].setAge(input.nextInt());
    arr[i].setGender(input.next());
}


        }

        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(returnAge("Ethan"));
    }
    public static int returnAge(String firstN){

        for (int i=0;i<lineCount;i++){
            if (firstN.equals(arr[i].getfName()))
                return arr[i].getAge();
        }
        return 0;
    }
}
