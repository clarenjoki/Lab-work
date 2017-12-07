/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;


/**
 *
 * @author badi
 */
public class ExceptionHandling {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        try {checkAge(12);
        
        }catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
        }
        
    }
    
    public static void checkAge(int age) throws InvalidAgeException {
    
        if (age<18) 
            
        {
                throw new InvalidAgeException("You must be 18 to vote");
        }else {
        
            System.out.println("You are eligible to vote");
        }   
}
}
