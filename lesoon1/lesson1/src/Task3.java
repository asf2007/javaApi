import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ВВедите первое число: ");
        int firstNum = Integer.parseInt(scan.nextLine());
        System.out.println("ВВедите второе число: ");
        int secondNum = Integer.parseInt(scan.nextLine());
        System.out.println("Введите операцию: ");
        String operation = scan.nextLine();
        System.out.print("Ответ: ");
        if(operation.equals("+")){
            System.out.println(sum(firstNum, secondNum));
        }
        else if(operation.equals("-")){
            System.out.println(minus(firstNum, secondNum));
        }
        else if(operation.equals("/")){
            System.out.println(divide(firstNum, secondNum));
        }
        else if(operation.equals("*")){
            System.out.println(mult(firstNum, secondNum));
        }

    }
    public static int sum (int num1, int num2){
        return num1 + num2;
    }
    public static int minus (int num1, int num2){
        return num1 - num2;
    }
    public static int divide (int num1, int num2){
        return num1 / num2;
    }
    public static int mult (int num1, int num2){
        return num1 * num2;
    }
}
