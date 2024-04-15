import java.util.Scanner;
public class TaskTwo{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

int sum = 0;
int average = 0;
for(int i = 1; i <= 10; i++){
System.out.print("Enter score " + i +": ");
int score = scanner.nextInt();
sum = score + sum;
average = sum / i;
}
System.out.print("\nThe average is : " + average);






}








}