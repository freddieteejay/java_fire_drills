import java.util.Scanner;

    public class EvenNum{
     public static void main(String... args){
            Scanner freddie = new Scanner(System.in);
              System.out.print("Enter how many number u wan use: ");
                   int num = freddie.nextInt();
int i = 1;
while(i <= num) {
if (i % 2 == 0)
System.out.print(i + " ");

i++;

}


}

}