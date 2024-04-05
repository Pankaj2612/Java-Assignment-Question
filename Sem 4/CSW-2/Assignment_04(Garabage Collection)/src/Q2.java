// . Develop a Java program showcasing reference reassignment and garbage collection using
// the ReassigningReference class. This class features a constructor initializing an object with a
// given name. In the main() method, two instances of ReassigningReference are created. Then,
// the reference is reassigned. Subsequently, the garbage collector is explicitly invoked.
// Additionally, the program overrides the finalize() method to print the name of the object upon
// successful garbage collection.

class ReassigningReference{
    String name;
    ReassigningReference(String name){
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + name + " is garabage collected");
    }
}
public class Q2 {
    public static void main(String[] args) {
        ReassigningReference r1 = new ReassigningReference("Object1");
        ReassigningReference r2 = new ReassigningReference("Object2");
        r2 = r1;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}
