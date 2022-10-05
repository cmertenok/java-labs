 public class lab1 {
     public static void main(String[] args){
         final double m = 7;
         final double n = 10;

         final int a = 4;
         final int b = 3;
         final int c = 1;

         double sum = 0;
         double denominator = 0;
         double numerator = 0;

         for (double i = a; i <= n; i++){
             denominator = (i - c);
             for (double j = b; j <= m; j++){
                 numerator = (i + j);
                 if (denominator != 0) {
                     sum += numerator / denominator;
                 } else {
                     System.out.println("Division by 0!");
                     return;
                 }
             }
         }
         System.out.println("Result: " + sum);
     }
 }