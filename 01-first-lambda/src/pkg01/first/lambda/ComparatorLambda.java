/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.first.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Balaji Ashok Kumar (dynamicbalaji4u@gmail.com)
 * @website http://www.balajiashokkumar.me
 */
public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }            
        };
        
        List<String> list = Arrays.asList("muruga", "om muruga", "palani");
        Collections.sort(list, comparator);
        
        for(String data: list){
            System.out.println(data);
        }
    }
}
