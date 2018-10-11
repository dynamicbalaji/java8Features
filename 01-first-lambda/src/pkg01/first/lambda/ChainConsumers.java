/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.first.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Balaji Ashok Kumar (dynamicbalaji4u@gmail.com)
 * @website http://www.balajiashokkumar.me
 */
public class ChainConsumers {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three",
                "four", "five", "six");
        
        // Normal Lambda Expression syntax
        // Consumer<String> c1 = s -> System.out.println(s);
        
        // Method Reference Lambda Expression syntax
        Consumer<String> c1 = System.out::println;
        
        strings.forEach(c1);
    }
}
