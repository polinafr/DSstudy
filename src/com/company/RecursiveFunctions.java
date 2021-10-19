package com.company;

public class RecursiveFunctions {
    //5*4 = 5+5+5+5
    // 5*4 = 5*3 + 5

    public static int multiply(int a, int b)//a*b
    {
        //final
        if (b==0)
            return 0;
        //else
        return  multiply(a, b-1)+a;
    }





    public static int fibonacci(int n)
    {
        //final
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);//fibonacci(10), fibonacci(120)
    }


    public static void matrushki (int n)
    {
        //final
        if (n==0)
            System.out.println("Матрешка 0");
        else
        {
            //Верх матрёшки n
            // ... Другие матрешки
            // Низ матрешки n
            System.out.println("Верх матрёшки "+Integer.toString(n));
            matrushki(n-1);
            System.out.println("Низ матрёшки "+Integer.toString(n));
        }

    }
}
