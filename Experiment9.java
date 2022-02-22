/*
 * file   : Experiment9
 * Date   : 21-01-2022
 * Author : Tomin Joy
 * Desc   : A program to implement file handling 
 */

import java.io.*;
import java.util.Scanner;

class File
{
    String readFile(String name) throws IOException{
        String data = "";
        int ch;
        try
        {
        FileReader fr=new FileReader(name);
        while ((ch=fr.read())!= -1){
            data=data+(char)ch;
        }
        fr.close();
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        return data;
    }
    
    void writeFile(String data,String file) throws IOException{
        
        
        FileWriter fw=new FileWriter(file);
        int size = data.length();
        for (int i = 0; i < size; i++){
            fw.write(data.charAt(i));
        }
        System.out.println("Data  successful written in "+file);
       
        fw.close();
    }
}


public class Experiment9 {
    public static void main(String [] args) throws IOException {
        File f = new File();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data to enter: ");
        String input = sc.nextLine();
        f.writeFile(input,"Sample.txt");
        String data = f.readFile("Sample.txt");
        f.writeFile(data, "new-sample.txt");

        sc.close();
    }
}
