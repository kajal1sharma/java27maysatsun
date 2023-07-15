public class Function3 {
    public static void sum(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void sum3(int a , int b , int c){
        int sum=a+b+c;
        System.out.println(sum);
    }
    public static void sum4(int a , int b , int c, int d){
        int sum=a+b+c+d;
        System.out.println(sum);
    }

    public static void sumAny(int a, int b,int ...nums){
        // nums[0]=50
        // nums[1]=90
        // nums[2]=80;
        // nums[3]=50
        // nums[4]=90
        // nums[5]=80;
        
        int sum =0;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a =90;
        int b =80;
        int c =50;
        int d =10;
        int arr[] = new int[0];
        // sum(a,b);
        // sum3(a,b,c);
        // sum4(a,b,c,d);
        sumAny(10,20);
        sumAny(a,b,c);
        sumAny(a,b,c,d);
        sumAny(a,b,c,a,b,c,a,b,c);
    }
}
