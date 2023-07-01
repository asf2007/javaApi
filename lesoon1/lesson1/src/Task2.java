public class Task2 {
    public static void main(String[] args) {
        for(int i = 1; i<=1000; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num){
        if (num == 1){
            return  false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
