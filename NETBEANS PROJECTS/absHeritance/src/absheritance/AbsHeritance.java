/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absheritance;

/**
 *
 * @author Randy
 */
public class AbsHeritance 
{

       public static void main(String[] args) 
       {
           //Food one1=new Fish();
           Fish one = new Fish();
           Food two = new Chicken();
           Egg three=new Egg();
           
           //one1.eat();
           two.eat();
           one.eat();
           one.init();
           three.eat();
           three.init();
           
           
        
       }
    
}
