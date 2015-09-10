/********************************
 *Lab 6#                        *
 *Trenton Mcleod                *
 *March 10, 2015                * 
 *Problem #3                    *
 ********************************/

public class Reverse3 {

   
    public static void main(String[] args) {
	// Called Method
        swap();
        
    }
    public static void swap(){
	//Single letter array
        char [] name = {'S','t','e','v','e'} ;
    // Reverse Count    
        for(int count = 4; count >=0 ; count--){
	//Show what is in Array		
		System.out.println(name[count]);

            }
    }
}