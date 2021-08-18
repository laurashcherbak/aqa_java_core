package aqa.core.lesson2.MykhailoOsadtsiv;

import java.util.Random;
import java.util.Scanner;

//Реклама на телефоні виїла мозок, як її заблочити?
//Налаштування >> Підключення та загалтний доступ >> Приватнйи сервер DNS >> dns.adguard.com

public class SlotoKingBone {
    public static void main(String[] args) {
        int balance = 1000;
        int bet =100;
        Scanner scan = new Scanner(System.in);
        int menu;
        while (balance >= bet) {
            System.out.println("Your Balance: " + balance + "   your bet: " + bet + "   Press 1 to charge money " +
                    "/ Press 2 to roll the dice / Press 3 to increse bet by 100 / Press 4 to exit");
            menu = scan.nextInt();
            if (menu == 1) {
                balance = chargeBalance(balance);
            }
            if (menu == 4) {
                System.out.println("Take your money back, you win: " + balance);
                System.out.println("Реклама на телефоні виїла мозок, а ти не знаєш як її заблочити? " +
                        "\nНалаштування >> Підключення та загалтний доступ >> Приватнйи сервер DNS >> dns.adguard.com " );
                break;
            }
            if (menu == 2) {
                balance = rollTheDice(balance, bet);
            }
            if (menu == 3) {
                bet += 100;
            }
            if (balance <= bet) {
                System.out.println("Zero Balance, charge more!!!");
                balance = chargeBalance(balance);
            }
        }
    }

    public static int chargeBalance (int balance) {
        System.out.println("input charged money: ");
        Scanner scan = new Scanner(System.in);
        int charge = scan.nextInt();
        balance += charge;
        return balance;
    }

    public static int rollTheDice(int balance, int bet) {
        Random bone = new Random();
        int boneResult = 1 + bone.nextInt(6);
        if  (boneResult <= 4) {
            System.out.println("The dice rolled " + boneResult + " You loose, try again");
            return balance - bet;
        } else if (boneResult==5) {
            System.out.println("The dice rolled " + boneResult + " You almost win! try again!");
            return balance;
        } else {
            System.out.println("The dice rolled " + boneResult + " You won!!!  Don't Stop!!!");
            return balance + bet * 3;
        }
    }


}
