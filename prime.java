import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime Number");
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
