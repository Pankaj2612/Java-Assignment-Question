// Write a recursive method in Java which, given an integer n, print it with its digits reversed.
// For example, given 4735, it prints 5374

public class Q8 {

    public static int reverse(int x , int ans) {
        
    
        if(x==0){
            return ans;
        }
        else{
        int r = x%10;
        ans = ans*10 + r;
        return reverse(x/10, ans);
        }
    }

    public static void main(String[] args) {
        
       System.out.println(reverse(100002323,0));

    }
}
