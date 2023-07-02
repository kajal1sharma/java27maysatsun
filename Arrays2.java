import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        
        // int marksPriya=90;
        // int marksRiya=80;
        // int marksTina=45;
        // int marksrahul=91;

        // System.out.println(marksPriya);
        // System.out.println(marksRiya);


        // int marks[] = new int[4];
        // marks[0] =90;
        // marks[1]=78;
        // marks[2]=846;
        // marks[3]=43;
       
        // //creatiom and initialization 
        // int []marks2= {1,2,3,4,5,6};

        // //sum of even numbers

        // int sum=0;
        // for(int temp:marks2){
        //     // System.out.println(temp);
        //     if(temp%2==0){
        //         sum=sum+temp;
        //     }
        // }
        // System.out.println(sum);

        // System.out.println(marks2[0]);
        // System.out.println(marks2[1]);
        // System.out.println(marks2[2]);
        // System.out.println(marks2[3]);
        // System.out.println(marks2[4]);
        // System.out.println(marks2[5]);



        // int [][]arr = new int[2][3];

        // Scanner sc =new Scanner(System.in);
        // //rows
        // for(int i=0;i<2;i++){
        //     //columns
        //     for(int j=0;j<3;j++){
        //         System.out.print("enter ele "+i+" "+j+" = ");
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<2;i++){
        //     //columns
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j]+" ");
              
        //     }
        //     System.out.println();
        // }


            // int []arr[] = {{1,1,1},{1,1,1},{1,1,1}};

            // for(int i=0;i<3;i++){
            //     for(int j=0;j<3;j++){
            //         if(i>=j)
            //         System.out.print(arr[i][j]+" ");
            //         else{
            //             System.out.print("0 ");
            //         }

            //     }
            //     System.out.println();
            // }


            int arr[]={1,2,3,4,5,6,7};

            int brr[]=new int[arr.length];

            //method 1
            for(int j=arr.length-1,i=0;j>=0;j--,i++){
                brr[i]=arr[j];
                
            }
            //method 2
            for(int i=0, j=arr.length-1; i<j;i++,j--){
                //swapping 
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

    }
}
