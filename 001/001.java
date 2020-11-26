
// Find the sum of all the multiples of 3 or 5 below 1000.

public class Sum{
public Sum(){
}
  public static void main(String[] args){
Sum s1 = new Sum();
s1.sum1000();
}
  public int sum1000(){
   int total = 0;
   for(int i=0; i<1000; i++){
     if(i % 3 == 0 || i % 5 == 0){
       total+=i;
}
}
System.out.println("Solution: " + total);
return total;
}
}

