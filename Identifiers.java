public class Identifiers {
    public static void main(String [] args){
        System.out.println("hello this is our first program ");
        //Defining Identifiers
        //rule 1 : alphanumeric =alphabets +umbers + $ + _ (0-9)(A-Z)(a-z)(_)($)
        //identifiers=> the names that are assigned  to class functions variables etc 
        int number;//yes
        //rule 2: the name of any identifiers should not start with a digit
        int number1;//not valid  
        int num1ber;
        int _number_one;
        int $number$one$;
        //int number%;


        //rule 3 cannot use reserved words as identifiers 
        //examples of reserved words are => byte long short int boolean double float , if else continue break switch do while public static void 
        //int boolean;
        //int if;

        //rule 4 name of classes fucntions etc can be used as Identifiers
        int main=90;
        System.out.println(main);

    }
}
