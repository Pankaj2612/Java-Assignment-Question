 interface DetailInfo{
    void display();
    int count();
}

class Personn implements DetailInfo{
    static int maxcount = 0;
    String name;

    Personn(String n){
        name = n;
        if(name.length() > maxcount){
            maxcount = name.length();
        }
    }
    
    public void display() {
        System.out.println("Name of The Person is : " + name);
    }
    
    public int count() {
        return maxcount;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Personn p1 = new Personn("pnakj");
        p1.display();
        System.out.println(p1.count());
    }
}
