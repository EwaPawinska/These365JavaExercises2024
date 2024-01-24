package january.ex006primenumber;

public class ex006IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(int number) {
        if(number == 0 || number == 1){
            return false;
        }
        for (int i = 0; i < number/2; i++) {
            if(number % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
