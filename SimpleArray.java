/********************************
 *Lab 6#                        *
 *Trenton Mcleod                *
 *March 10, 2015                * 
 *Problem #1                    *
 ********************************/

public class SimpleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creating the Array
        double [] myArr = new double[100];
        
      //i hop
	  // I hopper
        
        for(int t = 0; t < 100; t++){
        
            myArr[t] = t+500;
            
        }
        for(int t = 0; t < 100; t++)
        {
        System.out.println(myArr[t]);
        
        }
    }
    
}
