using System;
using ArrayOperations;
using StringOperations;
using Factorial;
using NumerosPrimos;
using Potencias;
using Login;
using Multiplos;
using SumaDigitos;
using ArrayMenor;
using Banco;

/*1. Crea una aplicación que, en primer lugar, pida al usuario que
introduzca el tamaño del array de enteros a crear, y a continuación
proceda a solicitarle al usuario el valor de cada uno de esos
componentes del array. Finalmente, muestra por pantalla la suma y
la media de todos los valores del array.*/
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

/*2. Crea una aplicación que cuente el número de espacios en blanco
existentes en una cadena que el usuario introduce por teclado. Debes
implementar una función que reciba como parámetro un string y
devuelva el número de caracteres.*/
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

/*3. Realiza un programa que, mediante un método auxiliar y con
recursividad, calcule el factorial de un número que el usuario
introduce por teclado. Nota: el factorial de un número se calcula
como n!=n*(n-1)*(n-2)*(n-3)*…*3*2*1. Por ejemplo:
6!=6*5*4*3*2*1=720*/
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

/*4. Crea un programa que compruebe si un número que el usuario
introduce por teclado es primo o no. Impleméntalo mediante una
función. Nota: un número es primo si solo es divisible por sí mismo y
por la unidad.*/
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

/*5. Crea un programa que calcule la potencia X de un número
determinado. El usuario introducirá por teclado tanto la base como
el exponente. NO puedes utilizar la clase Math. Impleméntalo de dos
formas: iterativa y recursiva.*/
namespace Potencias
{
    internal class PotenciasProgram
    {
        public static void Ejecutar()
        {
            Console.Write("Introduce la base: ");
            int baseNum = int.Parse(Console.ReadLine());
            Console.Write("Introduce el exponente: ");
            int exponente = int.Parse(Console.ReadLine());

            Console.WriteLine($"Resultado iterativo: { PotenciaIterativa(baseNum, exponente) }");
            Console.WriteLine($"Resultado recursivo: { PotenciaRecursiva(baseNum, exponente) }");
        }
        static long PotenciaIterativa(int baseNum, int exponente)
        {
            long resultado = 1;
            for (int i = 0; i < exponente; i++)
            {
                resultado *= baseNum;
            }
            return resultado;
        }
        static long PotenciaRecursiva(int baseNum, int exponente)
        {
            if (exponente == 0)
                return 1;
            else
                return baseNum * PotenciaRecursiva(baseNum, exponente - 1);
        }
    }
}

/*6. Crea una aplicación que se encargue de controlar el login de un
usuario en una aplicación. Tendrás que implantarlo mediante una
función que reciba como parámetro el usuario y la contraseña, y que
devuelva “true” si el usuario es “usuario2DAM” y la contraseña es
“pass2DAM”. Además, el usuario solo tendrá permitido tres intentos.*/
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

/*7. Crea un programa que pida dos número enteros al usuario y diga si
alguno de ellos es múltiplo del otro. Crea una función EsMultiplo que
reciba los dos números, y devuelve si el primero es múltiplo del
segundo.*/
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

/*8. Crea un programa en C#, que mediante el uso de una función auxiliar,
calcule la suma de los dígitos individuales de un número que el
usuario introduce por teclado. Por ejemplo, si el usuario introduce el
número 23, el resultado debe ser 2+3=5.*/
namespace SumaDigitos
{
    internal class ProgramaSumaDigitosProgram
    {
        public static void Ejecutar()
        {
            Console.Write("Introduce un número entero: ");
            int numero = int.Parse(Console.ReadLine());
            int suma = SumarDigitos(numero);
            Console.WriteLine($"La suma de los dígitos de {numero} es {suma}");
        }
        static int SumarDigitos(int n)
        {
            int suma = 0;
            while (n != 0)
            {
                suma += n % 10;
                n /= 10;
            }
            return suma;
        }
    }
}

/*9. Crea una función que devuelva la posición del número menor de un
array. Los valores de este array se definen en el código directamente.*/
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

/*10.Crea un programa en C# para simular un banco y sus clientes, los
cuales realizan depósitos.Implementa las clases Cliente y Banco*/
namespace Banco
{
    internal class BancoProgram
    {
        public static void Ejecutar()
        {
            Banco banco = new Banco();
            banco.Operar();
            banco.ObtenerEstado();
        }
    }
    class Cliente
    {
        string nombre;
        double cantidadTotal;

        public Cliente(string nombre)
        {
            this.nombre = nombre;
            cantidadTotal = 0;
        }

        public double GetCantidadTotal()
        {
            return cantidadTotal;
        }

        public double Ingresar(double cantidad)
        {
            cantidadTotal += cantidad;
            return cantidadTotal;
        }

        public double Sacar(double cantidad)
        {
            if (cantidadTotal >= cantidad)
            {
                cantidadTotal -= cantidad;
            }
            else
            {
                Console.WriteLine("Saldo insuficiente.");
            }
            return cantidadTotal;
        }

        public string MostrarInformacion()
        {
            return "Nombre: " + nombre + ". Cantidad total: " + cantidadTotal;
        }
    }

    class Banco
    {
        private Cliente[] clientes;

        public Banco()
        {
            clientes = new Cliente[3];
            clientes[0] = new Cliente("Ana");
            clientes[1] = new Cliente("Luis");
            clientes[2] = new Cliente("María");
        }

        public void Operar()
        {
            clientes[0].Ingresar(1234);
            clientes[1].Ingresar(9876);
            clientes[2].Ingresar(456);
        }

        public void ObtenerEstado()
        {
            double totalBanco = 0;
            foreach (var cliente in clientes)
            {
                totalBanco += cliente.GetCantidadTotal();
            }
            Console.WriteLine($"Dinero total en el banco: {totalBanco}");
            foreach (var cliente in clientes)
            {
                Console.WriteLine(cliente.MostrarInformacion());
            }
        }

    }
}

    namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ejercicio 1:");
            ArrayProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 2:");
            StringProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 3:");
            ProgramaFactorialProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 4:");
            NumerosPrimosProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 5:");
            PotenciasProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 6:");
            LoginProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 7:");
            MultiplosProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 8:");
            ProgramaSumaDigitosProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 9:");
            ProgramaArrayMenorProgram.Ejecutar();
            Console.WriteLine();

            Console.WriteLine("Ejercicio 10:");
            BancoProgram.Ejecutar();
            Console.WriteLine();
        }
    }
}