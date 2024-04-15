import java.util.Scanner;
public class TaskFour{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

int sum = 0;
for(int i = 1; i <= 10; i++){
System.out.print("Enter score " + i +": ");
int score = scanner.nextInt();
if (i % 2 == 0){
sum = score + sum;
}
}
System.out.print("The total is : " + sum);






}








}