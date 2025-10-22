using System;
using ArrayOperations;
using StringOperations;
using Factorial;
using NumerosPrimos;
using Login;
using Multiplos;
using ArrayMenor;

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

namespace Factorial
{
    internal class ProgramaFactorialProgram
    {
        public static void Ejecutar()
        {
            Console.Write("Introduce un número entero: ");
            int numero = int.Parse(Console.ReadLine());

            long resultado = Factorial(numero);

            Console.WriteLine($"Número: {numero}. Factorial: {resultado}");
        }

        static long Factorial(int n)
        {
            if (n <= 1)
                return 1;
            else
                return n * Factorial(n - 1);
        }
    }
}

namespace NumerosPrimos
{
    internal class NumerosPrimosProgram
    {
        public static void Ejecutar()
        {
            Console.Write("Introduce un número entero: ");
            int numero = int.Parse(Console.ReadLine());

            if (EsPrimo(numero))
                Console.WriteLine($"{numero} es un número primo.");
            else
                Console.WriteLine($"{numero} no es un número primo.");
        }

        static bool EsPrimo(int n)
        {
            if (n <= 1)
                return false;

            for (int i = 2; i <= n / 2; i++)
            {
                if (n % i == 0)
                    return false;
            }

            return true;
        }
    }
}

//Ejercicio 5 dificil dificil

namespace Login
{
    internal class LoginProgram
    {
        public static void Ejecutar()
        {
            int intentos = 3;

            while (intentos > 0)
            {
                Console.Write("Usuario: ");
                string usuario = Console.ReadLine();

                Console.Write("Contraseña: ");
                string contraseña = Console.ReadLine();

                if (usuario == "usuario2DAM" && contraseña == "pass2DAM")
                {
                    Console.WriteLine("Login correcto. Bienvenido.");
                    return;
                }
                else
                {
                    intentos--;
                    Console.WriteLine($"Login no válido. Intentos restantes: {intentos}");
                }
            }

            Console.WriteLine("Has superado el número máximo de intentos.");
        }
    }
}

namespace Multiplos
{
    internal class MultiplosProgram
    {
        public static void Ejecutar()
        {
            Console.Write("Introduce un número entero: ");
            int numeroUno = int.Parse(Console.ReadLine());

            Console.Write("Introduce otro número entero: ");
            int numeroDos = int.Parse(Console.ReadLine());



            if(EsMultiplo(numeroUno, numeroDos))
            {
                int multiplo = CualEsMultiplo(numeroUno, numeroDos);
                int divisor = CualEsDivisor(numeroUno, numeroDos);
                Console.WriteLine($"{multiplo} es múltiplo de {divisor}");
            }
            else{
                Console.WriteLine("Ningún número es múltiplo de otro");
            }
        }

        static bool EsMultiplo(int numeroUno, int numeroDos)
        {
            if(numeroUno%numeroDos == 0 || numeroDos%numeroUno == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        static int CualEsMultiplo(int numeroUno, int numeroDos)
        {
            if (numeroUno%numeroDos == 0)
            {
                return numeroUno;
            } else
            {
                return numeroDos;
            }
        }

        static int CualEsDivisor(int numeroUno, int numeroDos)
        {
            if (numeroUno % numeroDos == 0)
            {
                return numeroDos;
            }
            else
            {
                return numeroUno;
            }
        }
    }
}

//Ejercicio 8 dificil dificil

namespace ArrayMenor
{
    internal class ProgramaArrayMenorProgram
    {
        public static void Ejecutar()
        {
            int[] array = { 10, 5, 3, 8, 2, 9, 1, 6 };

            int posicionMenor = ObtenerPosicionMenor(array);

            Console.WriteLine($"El número menor es {array[posicionMenor]} y está en la posición {posicionMenor}");
        }

        static int ObtenerPosicionMenor(int[] array)
        {
            int posicionMenor = 0;
            for (int i = 1; i < array.Length; i++)
            {
                if (array[i] < array[posicionMenor])
                {
                    posicionMenor = i;
                }
            }
            return posicionMenor;
        }
    }
}

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ArrayProgram.Ejecutar();
            Console.WriteLine();

            StringProgram.Ejecutar();
            Console.WriteLine();

            ProgramaFactorialProgram.Ejecutar();
            Console.WriteLine();

            NumerosPrimosProgram.Ejecutar();
            Console.WriteLine();

            LoginProgram.Ejecutar();
            Console.WriteLine();

            MultiplosProgram.Ejecutar();
            Console.WriteLine();

            ProgramaArrayMenorProgram.Ejecutar();
            Console.WriteLine();
        }
    }
}
