package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App
{

    // Implement all methods as public static
    public static void oneMonthCalendar(int max_tage, int start)
    {
        //Hilfvariablen
        int tag = 1;
        final int woche = 7;
        int x;
        int y;

        for (y = 1 ; tag <= max_tage ; y++)
        {
            for (x = 0 ; x < woche ; x++)
            {
                if (y < start)
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.printf("%2d ", tag);
                    tag++;
                }
                y++;

                if (tag == max_tage + 1)
                {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static long[] lcg(long start)
    {
        final int a = 1103515245;
        final int c = 12345;
        final double base = 2;
        final double expo = 31;
        double m = Math.pow(base,expo);
        byte counter;
        long[] myArray = new long[10];

        for (counter = 0; counter < 10 ; counter ++)
        {
            start = (a * start + c) % (long)m;
            myArray[counter] = start;
        }
        return myArray;
    }

    public static int randomNumber()
    {
        int randomNum = (int)(Math.random() * 101);
        return randomNum;
    }

    public static void guessingGame(int numberToGuess)
    {
        byte counter;
        byte guess;
        byte maxTry = 10;

        Scanner scanner = new Scanner(System.in);

        for (counter = 0 ; counter < maxTry ; counter++)
        {
            System.out.printf("Guess number %d: ", counter +1);
            guess = scanner.nextByte();

            if (counter == maxTry -1)
            {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            }

            if (guess > numberToGuess)
            {
                System.out.println("The number AI picked is lower than your guess.");
            }

            if (guess < numberToGuess)
            {
                System.out.println("The number AI picked is higher than your guess.");
            }

            if (guess == numberToGuess)
            {
                System.out.println("You won wisenheimer!");
                return;
            }
        }
    }

    public static boolean swapArrays(int[] array1, int[] array2)
    {
        if (array1.length != array2.length)
        {
            return false;
        }

        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = array1[i] + array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];
        }
        return true;
    }

    public static String camelCase(String sentence)
    {
        char[] compChar;
        String result = "";
        boolean caps = true;
        int i;
        int chartoint;

        //einzelnen zeichen werden in ein Array gespeichert
        compChar = sentence.toCharArray();

        for (i = 0; i < compChar.length; i++)
        {
            //Prüfen ob Zeichen innerhalb des Alphabets ist
            if((compChar[i] >= 'a' && compChar[i] <= 'z') || (compChar[i] >= 'A' && compChar[i] <= 'Z'))
            {
                if ((compChar[i] >= 'a' && compChar[i] <= 'z') && (caps))
                {
                    chartoint = compChar[i];
                    chartoint = chartoint - 32;
                    compChar[i] = (char)chartoint;

                    caps = false;
                    result = result + compChar[i];
                }

                else if ((compChar[i] >= 'a' && compChar[i] <= 'z') && (caps == false))
                {
                    result = result + compChar[i];
                    caps = false;
                }

                else if ((compChar[i] >= 'A' && compChar[i] <= 'Z') && (caps))
                {
                    result = result + compChar[i];
                    caps = false;
                }

                else if((compChar[i] >= 'A' && compChar[i] <= 'Z') && (caps == false))
                {
                    chartoint = compChar[i];
                    chartoint = chartoint + 32;
                    compChar[i] = (char)chartoint;

                    result = result + compChar[i];
                }
            }
            else if (compChar[i] == ' ')
            {
                caps = true;
            }
            else
            {

            }
        }
        return result;
    }

    public static int checkDigit(int[] array)
    {
        int i;
        int sum = 0;
        int check;

        for (i = 0; i < array.length; i++)
        {
            sum = sum + array[i] * (i + 2);
        }

        check = 11 - (sum % 11);

        if (check == 10)
        {
            return 0;
        }
        else if (check == 11)
        {
            return 5;
        }
        return check;
    }
    public static void main(String[] args)
    {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}