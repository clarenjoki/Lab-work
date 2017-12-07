/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author 93313
 */
public class Arithmetic {
    private int first_number;
    private int second_number;
     
    public Arithmetic(int first, int second){
        first_number = 10;
        second_number = 5;
        
    }
    public void sum(int sum){
        sum= first_number + second_number;
    }
    public void prod(int prod){
        prod= first_number * second_number;
    }
   public void diff(int diff){
        diff= first_number - second_number;
    }
   public int getsum(int sum){
       
       return sum;
   }
     public int getprod(int prod){
       return prod;
   }
     public int getdiff(int diff){
       return diff;
   } 
}