import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        //for loop
        // for(int i=1;i<=100;i++){
        //     if(i%2==0){
        //         // System.out.println("divided 2");
        //     System.out.println("diveded by to:"+i);


        //     }
        // }
        //while loops
        // int i=100;
        // while(i>=0){
        //     System.out.println(i);
        //     i--;
        // }

        int number;
        do{
            System.out.println("enter a number:");
            Scanner num= new Scanner(System.in);
            number=num.nextInt();
            System.out.print("your number is");
            System.out.println(number);


        }while(number >= 1);
        System.out.println("ends");
    }

    
}
