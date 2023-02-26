// A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first
// few numbers are 1, 5, 12, 22, . . . .
// Write a method with the following header that returns a pentagonal number:
// public static int getPentagonalNumber(int n)
// Write a java program that uses this method to display the first 100 pentagonal numbers with
// 10 numbers on each line.


public class Q2 {
    
    public static int  getPentagonalNumber(int n ) {

        int ans = 0;
        int count = 0;
        for(int i = 1 ; i <=n ; i++){

            ans = i*(3*i-1)/2;
            System.out.print(ans + "," +  " ");
             count++;
            if(count%10==0){
                System.out.println();
            }
            
        }
        return ans;
        
    }

    public static void main(String[] args) {
        
    getPentagonalNumber(100);

    }
    
}
