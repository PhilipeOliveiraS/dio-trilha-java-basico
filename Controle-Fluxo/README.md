# 👨‍💻 Desafios de Controle de Fluxo em Java

![Software Development](https://img.shields.io/badge/Software_Development-0078D4?style=for-the-badge&logo=visualstudiocode&logoColor=white)
![Backend Development](https://img.shields.io/badge/Backend_Development-4A154B?style=for-the-badge&logo=java&logoColor=white)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
![Programming Logic](https://img.shields.io/badge/Programming%20Logic-4CAF50?style=for-the-badge&logo=buffer&logoColor=white)
![Object-Oriented Programming](https://img.shields.io/badge/Object--Oriented%20Programming-007ACC?style=for-the-badge&logo=codeforces&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-000000?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAQAAAC1+jfqAAAA5klEQVR4AbXBsU4CURQA4AcTBWlCooJmAmiaSdoBZGoJlFZn/AGSCVoMYmAVl7WkQGKbYmyAWkkpTkHb5z7Ndns5k2Pu/He96h+fURzEDTzAK8tZG6OVgmEcU1wGaAbhVOi2pm4A9Rls0joM1oG3G3HgJcAR21y56g8QyxpxD8ue+XotKjDe9SyeLQCDg3GNgSbxy5A0E4uK4hx4A9GbH3lbAJRBHNE2TwLG0kIR6YMoHGxgfQZ5ERZ32nV9gEWwFgkIWiH9YAAAAASUVORK5CYII=)

[![Status](https://img.shields.io/badge/Status-active-brightgreen?style=for-the-badge)](#)
![Contribua](https://img.shields.io/badge/Contribua-Welcome-brightgreen?style=for-the-badge)

![Project Banner](https://source.unsplash.com/random/800x200?coding)

## Descrição

Este repositório contém uma coleção de desafios de programação em Java focados em diferentes tipos de estruturas de controle de fluxo, incluindo condicionais simples, compostas, encadeadas, ternárias e instruções switch-case.

## Funcionalidades

- Prática com condicionais simples
- Uso de condicionais compostas e encadeadas
- Implementação de operadores ternários
- Exemplos de instruções switch-case

## Explicação Detalhada dos Códigos

#### 1. `CaixaEletronicoSimples`

```java
public class CaixaEletronicoSimples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}
```

- **Função**: Este código simula uma transação simples em um caixa eletrônico.
- **Descrição**: 
  - Inicializa o saldo com `25.0` e o valor solicitado com `27.0`.
  - Verifica se o valor solicitado é menor que o saldo.
  - Se verdadeiro, subtrai o valor solicitado do saldo.
  - Imprime o saldo atual.
- **Resultado**: Como `valorSolicitado` é maior que `saldo`, o saldo não é alterado e imprime `25.0`.

#### 2. `CaixaEletronicoComposto`

```java
public class CaixaEletronicoComposto {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
```

- **Função**: Simula uma transação de caixa eletrônico com mensagem de saldo insuficiente.
- **Descrição**: 
  - Inicializa o saldo com `25.0` e o valor solicitado com `22.0`.
  - Verifica se o valor solicitado é menor que o saldo.
  - Se verdadeiro, subtrai o valor solicitado do saldo e imprime o novo saldo.
  - Se falso, imprime "Saldo Insuficiente".
- **Resultado**: Como `valorSolicitado` é menor que `saldo`, imprime "Novo Saldo: 3.0".

#### 3. `ResultadoEscolarComposto`

```java
public class ResultadoEscolarComposto {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
```

- **Função**: Avalia a nota de um aluno e imprime se foi aprovado ou reprovado.
- **Descrição**: 
  - Inicializa a variável `nota` com `6`.
  - Verifica se `nota` é maior ou igual a `7`.
  - Se verdadeiro, imprime "Aprovado".
  - Se falso, imprime "Reprovado".
- **Resultado**: Como `nota` é menor que `7`, imprime "Reprovado".

#### 4. `ResultadoEscolarEncadeado`

```java
public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");
        else if(nota >= 5 && nota < 7)
            System.out.println("Faça a prova de Recuperação");
        else
            System.out.println("Reprovado");
    }
}
```

- **Função**: Determina se um aluno foi aprovado, precisa de recuperação ou foi reprovado.
- **Descrição**: 
  - Inicializa a variável `nota` com `6`.
  - Verifica se `nota` é maior ou igual a `7`.
  - Se verdadeiro, imprime "Aprovado".
  - Se `nota` estiver entre `5` e `7` (exclusivo), imprime "Faça a prova de Recuperação".
  - Se falso, imprime "Reprovado".
- **Resultado**: Como `nota` está entre `5` e `7`, imprime "Faça a prova de Recuperação".

#### 5. `ResultadoEscolarTernaria`

```java
public class ResultadoEscolarTernaria {
    public static void main(String[] args) {
        int nota = 3;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Faça a prova de Recuperação" : "Reprovado";
        
        System.out.println(resultado);
    }
}
```

- **Função**: Utiliza o operador ternário para avaliar a nota de um aluno.
- **Descrição**: 
  - Inicializa a variável `nota` com `3`.
  - Usa um operador ternário para determinar o `resultado` com base na `nota`.
  - Imprime o `resultado`.
- **Resultado**: Como `nota` é menor que `5`, imprime "Reprovado".

#### 6. `SistemaMedidaSwitch`

```java
public class SistemaMedidaSwitch {
    public static void main(String[] args) {
        String sigla = "X";
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
```

- **Função**: Usa o `switch` para determinar o tamanho com base na `sigla`.
- **Descrição**: 
  - Inicializa a variável `sigla` com `X`.
  - Usa um `switch` para comparar `sigla` com os casos `"P"`, `"M"`, `"G"`, e um caso `default`.
  - Imprime o tamanho correspondente ou "INDEFINIDO" se a `sigla` não corresponder a nenhum caso.
- **Resultado**: Como `sigla` é `"X"`, imprime "INDEFINIDO".

#### 7. `PlanoOperadoraSwitch`

```java
public class PlanoOperadoraSwitch {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
```

- **Função**: Usa o `switch` para determinar os benefícios do plano com base na variável `plano`.
- **Descrição**: 
  - Inicializa a variável `plano` com `"T"`.
  - Usa um `switch` para comparar `plano` com os casos `"T"`, `"M"`, `"B"`.
  - Imprime os benefícios correspondentes ao plano. Note que não há `break` statements, então todos os casos abaixo de um caso verdadeiro também serão executados.
- **Resultado**: Como `plano` é `"T"`, imprime:
  - "5GB Youtube"
  - "Whatsapp e Instagram grátis"
  - "100 minutos de ligação"

---
## Fundamentos de Java aprendidos

- **Variáveis**: Declaração e inicialização de variáveis como `int`, `double` e `String`.
- **Condicionais**: Utilização de `if`, `else if`, `else` e operadores ternários para tomada de decisão.
- **Switch Case**: Uso do `switch` para avaliação de múltiplas condições baseadas em uma única variável.

## Conclusão

Este repositório contém uma variedade de exemplos que mostram diferentes estruturas de controle em Java, desde condicionais simples até o uso de operadores ternários e instruções `switch`. Cada exemplo é cuidadosamente explicado, facilitando a compreensão dos fundamentos de Java e a aplicação prática dessas estruturas de controle.

---
## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

---


## Github Stats
![PH3-Digital](https://github-readme-stats.vercel.app/api?username=ph3-digital&show_icons=true&bg_color=0D1117&border_color=30A3DC&icon_color=30A3DC&title_color=0056B3&text_color=FFF)

---
## Minhas Contribuições
[![Repo Card](https://github-readme-stats.vercel.app/api/pin/?username=ph3-digital&repo=dio-trilha-java-basico&bg_color=0D1117&border_color=30A3DC&show_icons=true&icon_color=30A3DC&title_color=0056B3&text_color=FFF)](https://github.com/ph3-digital)
---

![Top Langs](https://github-readme-stats.vercel.app/api/top-langs/?username=PH3-Digital&layout=compact&bg_color=0D1117&border_color=30A3DC&show_icons=true&icon_color=30A3DC&title_color=0056B3&text_color=FFF)

---

## 📈 Estatísticas do Repositório

![Repo Size](https://img.shields.io/github/repo-size/PH3-Digital/dio-trilha-java-basico?style=for-the-badge)
![GitHub contributors](https://img.shields.io/github/contributors/PH3-Digital/dio-trilha-java-basico?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/PH3-Digital/dio-trilha-java-basico?style=social?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/PH3-Digital/dio-trilha-java-basico?style=social?style=for-the-badge)

---

### Estatísticas do Projeto


![Commit Activity](https://img.shields.io/github/commit-activity/y/PH3-Digital/dio-trilha-java-basico?style=for-the-badge)
![Last Commit](https://img.shields.io/github/last-commit/PH3-Digital/dio-trilha-java-basico?style=for-the-badge)
---

![Animation](https://media.giphy.com/media/du3J3cXyzhj75IOgvA/giphy.gif)
---

Este projeto é mantido por [PH3-Digital](https://github.com/PH3-Digital). Contribuições são bem-vindas!
