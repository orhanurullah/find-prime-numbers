import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Asal Sayı Bulma Programı");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Limit Girin : ");
        int number = scanner.nextInt();

        Main main = new Main();
        main.findPrimeNumbers(number);

    }

    public void findPrimeNumbers(int number){
        for(int i = 2; i <= number; i++){
            boolean state = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    state = false;
                    continue;
                }
            }
            if(state){
                System.out.println(i);
            }
        }
    }
}
