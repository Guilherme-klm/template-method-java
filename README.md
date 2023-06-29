# Template Method

## Descrição

O Template Method é um padrão comportamental que define o esqueleto de um algoritmo em uma classe base, permitindo que subclasses substituam etapas específicas desse algoritmo sem alterar sua estrutura geral.

## Estrutura
O padrão Template Method envolve as seguintes entidades principais:

**Classe Abstrata** (AbstractClass): Define o esqueleto do algoritmo e declara os métodos que representam as etapas individuais do algoritmo. Pode conter métodos concretos, abstratos e métodos de gancho (hook methods) que podem ser sobrescritos pelas subclasses.

**Subclasses Concretas** (ConcreteClasses): Implementam as etapas específicas do algoritmo que são definidas na classe abstrata. Essas subclasses fornecem a personalização necessária para cada etapa do algoritmo.

## Exemplo

Temos a classe **Animal**, com os métodos abstratos **acordar, comer e dormir**; também, o método template da classe, **executarRotinaDiaria**.
A subclasse irá extender a classe **Animal** e adicionar a implementação dos métodos abstratos.
Quando formos instanciar uma subclasse, só precisaremos chamar o método **executarRotinaDiaria**, que chama a implementação dos métodos abstratos da classe **Animal**.

![](estrutura-template-method.png)

No projeto, existem dois códigos, um que utiliza o padrão de projeto template method e outro que não utiliza.
 - Com padrão: [Clique Aqui](./src/com_template_method)
 - Sem padrão: [Clique Aqui](./src/sem_template_method)

## Vantagens
 - Reutilização de código
 - Facilita a manutenção
 - Promove o princípio do Open-Closed
 - Flexibilidade

## Desvantagens
 - Rigidez na estrutura
 - Dificuldade na compreensão
 - Aumento da complexidade hierárquica
 - Dificuldade em lidar com variações múltiplas
 - Acoplamento entre a classe base e subclasses