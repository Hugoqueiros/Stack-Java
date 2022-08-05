# Stack-Java

Desenvolver um programa em Java que use uma pilha (stack) como estrutura de dados. A pilha deverá ser totalmente desenvolvida para este trabalho não podendo ser usada a classe Stack já existente nas coleções do Java (embora se possa basear nas funcionalidades desta classe).

A pilha será usada para analisar uma expressão aritmética. A expressão aritmética pode conter operadores, variáveis e constantes. Os operadores são +, -, * e /. Os nomes de variáveis podem conter um ou mais caracteres. As constantes são números reais.

Exemplos de expressões:

2 * x + y

num1 / (num2 + num3) * 100

a - 2.5 * b + 3.6 / c

O programa deverá ler a expressão sob a forma de uma string. A expressão é analisada pelo programa, guardando na pilha apenas os operandos (também sob a forma de strings).

Por exemplo, dada a expressão a - 2.5 * b + 3.6 / c seriam colocados na pilha os operandos a, 2.5, b, 3.6, c, por esta ordem.

O programa deverá permitir visualizar o conteúdo da pilha. No final, os elementos existentes na pilha são todos retirados e listados no ecrã.

A pilha deverá ainda ser usada para permitir escrever a expressão pela ordem inversa.

Por exemplo, a expressão a - 2.5 * b + 3.6 / c deve ser escrita na forma c / 3.6 + b * 2.5 - a.
