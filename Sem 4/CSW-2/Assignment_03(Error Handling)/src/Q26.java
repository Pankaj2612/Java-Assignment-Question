// Implement try-catch-finally blocks to handle ClassNotFoundException and
// MethodNotFoundException


public class Q26 {
    public static void main(String[] args) {
        try {
            throw new ClassNotFoundException("NO class Found");       
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }        
    }
}
