import java.util.Scanner;
public class SumOfStrictDivisors{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("enter a number: ");
int num = scanner.nextInt();

int sum = 0;
for (int i = 1; i <= num/2; i++)
      if (num % i == 0)    
//	sum += i;
	    System.out.print(i + " ");

//        System.out.println(sum);


}
}