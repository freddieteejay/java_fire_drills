import java.util.Scanner;
public class PurchaseCalulatorAppplus{
         public static void main(String... args){
        Scanner freddie = new Scanner(System.in);

         System.out.print("Welcome to E-store");
System.out.print("\nPlease enter your name: ");
	String name = freddie.nextLine();

	System.out.print("\nEnter Number of item purchased: ");
	int numberOfItem = freddie.nextInt();
System.out.print("\nEnter percentage discount: ");
	int percentageDiscount = freddie.nextInt();

int totalOfCost = 0;
for( int i = 1; i <= numberOfItem; i++) {
	System.out.println("Enter cost for item  " + i );
        int eachCost = freddie.nextInt();
        totalOfCost += eachCost;
	


  }
	System.out.printf("Customer Name: %s\nnumber of item bought : %d\npercentage discount : %d\nOriginal cost: %d ", name, numberOfItem, percentageDiscount, totalOfCost);
 	double cost = totalOfCost * percentageDiscount / 100;


	double newCost = totalOfCost - cost;
    if (totalOfCost >= 200){
	System.out.println("\ndiscounted cost :" + newCost);
	System.out.println("\nthanks for your patronage!");
 }  else 
	System.out.println("\ndiscounted cost : 0 (no discount added)\nthanks for your patronage !");

       }

} 