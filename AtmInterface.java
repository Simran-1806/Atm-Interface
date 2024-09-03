import java.util.Scanner;

import static java.lang.System.exit;

class ATM_Machine{
    float balance;
    int PIN = 8979;

    public void checkPin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter your pin:");
        int user_pin = sc.nextInt();

        if(user_pin == PIN)
            menu();
        else
            System.out.println("Enter the valid pin!!");
        checkPin();
    }

    public void menu(){
        System.out.println("\n-------OUR SERVICES-------");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.println("\nEnter Your Choice: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        switch (n){
            case 1: check_Balance();break;
            case 2: deposit_Money();break;
            case 3: withdraw_Money();break;
            case 4: System.out.println("THANKING YOU FOR CONNECTING WITH US_\n");
                exit(1);
            default: System.out.println("\n\nEnter the valid Choice..!");
        }
    }

    public void check_Balance(){
        System.out.println("Your Balance: "+balance);
        System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
        Scanner sc= new Scanner(System.in);
        int lastChoice=sc.nextInt();

        if(lastChoice == 0)
            System.out.println("\n\n__THANKING YOU FOR CONNECTING WITH US_");
        else if(lastChoice == 1)
            menu();
        else
            System.out.println("Enter the valid input..!");
    }


    public void deposit_Money(){
        System.out.println("Enter the Amount to Deposit:");
        Scanner sc= new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount<0){
            System.out.println("Invalid input..");
            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n__THANKING YOU FOR CONNECTING WITH US_");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }
        else{
            balance = balance + amount;
            System.out.println("<<Money deposited succesfully>>");

            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n__THANKING YOU FOR CONNECTING WITH US_");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }

    }

    public void withdraw_Money(){
        System.out.println("\nEnter the amount to be Withdraw:");
        Scanner sc =new Scanner(System.in);
        int amount =sc.nextInt();

        if(amount<0){
            System.out.println("Invalid input..");
            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n__THANKING YOU FOR CONNECTING WITH US_");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }
        else{
            balance = balance - amount;
            System.out.println("<<Money Withdrawal succesfully>>");

            System.out.println("\nPress 0 for exit OR Press 1 for menu: ");
            int lastChoice=sc.nextInt();

            if(lastChoice == 0)
                System.out.println("\n\n__THANKING YOU FOR CONNECTING WITH US_");
            else if(lastChoice == 1)
                menu();
            else
                System.out.println("Enter the valid input..!");
        }

    }

}


public class AtmInterface {
    public static void main(String[] args) {
        System.out.println("\n_WELCOME TO YOUR BANK ACCOUNT\n");
        ATM_Machine ob = new ATM_Machine();
        ob.checkPin();

    }
}
