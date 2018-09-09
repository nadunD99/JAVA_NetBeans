

package call;
import java.util.Scanner;

/**
 *
 * @author Randy
 */
public class Call {
    public void callculator(){
    Scanner sc=new Scanner(System.in);
      try{  
    int N1,N2;
        char type;
        char con;
        
        System.out.println("Enter Number one ");
        N1=sc.nextInt();
        System.out.println("Enter Number two ");
        N2=sc.nextInt();
        
        System.out.println("Type \"+\" For Summation ,Type \"*\" For Multiplication, Type \"/\" For Division, Type \"-\" For Minus ");
        type=sc.next().charAt(0);
    
        mull max=new mull();
        div divi=new div();
        sum su=new sum();
        
        int Total;
        
        if (type == '+' )
        {
            Total= su.sum(N1,N2);
            System.out.println("SUM = "+Total);
        }
        else if (type=='*')
            {
              Total= max.mull(N1,N2);
              System.out.println("MULTIPLICATION= "+Total);
            }
            else if (type=='/')
                {
                Total= divi.div(N1,N2); 
                System.out.println("DIVISION = "+Total);
                }
            else 
            {
                System.out.println("Invalid selection. Please try again");
            }
        }catch( Exception e)
        {System.out.println("Exception Occure");
            }
        }


    
    public static void main(String[] args) {
    Scanner rd=new Scanner(System.in);
        Call one = new Call();
        char conn;
        do{
        one.callculator();
        
        System.out.println("Do you want to contiue again (Y//N)= ");
        conn=rd.next().charAt(0);
        
         }while(conn=='Y' || conn=='y' );
       
} 
        
    
    
}
