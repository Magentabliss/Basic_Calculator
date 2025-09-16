import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BASIC CALCULATOR");
        char repeat;
        do{
            System.out.println("Enter value:");
            double value1 = sc.nextDouble();

            System.out.println("Enter operator(+, -, *, /)");
            String operator = sc.next();
            if(operator.length()==1){
                char length= operator.charAt(0);
            }else{
                System.out.println("Invalid operator!! enter(+, -, *, /)");
                char length= sc.next().charAt(0);
            }
            System.out.println("Enter value:");
            double value2 = sc.nextDouble();

            double answer = 0;
            switch (operator){
                case "+":
                    answer = value1 + value2;
                    System.out.println(value1 + " "+ "+"+" "+value2+" "+"="+" "+answer);
                    break;
                case "-":
                    answer = value1 - value2;
                    System.out.println(value1 + " "+ "-"+" "+value2 +" "+"="+" "+answer);
                    break;
                case "*":
                    answer = value1 * value2;
                    System.out.println(value1 + " "+ "*"+" "+value2+" "+"="+" "+answer);
                    break;
                case "/":
                    answer = value1 / value2;
                    if(value2==0) {
                        System.out.println("INVALID!! number not divisible by 0");
                    } else {
                        System.out.println(value1 + " " + "/" + " " + value2 + " " + "=" + " " + answer);
                    }
                    break;
                default:
                    System.out.println("ERROR!!");
            }
            System.out.println("Do you want to use the calculator again?(Y or N)");
            repeat = sc.next().charAt(0);

        }while(repeat == 'y'|| repeat =='Y');
        System.out.println("EXIT");
        sc.close();
    }
}
