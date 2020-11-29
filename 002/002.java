// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class FibonacciEvenSum {
 public static void main(String[] args) {
   int f_0 = 0;
   int f_1 = 1;
   int sum = 0;
   while (f_1 < 4000000){
      int f_new = f_0 + f_1;
      if (f_new %2 ==0) {
         System.out.println(f_new);
         sum += f_new;
      }
      f_0 = f_1;
      f_1 = f_new;
   }
   return sum;
 }
}
    

