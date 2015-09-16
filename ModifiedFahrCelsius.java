/********************************
 *Lab 6#                        *
 *Trenton Mcleod                *
 *March 10, 2015                * 
 *Problem #2                    *
 ********************************/

public class ModifiedFahrCelsius {

		public static void main(String[] args) {
		//two empty arrays 
		  double [] myArrFahr = new double[16];
		  double [] myArrCelsius = new double[16];
		  double f=0;
		  double c=0;
		
		//fill up the arrays
		  for (int i=0;i<=15;i++){
		//Calculation
				c = (5.0/9.0)*(f-32.0);
									
				myArrFahr[i] = f;
				myArrCelsius[i]=c;
                      
				f+=50;
		  }
		// Title  
		  System.out.println("Fahrenheit    Celsius");
	    //Print what is in the array   
		  for (int i=0;i<=15;i++)
			{
			System.out.print(myArrFahr[i]+"           ");
			System.out.println(myArrCelsius[i]);    
			}
			//Hello World
    }  
}
