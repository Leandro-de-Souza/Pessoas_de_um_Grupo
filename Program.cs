using System;
using System.Globalization;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROBLEMA_ALTURAS {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            int N, cont;
            double soma, media, percentual;

            Console.Write("Quantas pessoas serao digitadas? ");
            N = int.Parse(Console.ReadLine());

            String[] nomes = new String[N];
            int[] idades = new int[N];
            double[] alturas = new double[N];

            for (int i = 0; i < N; i++) {
                Console.WriteLine("Dados da " + (i + 1) + "a pessoa:");
                Console.Write("Nome: ");
                nomes[i] = Console.ReadLine();
                Console.Write("Idade: ");
                idades[i] = int.Parse(Console.ReadLine());
                Console.Write("Altura: ");
                alturas[i] = double.Parse(Console.ReadLine(), CI);
            }

            soma = 0;
            for (int i = 0; i < N; i++) {
                soma = soma + alturas[i];
            }
            media = soma / N;

            Console.WriteLine();
            Console.WriteLine("Altura media: " + media.ToString("F2", CI));

            cont = 0;
            for (int i = 0; i < N; i++) {
                if (idades[i] < 16) {
                    cont = cont + 1;
                }
            }

            percentual = (double)cont * 100 / N;

            Console.WriteLine("Pessoas com menos de 16 anos: " + percentual.ToString("F1", CI) + "%");

            for (int i = 0; i < N; i++) {
                if (idades[i] < 16) {
                    Console.WriteLine(nomes[i]);
                }
            }

        }
    }
}
