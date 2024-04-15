import java.util.Scanner;
public class TaskEight{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

double sum = 0;
double even = 0;
double average = 0;
for(int i = 1; i <= 10; i++){
System.out.print("Enter score between " + i +": ");
int score = scanner.nextInt();
if (score <= 100){
	sum = score + sum;


}



/*if (score % 2 == 0){
even = score;
sum = score + sum;
average = sum / even;
}*/
}
System.out.print("The total is : " + sum);
//System.out.print("\nThe average is : " + average);//






}








}