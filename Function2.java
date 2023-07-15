import java.util.Scanner;
public class Function2 {


    // public static int  greatestOfThreee(int a, int b , int c)
    // {
    //     if(a>b && a>c){
    //         return a;
    //     }
    //     else if(b>a && b>c){
    //         return b;
    //     }
    //     else if(c>a && c>b){
    //         return c;
    //     }
    //     else{
    //         return -1;
    //     }
    // }

    // public static int addArrElements(int arr[]){

    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum=sum+arr[i];
    //     }
    //     return sum;
    // }

    static public  int largestOfAll(int []arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {


        int arr[]= new int[3];
        arr[0]=90;
        arr[1]=67;
        arr[2]=54;
         
        int arr2[]= {1,6,4,2,6,8,9,54,3};
        int largestNumber = largestOfAll(arr2);
        System.out.println(largestNumber);

        // int sum = addArrElements(arr2);
        // System.out.println(sum);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter one number ");
        // int a= sc.nextInt();

        // int result = greatestOfThreee(a,78,45);  
        // System.out.println("the largest of the three numbers is : "+result);
    }
}
