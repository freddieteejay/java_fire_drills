import java.util.Scanner;

    public class Main{
     public static void main(String... args){
            Scanner freddie = new Scanner(System.in);

int sum = 0;
while(sum <= 100) {
  System.out.print("enter a number: ");
  sum += freddie.nextInt();

}
System.out.print("done");

}
}