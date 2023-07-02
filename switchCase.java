import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float f=  sc.nextFloat();


        switch(f){
            case 23.45f:System.out.println("Monday");
                    break;
            case 45.45f:System.out.println("Tuesday");
                    break;
            case 43.212f:System.out.println("Wednesday");
                    break;
            case 678.5f:System.out.println("Thursday");
                    break;
            case 765.45f:System.out.println("Friday");
            case 3.4f:System.out.println("Saturday");
            case 65.43f:System.out.println("Sunday");
            default :System.out.println("it is wrong input");
        }




        // // System.out.println("enter an int value");
        // // int a= sc.nextInt();
        // // System.out.println("enter a float value");
        // // float f=  sc.nextFloat();
        // // System.out.println("enter a double value"); 
        // // double d= sc.nextDouble();
        // // System.out.println("enter a string value1");
        // // String s= sc.nextLine();
        // // System.out.println("enter a string value2");
        // // String s2= sc.nextLine();
        // // // System.out.println(a);
        // // // System.out.println(f);
        // // // System.out.println(d);
        // // System.out.println(s);
        // // System.out.println(s2);

        // int a= sc.nextInt();
        // sc.nextLine();
        // String s = sc.nextLine();

        // System.out.println(a);
        // System.out.println(s);
    }
}
