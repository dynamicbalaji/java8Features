/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.first.lambda;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author Balaji Ashok Kumar (dynamicbalaji4u@gmail.com)
 */
public class FirstLambda {

    
    public static void main(String[] args) {
        
        // Anonymous class for FileFilter
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // If pathname ends with .docx, then pathname will be returned
                return pathname.getName().endsWith(".docx");
            }            
        };
                
        File dir = new File("D:\\Murugan 70-480");        
        
        File[] filesLst = dir.listFiles(fileFilter);
        
        for(File file: filesLst){
            System.out.println(file);
        }
    }
    
}
