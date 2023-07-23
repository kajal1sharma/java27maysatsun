class thisConstructor{
    int x;
    int y;
    char a;
    float z;


    thisConstructor(){
        System.out.println("hello this is default constructor");
    }
    thisConstructor(int x, int y){
        this('a',67.67f);
        System.out.println("hello this is two int para constructor");
    }
    thisConstructor(char a, float z){
        this();
        System.out.println("hello this is char float type para constructor");
    }
    public static void main(String[] args) {
       // thisConstructor obj =new thisConstructor();
         thisConstructor obj2=new thisConstructor(234, 230);
    }

}