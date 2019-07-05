
public class Main
{
 public static void main(String[] args){
    System.out.println("1 for +, 2 for -, 3 for * 4 for /");
    int inputString = Integer.parseInt(System.console().readLine());
    int inputNumberA = Integer.parseInt(System.console().readLine());
    int inputNumberB = Integer.parseInt(System.console().readLine());
    
    if(inputString == 1){
        System.out.println( inputNumberA+inputNumberB);
    }
    if(inputString == 2){
        System.out.println(inputNumberA-inputNumberB);
    }
        if(inputString == 3){
        System.out.println(inputNumberA*inputNumberB);
    }
    
    if(inputString == 4){
        if(inputNumberB == 0){
            System.out.println("stupid");
        }
       if(inputNumberB !=0){
           System.out.println( inputNumberA/inputNumberB);
       }

    }
    
 }

}

