import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int numbers=scanner.nextInt();
        boolean check=true;
        if (numbers<2){
            System.out.println(numbers+ " is not prime");
        }else{
            int i=2;
            while (i<=Math.sqrt(numbers)){
                if (numbers%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(numbers+" is prime");
            }
            else {
                System.out.println(numbers+" not prime");
            }
        }
    }
}
