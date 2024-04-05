public class Q11 {
    public static void main(String[] args) throws Exception {

        try{

        double y = Math.PI/4;
        double x = Math.toDegrees(y);
        double sinx = Math.sin(x); 
        double cosx = Math.cos(x);
        double tanx = Math.tan(x);
        double cotx = 1.0/Math.tan(x);

        if (tanx == cotx) {
            throw new Exception("Divison by zero error : tanx and cotx are equal" );
        }

        double num = Math.log(sinx + cosx);
        double deno = tanx - cosx;

        if (Double.isNaN(num) || Double.isInfinite(num) || num <= 0)  {
            throw new Exception("Invalid Inpout");
        }

        if (deno == 0) {
            throw new Exception("Division by zero not possible");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
