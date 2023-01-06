package patika;
import java.util.Scanner ;
public class FibonacciNumber {
	public static void main (String[]args) {
	 
        Scanner sc = new Scanner(System.in);
       String errorMes = "You must enter a number which is positive...";
       
       int sayi,temp = 0,temp2 = 0,k;
       
            System.out.println("Welcome...");
       
              System.out.print("Enter a positive number : "); sayi = sc.nextInt();
        if(sayi <= 0) System.out.println(errorMes);
        else {
            for (int i=0; i<sayi; i++){
                if(i==0){
                    temp = 0;
                    temp2 = 1;
                    System.out.print(temp + " ");
                }else {
                    k = temp2;
                    temp2 = temp + temp2;
                    temp = k;
                    System.out.print(temp + " ");
				 
			 }
            }
		 }
	}

}
