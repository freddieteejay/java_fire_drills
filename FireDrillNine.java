public class FireDrillNine{
public static void main(String... args){
int total  = 0;
int totals = 0;
int ix = 1;
int jx = 1;

int i = 1;
for ( ; i <= 5 ; ){
ix *= 4;
total += ix;
i++;

}
//System.out.printf("%2d", total);

int j = 1;
for ( ; j <= 5 ; ){
jx *= 8;
totals += jx;
j++;
}
//System.out.print(" ");
//System.out.printf("%2d", totals);
int grandTotal = total + totals;
System.out.print(grandTotal * grandTotal);
}






}