# 💸Projeto - Simulando Uma Conta Bancária Através Do Terminal/Console em Java

![Software Development](https://img.shields.io/badge/Software_Development-0078D4?style=for-the-badge&logo=visualstudiocode&logoColor=white)
![Backend Development](https://img.shields.io/badge/Backend_Development-4A154B?style=for-the-badge&logo=java&logoColor=white)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
![Programming Logic](https://img.shields.io/badge/Programming%20Logic-4CAF50?style=for-the-badge&logo=buffer&logoColor=white)
![Object-Oriented Programming](https://img.shields.io/badge/Object--Oriented%20Programming-007ACC?style=for-the-badge&logo=codeforces&logoColor=white)
[![Status](https://img.shields.io/badge/Status-active-brightgreen?style=for-the-badge)](#)
![Contribua](https://img.shields.io/badge/Contribua-Welcome-brightgreen?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-000000?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAQAAAC1+jfqAAAA5klEQVR4AbXBsU4CURQA4AcTBWlCooJmAmiaSdoBZGoJlFZn/AGSCVoMYmAVl7WkQGKbYmyAWkkpTkHb5z7Ndns5k2Pu/He96h+fURzEDTzAK8tZG6OVgmEcU1wGaAbhVOi2pm4A9Rls0joM1oG3G3HgJcAR21y56g8QyxpxD8ue+XotKjDe9SyeLQCDg3GNgSbxy5A0E4uK4hx4A9GbH3lbAJRBHNE2TwLG0kIR6YMoHGxgfQZ5ERZ32nV9gEWwFgkIWiH9YAAAAASUVORK5CYII=)

![Project Banner](https://source.unsplash.com/random/800x200?coding)

## Descrição

Este projeto é uma aplicação Java simples que simula a criação de uma conta bancária interativa através do terminal. Ele solicita ao usuário informações básicas como número da conta, agência, nome do cliente e saldo inicial e, em seguida, exibe uma mensagem de boas-vindas com os dados fornecidos. Utilizamos Lógica de programação e POO - programação orientada a objetos.

## Funcionalidades

- Solicitação de informações do usuário via terminal.
- Exibição de uma mensagem de boas-vindas personalizada.
- Simulação da criação de uma conta bancária.

## Explicação do Código

### Importação de Bibliotecas

1. **Importação de Bibliotecas**
    ```java
    import java.util.Scanner;
    ```
    - A linha acima importa a classe `Scanner` do pacote `java.util`. A classe `Scanner` é utilizada para ler a entrada do usuário a partir do console.

2. **Classe Principal**
    ```java
    public class ContaTerminal {
    ```
    - Declaração da classe pública `ContaTerminal`, que é o ponto de entrada do programa.

3. **Método Main**
    ```java
    public static void main(String[] args) {
    ```
    - O método `main` é o ponto de entrada do programa em Java. É onde a execução do programa começa.

4. **Criação do Scanner**
    ```java
    Scanner scanner = new Scanner(System.in);
    ```
    - Cria uma instância do `Scanner` para ler a entrada do usuário a partir do console.

5. **Declaração de Variáveis**
    ```java
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    ```
    - Declaração de variáveis para armazenar o número da conta, o número da agência, o nome do cliente e o saldo inicial.

6. **Solicitação de Dados**
    ```java
    System.out.print("Por favor, digite o número da conta: ");
    numero = scanner.nextInt();
    scanner.nextLine(); // Consome a nova linha
    System.out.print("Por favor, digite o número da Agência: ");
    agencia = scanner.nextLine();
    System.out.print("Por favor, digite o nome do Cliente: ");
    nomeCliente = scanner.nextLine();
    System.out.print("Por favor, digite o saldo inicial: ");
    saldo = scanner.nextDouble();
    scanner.nextLine(); // Consome a nova linha
    ```
    - Essas linhas solicitam ao usuário que digite o número da conta, o número da agência, o nome do cliente e o saldo inicial. O método `nextLine` é usado para ler strings e `nextInt`/`nextDouble` para ler números. O `scanner.nextLine()` após `nextInt`/`nextDouble` consome a nova linha pendente no buffer do scanner.

7. **Exibição da Mensagem de Boas-vindas**
    ```java
    String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    System.out.println(mensagem);
    ```
    - Cria uma mensagem personalizada com as informações fornecidas pelo usuário e a imprime no console.

8. **Fechamento do Scanner**
    ```java
    scanner.close();
    ```
    - Fecha o `Scanner` para liberar os recursos associados a ele.


---

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

---

### Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

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


```

### Considerações Finais

- **Fundamentos de Java Utilizados:**
  - **Entrada de Dados:** Uso da classe `Scanner` para capturar a entrada do usuário.
  - **Declaração de Variáveis:** Utilização de tipos de dados primitivos (`int`, `double`) e referência (`String`).
  - **Concatenação de Strings:** Criação de uma mensagem personalizada através da concatenação de strings.
  - **Impressão no Console:** Uso de `System.out.print` e `System.out.println` para interação com o usuário.
  - **Fechamento de Recursos:** Boa prática de fechar o `Scanner` após o uso.
```
![Animation](https://media.giphy.com/media/du3J3cXyzhj75IOgvA/giphy.gif)
---

Este projeto é mantido por [PH3-Digital](https://github.com/PH3-Digital). Contribuições são bem-vindas!