// import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int [] marks={120,134,14,15,16,17};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("reverse an array ");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("for each loops");
        for (int i : marks) {
            System.out.println(i);
            
        }
        System.out.println("sort attay");
        // System.out.println(marks[0]);

        // Arrays.sort(marks);
        // System.out.println(marks[0]);
    }
    
}
