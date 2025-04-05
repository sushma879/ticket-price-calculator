import java.util.Scanner;
class TicketCost
{
    static float cost=0;
    static float bulkScheme(int noTicket,char cls)
    {
 
       if(cls=='k')
          cost=(float)noTicket*75.0f;
       else
          cost=noTicket*150.0f;
       if(noTicket>20){
              cost=cost-(0.1f*cost);
             System.out.println("bulk "+cost);}
       return cost;
     }
     static float coupon(char c)
     {
        if(c=='y'){
        
          cost=cost-(0.02f*cost);
          System.out.println("coupon "+cost);}
        return cost;
     }
     static float refresh(char c,int noTicket)
     {
        float re=(float)noTicket*50.0f;
        if(c=='y')
        {
           cost=cost+re;
           System.out.println("refresh "+cost);
        }
        return cost;
     }
     public static void main(String args[])
     {
        Scanner sc1=new Scanner(System.in);
        System.out.println("USER GUIDE\n1.You have to book minimum of 5 tickets and maximum of 40 tickets\n2.There are only k class and q class tickets\n");
     try{
        System.out.println("Enter the no of ticket: ");     
        int noTicket=sc1.nextInt();
        
        
        if(noTicket>=5&&noTicket<=40)
        {
           System.out.println("Enter the circle: ");
           char c2=sc1.next().charAt(0);
           if(c2=='k'||c2=='q')
           {
              System.out.println("Do you want refreshment: ");
              char c0=sc1.next().charAt(0);
              System.out.println("Do you have coupon code: ");
              char c1=sc1.next().charAt(0);
              cost=bulkScheme(noTicket,c2);
              cost=coupon(c1);
              cost=refresh(c0,noTicket);
              System.out.println("Total cost is "+cost);
           }
           else
            System.out.println("Invalid input");
       }
       else
       {
         System.out.println("minimum of 5 tickets and maximum of 40 tickets");
       }
       
      }
      catch(Exception e)
      {
         System.out.println("Exception occured "+e);
      }
   }
}