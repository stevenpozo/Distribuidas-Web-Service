using System;
using ServiceReference1; // Cambia esto al nombre de tu espacio de nombres

namespace WebServiceClient
{
    class Program
    {
        static async Task Main(string[] args)
        {
            // Crear una instancia del cliente del servicio web
            var client = new CalculatorSoapClient(CalculatorSoapClient.EndpointConfiguration.CalculatorSoap);

            // Llamar a las operaciones del servicio web
            int a = 10;
            int b = 20;

            int addResult = await client.AddAsync(a, b);
            int subtractResult = await client.SubtractAsync(a, b);
            int multiplyResult = await client.MultiplyAsync(a, b);
            int divideResult = await client.DivideAsync(b, a);

            // Imprimir los resultados
            Console.WriteLine($"Add Result: {addResult}");
            Console.WriteLine($"Subtract Result: {subtractResult}");
            Console.WriteLine($"Multiply Result: {multiplyResult}");
            Console.WriteLine($"Divide Result: {divideResult}");
        }
    }
}
