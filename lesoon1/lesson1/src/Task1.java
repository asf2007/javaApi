public class Task1 {
    public static void main(String[] args) {

        System.out.println(treangle(4));
        System.out.println(factorial(4));
    }
    public static int treangle(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum += i;
        }
        return sum;
    }

    public static int factorial (int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }
}