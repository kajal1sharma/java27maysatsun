import java.util.Scanner;
public class operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean rain= sc.nextBoolean();
        boolean umbrella= sc.nextBoolean();
        if(!rain || (rain==true && umbrella==true)){
            System.out.println("can go out");
        }
        else{
            System.out.println("cannot go out");
        }
        //logical operators
        // operandLeft  && operandRight 
        // true(1)    &&(*)    true(1)  =true
        // true(1)    &&(*)    false(0) =false 
        // false(0)   &&(*)    true(1)  =false
        // false(0)   &&(*)    false(0) = false
        

        // operandLeft  ||(+) operandRight 
        // true(1)    ||(+)    true(1)  =true
        // true(1)    ||(+)    false(0) =true
        // false(0)   ||(+)    true(1)  =true
        // false(0)   ||(+)    false(0) =false

        // unary operator =not operator => !false =true  !true =false

        // if(!((true||false) &&(true||false))){
        //     System.out.println("true evaluated");
        // }
        // else{
        //     System.out.println("false evaluated");
        // }

    
        
        //comparision operator
        //> < >= <= == !=
        // true or false
        // int a=90;
        // int b=80;
        // System.out.println(a!=b);
        
        
        
        
        
        //arithmetic operators

        //+,-,/,*,% => binary operators
        // int a =90;
        // int b=100;
        // int c=80;
        // int d=30;

        // float div=  (float)a/b;
        // System.out.println(div);

        // int sum =(((a+c)+b)+d);
        // int diff = a-b;
        // int div =c/d;
        // int mul =d*a;
        // int mod = a%c;
        // System.out.println(sum);
        // System.out.println(diff);
        // System.out.println(div);
        // System.out.println(mul);
        // System.out.println(mod);

    }
}
