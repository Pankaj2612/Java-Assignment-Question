// Write a simple main class in Java that contains an experiment that uses the generic Box<T>
// class to build boxes with different types and that verifies that this class works as advertised.
// Your experiment should include the following:
//  Create a boxed String object and two variables that refer to that box. Change the contents
// of one and determine the effect on the other.
//  Create a boxed Integer object and two variables that refer to that box. Change the
// contents of one and determine the effect on the other.
//  Create a boxed Object object and two variables that refer to that box. Determine what
// happens if you put a string in the box. Determine what happens if you put an integer in
// the box.

class Box<T> {
    private T contents;

    public Box() {
    }

    public Box(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}

public class Q6 {
    public static void main(String[] args) {
        // Create a boxed String object and two variables that refer to that box
        Box<String> stringBox = new Box<>("Hello");
        Box<String> anotherStringBox = stringBox;

        // Change the contents of one and determine the effect on the other
        stringBox.setContents("World");
        System.out.println("stringBox: " + stringBox.getContents());
        System.out.println("anotherStringBox: " + anotherStringBox.getContents());

        // Create a boxed Integer object and two variables that refer to that box
        Box<Integer> intBox = new Box<>(42);
        Box<Integer> anotherIntBox = intBox;

        // Change the contents of one and determine the effect on the other
        intBox.setContents(99);
        System.out.println("intBox: " + intBox.getContents());
        System.out.println("anotherIntBox: " + anotherIntBox.getContents());

        // Create a boxed Object object and two variables that refer to that box
        Box<Object> objBox = new Box<>();
        Box<Object> anotherObjBox = objBox;

        // Put a string in the box
        objBox.setContents("Hello");
        System.out.println("objBox (String): " + objBox.getContents());
        System.out.println("anotherObjBox (String): " + anotherObjBox.getContents());

        // Put an integer in the box
        objBox.setContents(123);
        System.out.println("objBox (Integer): " + objBox.getContents());
        System.out.println("anotherObjBox (Integer): " + anotherObjBox.getContents());
    }
}


