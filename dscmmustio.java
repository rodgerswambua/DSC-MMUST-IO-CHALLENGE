/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmust_io;

/**
 *
 * @author georgie
 */
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class MMUST_IO {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException {
        // Initializing counters 
        int countWord = 0; 
        int number_of_lines =0;
        String str;
        int number_of_vowels=0;
        char ch;
        
        String path=args[0];
        String line;
        
        BufferedReader in=new BufferedReader(new FileReader(path));
        
        //checking for the lines of the conetnt of the textfile.
        while ((line=in.readLine()) !=null) {
            //System.out.println(line);
           number_of_lines++; 
           //assign string value to the input from the text file
           str=in.readLine();
           //program for calculating the vowels
           for(int i = 0; i < str.length(); i ++)
		{
			ch = str.charAt(i);

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				number_of_vowels ++;
			
			
		}
           //code for calculating the frequency values
           
           TreeMap<Character, Integer> hmap =  
                     new TreeMap<Character, Integer>(); 
   
        // Traverse through the given array 
        for (int i = 0; i < str.length(); i++) 
        { 
            Integer c = hmap.get(str.charAt(i)); 
   
            // If this is first occurrence of element  
            if (hmap.get(str.charAt(i)) == null) 
               hmap.put(str.charAt(i), 1); 
   
            // If elements already exists in hash map 
            else
              hmap.put(str.charAt(i), ++c); 
        } 
          
        // Print result for the frequencies 
        
        for (Map.Entry m:hmap.entrySet()) 
          System.out.println("Character = " + m.getKey() +  
                         " Frequency = " + m.getValue());
        
           
           
           
           if(line.equals("")) 
            { 
                //paragraphCount++; 
            } 
            if(!(line.equals(""))) 
            { 
                  
                //characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                //whitespaceCount += countWord -1; 
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                //sentenceCount += sentenceList.length; 
            } 
        } 
        int[]array =new int[number_of_lines];
        
        //print out the numbers on the screen
        System.out.println("Total number of lines is: " + number_of_lines);   
        System.out.println("Total number of words is: " + countWord);
        System.out.println("Total number of the Vowels : " + number_of_vowels);
        
        
        
        
    } 
}
    
   

