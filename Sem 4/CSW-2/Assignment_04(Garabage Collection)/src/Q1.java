// Write a Java program illustrating garbage collection through an UnreachableObject class.
// This class will include a constructor initializing an object with a given name, a show() method
// creating an instance of UnreachableObject class and then invoking display(), a display()
// method creating an UnreachableObject instance, and a main() method calling show()
// followed by an explicit invocation of the garbage collector. Additionally, the program will
// override the finalize() method to print the object's name upon successful garbage collection.

class UnreachableObject{
    String name;
    UnreachableObject(String name){
        this.name = name;
    }

     void show() {
        UnreachableObject ob2 = new UnreachableObject("Object2");
        ob2.display();
    }

    void display(){
        System.out.println("Object is created " + this.name);
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Object " + name + " is garbage collected");
    }
}

public class Q1 {
    public static void main(String[] args) throws Exception {
        UnreachableObject ob1 = new UnreachableObject("Object1");
        ob1.show();
        System.gc();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
        
        
    }
}
