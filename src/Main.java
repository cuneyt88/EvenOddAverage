import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,average = 0,num=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        a=inp.nextInt();

        for(int i=1;i<=a;i++){
            if(i%3==0&&i%4==0){
                System.out.println(i);
                average+=i;
                num++;
            }
        };
        System.out.println("3 ve 4'e bölünen sayıların ortalaması: "+ (average/num));
    }
}