/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indent_tool;

import java.io.IOException;

/**
 *
 * @author mothi
 */
public class Indent_tool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileOperation f = new FileOperation();
        f.read_file("sample.css");
        f.file_write();
    }
    
}
