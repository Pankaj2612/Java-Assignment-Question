// Develop a Java class containing private data members of integer and double types, along
// with methods for initializing, setting, and updating these data members. Create two objects of
// this class, each calling the necessary methods to set or update the data members. Utilize the
// Runtime class to calculate the total memory allocated and the memory occupied by the objects.
// Employ any technique to make objects unreachable, hence eligible for garbage collection.
// Finally, recheck the utilized and total memory using the Runtime class.

class Demo{
    private int n;
    private double d;

    public void setD(double d) {
        this.d = d;
    }
    public void setN(int n) {
        this.n = n;
    }
}

public class Q5 {

    public static void main(String[] args) {
        Demo ob1 = new Demo();
        ob1.setD(12.3);
        ob1.setN(10);
        Demo ob2 = new Demo();
        ob2.setD(9.3);
        ob2.setN(1);
        ob1 = null;
        long run = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        System.out.println(run);
        System.out.println(free);
    }
}
