import java.util.LinkedList;
import java.util.Queue;

public class Queueee {
    public static void main(String[] args) {
        
        Queue<Integer> q  = new LinkedList<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.remove();
        System.out.println(q.peek());

    }
}
