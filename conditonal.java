import java.util.Scanner;
public class conditonal {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);
    System.out.println("enter your cash");
    int cash= sc.nextInt();

    if(cash <10){
        System.out.println("u can buy a pen only ");
    }
    
    else if(cash >10 && cash <50){
        System.out.println("buy both things");
    }
    else{
        System.out.println("ssssssssssss");
    }


    }
}
