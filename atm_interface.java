//code by @nycanshu
//kindly keep the file name same as class name.

import java.util.Scanner;
public class ATM_Transaction
{
    public static void main(String args[] )
    {
        int balance = 0, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        System.out.println("Note: The default balance is 0. Kindly Deposit money to perform transactions");
        while(true)
        {

            System.out.println("ATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = s.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

