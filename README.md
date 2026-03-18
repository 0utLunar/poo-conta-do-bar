# # 🍺 Bar Bill - Desafio POO

Projeto simples em **Java** para calcular a conta de um cliente em um bar, utilizando **Programação Orientada a Objetos**.

## 📋 Regras do bar

**Ingressos**

* Homem: R$ 10
* Mulher: R$ 8

**Consumo**

* Cerveja: R$ 5
* Refrigerante: R$ 3
* Espetinho: R$ 7

**Couvert**

* R$ 4 se o consumo for **até R$ 30**
* **Grátis** se o consumo for **maior que R$ 30**

---

## 🧠 O que o programa faz

O programa:

1. Lê os dados do cliente
2. Calcula o valor do consumo
3. Verifica se paga couvert
4. Soma ingresso + consumo + couvert
5. Mostra o valor total da conta

---

## 📂 Estrutura do projeto

```
src
 ├─ application
 │   └─ Program.java
 │
 └─ entities
     └─ Bill.java
```

**Program.java**
Responsável pela interação com o usuário.

**Bill.java**
Contém a lógica de cálculo da conta.

---

## ▶️ Como executar

1. Clone o repositório

```
git clone https://github.com/0utLunar/poo-conta-do-bar.git
```

2. Abra em uma IDE Java (IntelliJ, Eclipse ou VSCode)

3. Execute:

```
Program.java
```

---

## 💻 Exemplo de saída

```
RELATÓRIO:
Consumo = R$ 25.00
Couvert = R$ 4.00
Ingresso = R$ 10.00

Valor a pagar = R$ 39.00
```

---

## 👨‍💻 Autor

Lucas Cirino
