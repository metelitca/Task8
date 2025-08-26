import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputStream = new Scanner(System.in);
        int limit = 0;
        int result = 0;

        while(true){
            System.out.println("Введите целое, положительное число больше 0.");
            limit = inputStream.nextInt();

            if(limit > 0)
                break;

            System.out.println("Введеное число должно быть целым, положительным и больше 0.");
        }

        for(int idx = 1; idx <= limit; idx++  ){
            if(idx % 2 == 0){
                result +=idx;
            }
        }

        System.out.println("Результат:" + result);
    }
}