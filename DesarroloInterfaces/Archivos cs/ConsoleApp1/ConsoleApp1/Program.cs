using System;

namespace ArrayOperations
{
    internal class ArrayProgram
    {
        public static void Ejecutar()
        {
            Console.Write("Introduce el tamaño del array: ");
            int size = Convert.ToInt32(Console.ReadLine());

            int[] numbers = new int[size];

            for (int i = 0; i < size; i++)
            {
                Console.Write($"Introduce el valor #{i + 1}: ");
                numbers[i] = Convert.ToInt32(Console.ReadLine());
            }

            int sum = 0;
            for (int i = 0; i < size; i++)
            {
                sum += numbers[i];
            }

            double average = (double)sum / size;

            Console.WriteLine($"Suma total: {sum}");
            Console.WriteLine($"Media: {average}");
        }
    }
}

namespace StringOperations
{
    internal class StringProgram
    {
        public static void Ejecutar()
        {
            Console.Write("Introduce una cadena de texto: ");
            string inputString = Console.ReadLine();

            int espacios = ContarEspacios(inputString);
            Console.WriteLine($"Número de espacios en blanco: {espacios}");
        }

        static int ContarEspacios(string texto)
        {
            int contador = 0;
            for (int i = 0; i < texto.Length; i++)
            {
                if (texto[i] == ' ')
                {
                    contador++;
                }
            }
            return contador;
        }
    }
}


namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ArrayOperations.ArrayProgram.Ejecutar();

            Console.WriteLine();

            StringOperations.StringProgram.Ejecutar();

            Console.ReadKey();
        }
    }
}
