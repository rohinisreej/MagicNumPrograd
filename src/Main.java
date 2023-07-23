import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int output = findIsMagic(number);
        System.out.println(" Output : " + ((output==1)?1:0) );
    }

    private static int findIsMagic(int number) {
        int sum =0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        if(sum > 9){
            return findIsMagic(sum);
        }
        return sum;
    }
}