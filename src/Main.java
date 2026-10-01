import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(java.util.Locale.US);// need it to in the bank program deposit would work (" ," or ".")

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
//                System.out.print(symbol);//print is one of the necessary , to get row , printIn dont need here
//
//            }
//            System.out.println();
//
//
//        }

        //11 banking program
//        double balance=0;
//        boolean isRunning=true;//for exit
//        int choice;
//
//        while (isRunning){
//            System.out.println("*************");
//            System.out.println("BANKING PROGRAM");
//            System.out.println("*************");
//            System.out.println("1.SHOW BALANCE");
//            System.out.println("2.DEPOSIT");
//            System.out.println("3.WITHDRAW");
//            System.out.println("4.EXIT");
//            System.out.println("*************");
//
//
//            System.out.println("Enter your choice (1-4): ");
//
//            choice= scanner.nextInt();
//
//            switch (choice){
//                case 1 -> showBalance(balance);
//                case 2 -> balance+=deposit() ;
//                case 3 -> balance-=withDraw(balance);
//                case 4 -> isRunning=false;
//                default -> System.out.println("INVALID CHOICE");
//            }
//            }
//        //works when user are exiting
//        System.out.println("*************");
//        System.out.println("Thank you have a nice day");
//        System.out.println("*************");
//
//        scanner.close();
//        }
//
//    static void showBalance (double balance){
//        System.out.println("*************");
//        System.out.printf("$%.2f\n",balance);
//    }
//    static double deposit(){
//        System.out.println("Enter amount to be deposited");
//
//        double amount=scanner.nextDouble();
//        if(amount<0){
//            System.out.println("Amount can't be negative");
//            return 0;
//        }
//        else {
//            return amount;
//        }
//    }
//    static double withDraw(double balance){
//
//        System.out.print("Enter amount to be withDraw: ");
//        double amount=scanner.nextDouble();
//        if(amount>balance){
//            System.out.println("INVALID FUNDS");
//            return 0;
//        } else if (amount<0) {
//            System.out.println("Amount cant be negatice");
//            return 0;
//        }else {
//            return amount;
//        }
//
//
//    }


        //arrays

//
//          String [] foods;
//          int size;
//        System.out.println("Enter # of a food ");
//          size=scanner.nextInt();
//          scanner.nextLine();//without this line  " enter a food "  have a runing problem in this task
//
//
//         foods=new String[size];
//          for(int i=0;i<foods.length;i++){
//              System.out.println("enter a food");
//              foods[i]=scanner.nextLine();
//          }

/////////////////


//        for (int i=0; i<fruits.length; i++){
//            System.out.println(fruits[i]);
//          }
//        String [] fruits={"banana","coconut","apple","pineapple"};
//        for(String fruit:fruits){
//            System.out.println(fruit); // better
//        }

//        int [] numbers={1,3,4,6,2,5,7,34};
//        int target=342; // for example
//        boolean isFound=false;
//
//        for(int i=0;i<numbers.length;i++){
//            if(target==numbers[i]){
//                System.out.println("target found at :"+i);
//                isFound=true;
//                break;
//            }
//        }
//        if(!isFound){
//            System.out.println("element dont found");
//        }

///////////

//        String[] fruits={"apple","banana","orange"};
//        String target; // for example
//        System.out.println("enter fruits name for search: ");
//        target=scanner.nextLine();
//
//        boolean isFound=false;
//
//        for(int i=0;i<fruits.length;i++){
//            if(target.equals(fruits[i])){//second variant
//                System.out.println("target found at :"+i);
//                isFound=true;
//                break;
//            }
//        }
//        if(!isFound){
//            System.out.println("element dont found");
//        }

        //////









//
//        System.out.println(average());
//    }
//    static double average(double... numbers) {
//        double sum = 0;
//        if(numbers.length==0){
//            return 0;
//        }
//        for (double number : numbers) {
//
//            sum+=number;
//        }
//
//        return sum/numbers.length;

        ///    2D arrays

//        String[] fruits={"apple","banana","pineApple"};
//        String[] vegetables={"potato","carrot","onion"};
//        String[] meat={"beef","fish","chiken"};
//
//        String[][] groceries={fruits,vegetables,meat};
//        groceries[0][1]="pomegranate";
//
//
//        for (String [] foods:groceries){
//            for( String food:foods){
//                System.out.print(food+" ");
//            }
//
//            System.out.println();
//        }




        // telephone(2D arrays)
//        char [][] telephone={{'1','2','3'},
//                             {'4','5','6'},
//                             {'7','8','9'},
//                             {'*','0','#'}};
//
//        for(char [] row:telephone){
//            for (char number:row){
//                System.out.print(number+" ");
//            }
//            System.out.println();
//        }



        /////////////////////// java quiz game

        //  questions array[]
        // options array[]
        // declare variables
        // wellcome message
        //  questions loop
        // options
        //get guess from user
        // check your guess
        //display final score



