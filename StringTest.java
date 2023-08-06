//java.lang package is by default available in all java 
public class StringTest {
    public static void main(String[] args) {



        String arr [] ={"abc.txt","script.js","Test.java","abc.py","Operators.java"};
        int len = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains(".java")){
                len++;
            }
        }
        String ans[] = new String[len];
        int j=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i].contains(".java")){
                ans[j]=arr[i];
                System.out.println(ans[j]);
                j++;
            }
        }




        // String s="tree";
        // //System.out.println(s.charAt(4));
        // System.out.println(s.equals(new String(" tree")));//compares the values, == compares the reference
        // System.out.println(s==new String("tree"));
        // System.out.println(s.contains("thisr"));
        // System.out.println(s.concat("jghjkdhghdshgkjdsfhgjkhdjk"));


        // System.out.println(s.length());
        // System.out.println(s.substring(6,14));
        // System.out.println(s.substring(6));
        // System.out.println(s);
        // System.out.println(s.trim());
        // System.out.println(s.replace("is", "replaced"));
        // String []arr = s.split(",");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" , ");
        // }

        // String s= "string 1";
        // String s2="string 1";
    
        // String s3= new String("string 1");
        //     System.out.println(s==s3);
    


        int a=90;//literals are the constant values
        // String str="test string";//literal way of defining string obj
        // String str1 = new String("test string ");



        // String str1 ="tree";
        // String str2 ="tree1";
        // String str3 ="tree";
        // String str4 = new String("tree");
        // str4="tree1";
        // System.out.println(str1.hashCode());
        // System.out.println(str2.hashCode());
        // System.out.println(str3.hashCode());
        // System.out.println(str4.hashCode());

    }
}
