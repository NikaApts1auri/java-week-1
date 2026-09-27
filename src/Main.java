import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        // 1
//        int a = 8;
//        int b = 10;
//        int sum = a + b;
//        System.out.println(sum + " " + a);

        // 2 - sum with Scanner

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter first number: ");
//        int number1 = scanner.nextInt();
//
//        System.out.println("enter second number: ");
//        int number2 = scanner.nextInt();
//
//        int sum = number1 + number2;
//        System.out.println(sum);

        // 3

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter your age");
//        int age = scanner.nextInt();
//
//        if (age <= 0) {
//            throw new IllegalAccessException("age must be greater than 0");
//        } else if (age >= 18) {
//            System.out.println("success, you are adult");
//        } else {
//            System.out.println("you are under 18, your age is: " + age);
//        }

        // 4

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter number");
//        int number = scanner.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println("this number is even");
//        } else {
//            System.out.println("this number is odd");
//        }

        // 5

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // 6

//        int i = 10;
//
//        while (i > 0) {
//            System.out.println(i);
//            i--;
//        }

        // 7

//        int[] numbers = {2, 7, 3, 4, 5};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        int max = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//
//        System.out.println("maximum is: " + max);

        // 8

//     Scanner scanner= new Scanner(System.in);
//     int num;
//
//     while (true){
//         System.out.println("შეიყვანეთ რიცხვი");
//         num=scanner.nextInt();
//         if(num<0){
//             System.out.println("არასწორი მნიშვნელობა, შეიყვანეთ რიცხვი თავიდან");
//             continue;
//
//         }
//         System.out.println("თქვენ სწორად შეიყვანეთ რიცხვი:"+num);
//     }



//9
//
//        Scanner scanner= new Scanner(System.in);
//         int num;
//         int sum_n=0;
//        int sum_p=0;
//
//     while (true){
//         System.out.println("შეიყვანეთ რიცხვი");
//         num=scanner.nextInt();
//         if(num<0){
//             sum_n =num+ sum_n;
//             System.out.println("უარყოფითი რიცხვების ჯამი არის :"+sum_n);
//             continue;
//
//         } else if (num==0) {
//             break;
//
//         }
//         sum_p =num+ sum_p;
//         System.out.println("დადებითი რიცხვების ჯამი არის :"+sum_p);
//         }
//        System.out.println("საბოლოო დადებითი :"+sum_p);
//        System.out.println("საბოლოო უარყოფითი  :"+sum_n);
//






        //10 nested loops  ,(matrix)

//        Scanner scanner=new Scanner(System.in);
//
//        int rows;
//        int columns;
//        char symbol;
//
//        System.out.println("Enter #  columns: ");
//        columns=scanner.nextInt();
//
//
//        System.out.println("Enter #  rows: ");
//        rows=scanner.nextInt();
//
//
//        System.out.println("Enter #  symbol: ");
//        symbol=scanner.next().charAt(0);
//
//        for(int i=0;i<columns;i++){
//            for(int j=0;j<rows;j++){
//                System.out.print(symbol);//print is one of the neccesary , to get row , printIn dont need here
//
//            }
//            System.out.println();
//
//
//        }

            //11 banking program



        double balance=0;
        boolean isRunning=true;
        int choice;

        while (isRunning){
            System.out.println("*************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*************");
            System.out.println("1.SHOW BALANCE");
            System.out.println("2.DEPOSIT");
            System.out.println("3.WITHDRAW");
            System.out.println("4.EXIT");
            System.out.println("*************");


            System.out.println("Enter your choice (1-4): ");

            choice= scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit() ;
                case 3 -> balance-=withDraw(balance);
                case 4 -> isRunning=false;
                default -> System.out.println("INVALID CHOICE");
            }
            }
        System.out.println("*************");
        System.out.println("Thank you have a nice day");
        System.out.println("*************");

        scanner.close();
        }

    static void showBalance (double balance){
        System.out.println("*************");
        System.out.printf("$%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter amount to be deposited");
        amount=scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withDraw(double balance){

        System.out.print("Enter amount to be withDraw: ");
        double amount=scanner.nextDouble();
        if(amount>balance){
            System.out.println("INVALID FUNDS");
            return 0;
        } else if (amount<0) {
            System.out.println("Amount cant be negatice");
            return 0;
        }else {
            return amount;
        }


    }


//
}