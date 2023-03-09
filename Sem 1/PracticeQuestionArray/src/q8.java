package src;

public class q8 {
    public static void main(String[] args) {
        int arr[] = {7,8,9,232,34,545,2};
        // int revarr[] = new int[arr.length];
        // for(int i = 0; i < arr.length;i++){
            
        //     revarr[i] = arr[(arr.length-1)-i];

        // }
        int p = arr.length-1;
        int temp;
        for (int i = 0; i < p;   i++) {
            temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;
            p--;
        }

        for(int i : arr)
        System.out.print(i + " ");

    }
    
}
