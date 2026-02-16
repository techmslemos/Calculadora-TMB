# 🧮 Calculadora de Taxa Metabólica Basal (TMB)

Este é um mini projeto inicial desenvolvido em Java para calcular a Taxa Metabólica Basal (TMB) e o Gasto Energético Total diário de um indivíduo. O projeto foi criado como parte dos meus estudos fundamentais de lógica de programação e Java moderno.

## 🚀 Funcionalidades

- Coleta de dados básicos (Nome, Idade, Peso, Altura e Gênero).
- Cálculo da TMB baseado na **Equação de Harris-Benedict**.
- Ajuste do gasto calórico conforme o **Nível de Atividade Física**.
- Interface via console simples e interativa.

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java (JDK 17+)
- **Entrada de Dados:** `java.util.Scanner`
- **Lógica de Decisão:** `if/else` e `Switch Expressions` (Java moderno)
- **Formatação:** `System.out.printf` para manipulação de casas decimais.

## 📝 Como o cálculo é feito?

O sistema utiliza a fórmula revisada de Harris-Benedict:

* **Homens:** TMB = 88,362 + (13,397 x peso) + (4,799 x altura) - (5,677 x idade)
* **Mulheres:** TMB = 447,593 + (9,247 x peso) + (3,098 x altura) - (4,330 x idade)

O resultado é multiplicado pelo fator de atividade (1.2 para sedentários até 1.9 para atletas).

## 📂 Como executar o projeto

1. Certifique-se de ter o JDK 17 ou superior instalado.
2. Clone o repositório:
   ```bash
   git clone https://github.com/techmslemos/Calculadora-TMB.git
3. Compile e execute o arquivo ProjetoCalculadoraTMB.java.

Desenvolvido por Matheus Lemos - Conecte-se comigo no [LinkedIn](https://www.linkedin.com/in/matheus-lemos-3a5243242/).