# Gerenciamento de Conta Luz - Energia Fotovoltaica

Projeto acadêmico que simula o gerenciamento dos valores da conta de luz para uma empresa que fornece energia elétrica fotovoltaica a 20 clientes. O programa utiliza vetores para armazenar dados dos clientes e permite consultas baseadas em nome ou código, além de calcular o valor médio pago conforme o consumo e tarifa informada.

## 💡 Desafio
Desenvolver um programa em Java que:

* Armazene o nome, código e média de consumo mensal dos últimos 12 meses para 20 clientes.
* Calcule o valor médio pago com base na tarifa de energia (R\$/kWh).
* Permita consultas por nome e por código.
* Exiba uma tabela completa com os dados dos clientes.

## 🧠 Conceitos Praticados

* Uso de vetores (arrays) para tipos `String`, `int` e `double`.
* Entrada de dados com `Scanner`.
* Estruturas de repetição (`for`) para cadastro e consultas.
* Estrutura condicional (`if`) para validação e buscas.
* Manipulação de strings com métodos como `equalsIgnoreCase`.
* Exibição formatada de dados com `System.out.printf`.
* Boas práticas no uso do buffer do `Scanner` para leitura correta.

## 📝 Metodologia
O programa foi desenvolvido em Java, focando na organização do código, clareza na entrada e saída de dados e funcionalidades práticas de gerenciamento. Cada funcionalidade está comentada para facilitar o entendimento e manutenção do código.

## 📚 Instruções para Implementação

* O valor da tarifa deve ser informado no início do programa.
* O cadastro dos clientes é feito sequencialmente para até 20 clientes.
* As consultas são realizadas via menu interativo, permitindo buscar clientes por nome ou código.
* A exibição da tabela apresenta todos os dados formatados com duas casas decimais para valores monetários.
* O programa deve ser encerrado escolhendo a opção “Sair” no menu.

## 🧪 Requisitos Técnicos

- Linguagem: Java
- Biblioteca utilizada: java.util.Scanner
- IDE sugerida: JCreator
- IDE utilizada: IntelliJ
---