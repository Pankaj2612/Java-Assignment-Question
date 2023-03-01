package src;

public class q8 {
    public static void main(String[] args) {
        int arr[] = {7,8,9,232,34,545,2};
        int revarr[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            
            revarr[i] = arr[(arr.length-1)-i];

        }

        for(int i : revarr)
        System.out.print(i + " ");

    }
    
}
