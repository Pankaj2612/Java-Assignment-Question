// . Write a Java program illustrating nullification of references and garbage collection using
// the NullifiedReference class. This class comprises a constructor initializing an object with a
// provided name. Within the main() method, an instance of NullifiedReference is created and
// assigned, followed by a nullification of the object reference. Subsequently, the garbage
// collector is explicitly invoked. Furthermore, the program overrides the finalize() method to
// print the name of the object upon successful garbage collection

class NullifiedReference{
    String name;
    NullifiedReference(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + name + " is garabage collected");
    }
}


public class Q3 {
    public static void main(String[] args) {
        NullifiedReference ob1 = new NullifiedReference("Object 1");
        ob1 = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
