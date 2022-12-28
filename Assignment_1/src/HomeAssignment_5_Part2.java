// Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
// W will move to A, A to K, K to G and finally G to W. Exchange without
// using extra variables

//Without using a Variable

public class HomeAssignment_5_Part2 {
    public static void main(String[] args) {
        int W,G,K,A;
        W =10;
        G = 20;
        K = 30;
        A = 40;

        System.out.println("Before Swapping, value of W:" + W);
        System.out.println("Before Swapping, value of G:" + G);
        System.out.println("Before Swapping, value of K:" + K);
        System.out.println("Before Swapping, value of A:" + A);

        W = W+G;
        G = W-G;
        W = W-G;

        G = G+K;
        K = G-K;
        G = G-K;

        K = K+A;
        A = K-A;
        K = K-A;

        System.out.println(" ");

        System.out.println("After Swapping, value of W:" + W);
        System.out.println("After Swapping, value of G:" + G);
        System.out.println("After Swapping, value of K:" + K);
        System.out.println("After Swapping, value of A:" + A);

    }



}
