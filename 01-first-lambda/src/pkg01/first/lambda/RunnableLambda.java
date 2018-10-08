/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.first.lambda;

/**
 *
 * @author Balaji Ashok Kumar (dynamicbalaji4u@gmail.com)
 * @website http://www.balajiashokkumar.me
 */
public class RunnableLambda {
    
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = new Runnable(){
//            @Override
//            public void run() {
//                for(int i=0;i<3;i++){
//                    System.out.println("Thread "+Thread.currentThread().getName());
//                }
//            }            
//        };
        
        Runnable runnableLambda = () -> {
            for(int i=0;i<3;i++){
                    System.out.println("Thread "+Thread.currentThread().getName());
                }
        };
        
//        Thread thread = new Thread(runnable);
        Thread thread = new Thread(runnableLambda);
        thread.start();
        thread.join();
    }
    
}
