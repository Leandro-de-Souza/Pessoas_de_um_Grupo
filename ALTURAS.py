
N = int(input("Quantas pessoas serao digitadas? "))

nomes = [0 for x in range(N)]
idades = [0 for x in range(N)]
alturas = [0 for x in range(N)]

for i in range(0, N):
    print(f"Dados da {i + 1}a pessoa:")
    nomes[i] = input("Nome: ")
    idades[i] = int(input("Idade: "))
    alturas[i] = float(input("Altura: "))

soma = 0
for i in range(0, N):
    soma = soma + alturas[i]

media = soma / N

print()
print(f"Altura media: {media:.2f}")

cont = 0
for i in range(0, N):
    if idades[i] < 16:
        cont = cont + 1

percentual = cont * 100 / N

print(f"Pessoas com menos de 16 anos: {percentual:.1f}%")

for i in range(0, N):
    if idades[i] < 16:
        print(f"{nomes[i]}")



