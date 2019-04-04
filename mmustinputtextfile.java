/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmust_io_textfile_input;

/**
 *
 * @author georgie
 */
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MMUST_IO_TEXTFILE_INPUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MMUST_IO_TEXTFILE_INPUT input=new MMUST_IO_TEXTFILE_INPUT();
        input.insert();
        input.display();
        
        
    }
    public void display(){
        try {
            BufferedReader br=new BufferedReader (new FileReader("StudentTextFile.txt"));
            String s="";
            while((s=br.readLine()) !=null){
                String data[]=new String[5];
                data=s.split(",");
                for(int i=0; i<5; i++){
                    System.out.print(data[i]+" ");
                }
                System.out.println();
            }
        } catch (Exception ex) {
            
        }
    }
    public void insert(){
        Scanner sc=new Scanner(System.in);
        //student ID, First Name,LastName, DOB, and address
        System.out.println("Enter the Student ID:");
        String std_ID=sc.nextLine();
        System.out.println("Enter the Student's First Name:");
        String FName=sc.nextLine();
        System.out.println("Enter the Student's Last Name:");
        String LName=sc.nextLine();
        System.out.println("Enter the Student's Date of Birth:");
        String DOB=sc.nextLine();
        System.out.println("Enter the Student's Address:");
        String Address=sc.nextLine();
        
        try
        {
            File f=new File("StudentTextFile.txt");
            PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
            pw.append(std_ID+"  " +FName+"  " +LName+"  " +DOB+"  " +Address+"\n");
            pw.close();
        }catch(Exception e){ }
    }
    
}

