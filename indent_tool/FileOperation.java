/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indent_tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mothi
 */
public class FileOperation {
    String text;
    char[] text1;
    char[] ot=new char[1000000];
    int no_of_chars=0;
    int p=0;
    
    void read_file(String filename) throws FileNotFoundException, IOException
    {
        BufferedReader fp = new BufferedReader(new FileReader(new File(filename)));
        
        while(fp.readLine()!=null)
        {
            text=text+fp.readLine();
        }
        text1=text.toCharArray();
        
        for(char c:text1)
        {
            switch(c)
            {
                case ';':
                            ot[p++]=c;
                            ot[p++]='\n';
                            ot[p++]='\t';
                            break;
                case '{':
                        ot[p++]='{';
                        ot[p++]='\n';
                         ot[p++]='\t';
               
                        break;
                case '}':
                    ot[p++]='\n';
                    ot[p++]=c;
                    ot[p++]='\n';
                    break;
                default: ot[p++]=c;
                    
                    
            }
            
        }
    }
    void file_write() throws IOException
    {
            BufferedWriter fp = new BufferedWriter(new FileWriter(new File("1.css")));
                fp.write(ot);
        
    }
    
}
