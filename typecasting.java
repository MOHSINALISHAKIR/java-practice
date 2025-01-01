
public class typecasting {
    public static void main(String[] args) {
        double price=100;
        //implicit casting
        double finalprice= price +18;

        System.out.println(finalprice);

        //explicit casting
        int p=100;
        int fp=p+ (int)18.0;
        System.out.println(fp);

        // int age=34;
        // age=45;
        // age=44;
        // System.out.println(age);

        final int age=23;
        
        System.out.println(age);
    }
    
}
