import java.util.Scanner;

public class FuriJava {
    public static void main(String[] args) {
        //Chap2_3_1
        System.out.println("年齢は");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if( age < 20){
            System.out.println("未成年");
        }

        //Chap2_3_2
        System.out.println("年齢は");
        Scanner scanner1 = new Scanner(System.in);
        int age1 = Integer.parseInt(scanner.nextLine());
        if (age1 < 20) {
            System.out.println(age1 + "歳は");
            System.out.println("未成年");
        }

        //Chap2_4_1
        System.out.println("年齢は");
        Scanner scanner2 = new Scanner(System.in);
        int age2 = Integer.parseInt(scanner.nextLine());
        if (age2 < 20) {
            System.out.println("未成年");
        } else {
            System.out.println("成人");
        }

        //Chap2_5_1
        System.out.println("年齢は");
        Scanner scanner3 = new Scanner(System.in);
        int age3 = Integer.parseInt(scanner.nextLine());
        if (age3 < 20) {
            System.out.println("未成年");
        } else if (age3 < 65) {
            System.out.println("成人");
        }else {
            System.out.println("高齢者");
        }

        //Chap2_6_1
        System.out.println("年齢は");
        Scanner scanner4 = new Scanner(System.in);
        int age4 = Integer.parseInt(scanner4.nextLine());
        if ( age4 >= 6 && age4 <=15 ){
            System.out.println("義務教育の対象");
        }

        //Chap2_6_2
        System.out.println("年齢は");
        Scanner scanner5 = new Scanner(System.in);
        int age5 = Integer.parseInt(scanner5.nextLine() );
        if (age5 <= 5 || age5 >= 65 ) {
            System.out.println("幼児と高齢者");
        }

        //Chap2_6_3
        System.out.println("数値を入力せよ");
        Scanner scanner6 = new Scanner(System.in);
        if (! scanner6.hasNextInt()){
            System.out.println("数値ではない");
        }

        System.out.println("年齢は");
        Scanner scanner7 = new Scanner(System.in);
        int age6 = Integer.parseInt(scanner7.nextLine());
        if (age6 < 6) {
            System.out.println("幼児");
        }

        System.out.println("年齢は");
        Scanner scanner8 = new Scanner(System.in);
        int age7 = Integer.parseInt(scanner8.nextLine());
        if (age7 <= 5 && age7 >= 65){
            System.out.println("幼児と高齢者");
        }
    }
}