//        String [] questions={"What is the main funcion of a router?",
//                             "Which part of the computer is considered the brain?",
//                             "What year was Facebook launched?",
//                             "Who is known as the father computer?",
//                             "What was the first programing languages?"};
//
//
//
//        String [][] options={{"1. Storing files", "2.Encrypting data","3.Directing internet","4. Managing passwords"},
//                             {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
//                             {"1. 2000","2. 2004","3. 2006","4. 2008"},
//                             {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
//                             {"1. COBOL","2. C ","3. Fortran","4. Assembly"}};
//
//        int []answers={3,1,2,4,3};
//        int score=0;
//        int guess;
//        System.out.println("******************************");
//        System.out.println("Welcome to the Java Quiz Game! ");
//        System.out.println("******************************");
//
//        for(int i=0;i< questions.length;i++){
//            System.out.println(questions[i]);
//            for(String option:options[i]){
//                System.out.println(option);
//            }
//            System.out.println("Enter your guess: ");
//            guess=scanner.nextInt();
//            if(guess==answers[i]){
//                System.out.println("*********");
//                System.out.println("CORRECT");
//                System.out.println("*********");
//                score++;
//            }
//            else {
//                System.out.println("*********");
//                System.out.println("WRONG");
//                System.out.println("*********");
//            }
//        }
//        System.out.println("*****************************");
//        System.out.println("Your final score is: "+score+" out of "+questions.length);
//        System.out.println("*****************************");
//
//        scanner.close();





        // ROCK PAPER SCISSORS GAME

//        Random random=new Random();
//        String[] choices={"rock","paper","scissors"};
//        String playerChoice;
//        String computerChoice;
//        String playAgain="yes";
//
//        do {
//            System.out.println("Enter your move (rock,paper,scissors): ");
//            playerChoice=scanner.nextLine().toLowerCase();
//
//            if (!playerChoice.equals("rock")&&
//                    !playerChoice.equals("paper")&&
//                    !playerChoice.equals("scissors")){
//                System.out.println("Invalid choice");
//                continue;
//
//            }
//
//            computerChoice=choices[random.nextInt(3)];
//            System.out.println("Computer choices: "+computerChoice);
//
//            if(playerChoice.equals(computerChoice)){
//                System.out.println("It's tie!");
//
//            } else if (playerChoice.equals("rock")&&computerChoice.equals("scissors")||
//                    playerChoice.equals("paper")&&computerChoice.equals("rock")||//3 if-else in one
//                    playerChoice.equals("scissors")&&computerChoice.equals("paper")) {
//                System.out.println("You win!");
//            }
//            else {
//                System.out.println("You lose!");
//            }
//            System.out.println("Play again? (yes/no):");
//            playAgain=scanner.nextLine().toLowerCase();
//
//        }while (playAgain.equals("yes"));
//        System.out.println("Thanks for playing!");




                     // JAVA SLOT MACHINE
        int balance=100;
        int bet;
        int payout;
        String[] row;
        String playAgain;


        System.out.println("*************************");
        System.out.println("  Welcome to Java Slot!  ");
        System.out.println("  Symbols: 🍒 🍉 🍋 🔔 ⭐️");
        System.out.println("*************************");

        while (balance>0){
            System.out.println("Current balance: $"+balance);
            System.out.print("Place your bet amount: ");
            bet=scanner.nextInt();
            scanner.nextLine();

            if (bet>balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet<=0) {
                System.out.println("Bet must be greater than 0 ");
            }else {
                balance-=bet;

            }
            System.out.println(" Spinning... ");
            row=spinRow();
            printRow(row);
            payout= getPayout(row,bet);

            if(payout>0){
                System.out.println("You won $ "+payout);
                balance +=payout;
            }else {
                System.out.println("Sorry you lost this round");

            }
            System.out.println("Do you want play again? (Y/N): ");
            playAgain=scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println(" GAME OVER! Your final balance is $"+balance);




    }
    static String[] spinRow(){
        String[] symbols={"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row= new String[3];
        Random random = new Random();

//        System.out.println(symbols[random.nextInt(symbols.length)]);// for show process, dont need in production
//
        for (int i=0;i<3;i++){
            row[i]=symbols[random.nextInt(symbols.length)];
        }
//        System.out.print(row[0]+row[1]+row[2]);// for show process, dont need in production

        return row;
    }
    static  void printRow(String[] row){
        System.out.println("****************");
        System.out.println(" "+String.join(" | ", row));
        System.out.println("****************");
    }
    static int getPayout(String[]row,int bet ){

       if(row[0].equals(row[1])&&row[1].equals(row[2])){
           return switch ((row[0])){

               case "🍒"-> bet*3;
               case "🍉"-> bet*4;
               case "🍋"-> bet*5;
               case "🔔"-> bet*10;
               case "⭐"-> bet*20;
               default -> 0;
           };
       }
        else if(row[0].equals(row[1])){
            return switch ((row[0])){

                case "🍒"-> bet*2;
                case "🍉"-> bet*3;
                case "🍋"-> bet*4;
                case "🔔"-> bet*5;
                case "⭐"-> bet*10;
                default -> 0;
            };
        }
       else if(row[1].equals(row[2])){
           return switch ((row[0])){

               case "🍒"-> bet*2;
               case "🍉"-> bet*3;
               case "🍋"-> bet*4;
               case "🔔"-> bet*5;
               case "⭐"-> bet*10;
               default -> 0;
           };
       }

     return 0;
    }




}