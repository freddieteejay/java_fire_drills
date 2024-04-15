import java.util.Scanner;
public class PurchaseCalulatorApp{
         public static void main(String... args){
        Scanner scanner = new Scanner(System.in);

         System.out.print("Welcome to E-store");
System.out.print("\nPlease enter your name: ");
	String name = scanner.nextLine();

	System.out.print("\nEnter percentage discount: ");
	int percentageDiscount = scanner.nextInt();
int total = 0;
int totalOfCost = 0;
int i = 1;
do {
	System.out.printf("Enter cost for item%d or -1 to quit: ",  i  );
        int eachCost = scanner.nextInt();
        totalOfCost += eachCost;
	i++;
 if (eachCost == -1) {

break;
}


  }while(true);

	System.out.printf("Customer Name: %s \nnumber of items bought : %d\npercentage discount : %d\nOriginal cost: %d", name, i - 2,  percentageDiscount, totalOfCost + 1);
 	double cost = totalOfCost * percentageDiscount / 100;


	double newCost = totalOfCost - cost;
    if (totalOfCost >= 200){
	System.out.println("\ndiscounted cost :" + newCost);
	System.out.println("\nthanks for your patronage!");
 }  else 
	System.out.println("\ndiscounted cost : 0 (no discount added)\nthanks for your patronage !");

       }

}