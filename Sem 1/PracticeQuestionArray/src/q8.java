package src;

public class q8 {
    public static void main(String[] args) {
        int arr[] = {7,8,9,232,34,545,2};
        int len = arr.length - 1;
        int revarr[] = new int[len+1];
        for(int i = 0; i <= len;i++){
            
            revarr[i] = arr[len-i];

        }

        for(int i : revarr)
        System.out.print(i + " ");

    }
    
}
