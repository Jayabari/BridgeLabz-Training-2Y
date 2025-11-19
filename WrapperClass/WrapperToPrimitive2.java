public class WrapperToPrimitive2 {
    public static void main(String[] args) {
        Double obj = 45.67;
        double d = obj;    
        int i = (int) (double) obj;  
        System.out.println("Wrapper Object value: " + obj);
        System.out.println("Primitive double value: " + d);
        System.out.println("Primitive int value: " + i);
    }
}

