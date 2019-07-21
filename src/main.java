import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {

        int i = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Задайте размер массива: ");
        int len = in.nextInt();

        int massive[]= new int[len];

        System.out.println("Введите значения массива:");

        do {
            massive[i] = in.nextInt();
            i++;
        }
        while (i < len);

        System.out.println (""); // это просто отступ для красоты

        for (int n = 0; n < massive.length; n++) // Вывод содержимого массива на экран
        {
            System.out.print(massive[n]*2 + " ");
        }

    }
    }
