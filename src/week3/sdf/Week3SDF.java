

package week3.sdf;

/**
 *
 * @author shahe
 */
public class Week3SDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("The score of 35 students is displayed below ");
	
        //declare the array
        //array has 35 elements
        double[] r = new double[35];
        
        //creates 35 random values for the array 
	for (int i = 0; i < r.length; i++){
            r[i] = Math.random ()* 100;
        
            //print the array
            System.out.printf("%6.1f", r[i]);
            if((i + 1) % 5==0 )
                System.out.println();
        }
       
        System.out.println();//blank line
        
        //using the maxofarray method
        double a = maxOfArray(r);
        System.out.println("the maximum score in the list is:");
        print(a);
        
        System.out.println();//blank line
        System.out.println();//balnk line 
        
        //calculating the total
        double total=0;
        for(int i=0;i<r.length;i++){
        total += r[i];
        }
        //System.out.printf("the total score in the list is:%6.1f%n" , total);
        
        //calculating the average 
        double b = total/r.length;
        System.out.println("the average score in the list is:");
        print(b);
        
        System.out.println();//balnk line 
        System.out.println();//balnk line 
        
        //displaying the score below average
        System.out.print("following score is below average");
        for(int l=0;l<r.length;l++){
        double i;
            i = r[l];
            if(i<b)
            print( i);
            
        }
        System.out.println();//balnk line
        System.out.println();//balnk line 
        
        System.out.print("thankyou for using the program");
    }//end of main method

    //method to print array
    public static void print(double x){
           System.out.printf("%6.1f", x);
           if ((x+1)%5==0)
               System.out.println();
        }

   
    public static void printArray(double x){
           System.out.printf("%6.1f", x);
           if ((x+1)%5==0)
               System.out.println();
        }
    
    
    //a method that take the min of the array
    public static double maxOfArray ( double[] d){
        double m=d[0];
        for (int i =0; i<d.length; i++){
        if (m<d[i]) m=d[i];
        }
      return m; 
    }
    
    
    
    
    
}//end of class

       //week three
       // i am so confused
    


