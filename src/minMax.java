import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int a , number, min = 1, max = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("kaç tane sayı gireceksiniz:");
        a = inp.nextInt();

        for(int i = 1; i<=a; i++){
            System.out.println(i+". sayıyı giriniz:");
            number = inp.nextInt();

            if(i==1){
                min = number;
                max = number;
            }
            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
        }
        System.out.println("en büyük sayı: "+max);
        System.out.println("en küçük sayı: "+min);
    }
}
