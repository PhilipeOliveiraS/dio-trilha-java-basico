# 📺 Projeto: Prática de métodos e orientação a objetos em Java

![Software Development](https://img.shields.io/badge/Software_Development-0078D4?style=for-the-badge&logo=visualstudiocode&logoColor=white)
![Backend Development](https://img.shields.io/badge/Backend_Development-4A154B?style=for-the-badge&logo=java&logoColor=white)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![Status](https://img.shields.io/badge/Status-active-brightgreen?style=for-the-badge)](#)
![GitHub](https://img.shields.io/badge/GitHub-Repo-yellow?style=for-the-badge)
![Contribua](https://img.shields.io/badge/Contribua-Welcome-brightgreen?style=for-the-badge)

![Project Banner](https://source.unsplash.com/random/800x200?coding)

### Descrição

O projeto consiste em duas classes principais: `Usuario` e `SmartTv`. A classe `SmartTv` define os atributos e métodos que simulam o comportamento de uma Smart TV, enquanto a classe `Usuario` demonstra como um usuário pode interagir com a TV usando esses métodos.

### Funcionalidades

- **Ligar e Desligar a TV**
- **Mudar o Canal**
- **Aumentar e Diminuir o Canal**
- **Aumentar e Diminuir o Volume**

---

### Explicação Detalhada do Código

#### Fundamentos do Java

1. **Classe `SmartTv`**
    - Atributos:
        - `ligada`: Estado da TV (ligada ou desligada)
        - `canal`: Canal atual da TV
        - `volume`: Volume atual da TV
    - Métodos:
        - `mudarCanal(int novoCanal)`: Altera o canal da TV para o `novoCanal` especificado.
        - `aumentarCanal()`: Incrementa o canal atual em 1.
        - `diminuirCanal()`: Decrementa o canal atual em 1.
        - `aumentarVolume()`: Incrementa o volume atual em 1.
        - `diminuirVolume()`: Decrementa o volume atual em 1.
        - `ligar()`: Liga a TV.
        - `desligar()`: Desliga a TV.

    ```java
    public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;    
        
        public void mudarCanal(int novoCanal) {
            canal = novoCanal;
        }
        public void aumentarCanal() {
            canal++;
        }
        public void diminuirCanal() {
            canal--;
        }
        public void aumentarVolume() {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
        public void diminuirVolume() {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
        public void ligar() {
            ligada = true;
        }
        public void desligar() {
            ligada = false;
        }
    }
    ```

2. **Classe `Usuario`**
    - Interage com a `SmartTv` através de seus métodos.
    - Demonstra a funcionalidade de cada método da `SmartTv`.

    ```java
    public class Usuario {
        public static void main(String[] args) throws Exception {
            
            SmartTv smartTv = new SmartTv();

            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();

            System.out.println("Canal Atual: " + smartTv.canal);

            smartTv.mudarCanal(13);
            System.out.println("Canal Atual: " + smartTv.canal);

            System.out.println("Volume Atual: " + smartTv.volume);

            System.out.println("TV Ligada? " + smartTv.ligada);
            System.out.println("Volume Atual: " + smartTv.volume);

            smartTv.ligar();
            System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

            smartTv.desligar();
            System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        }
    }
    ```

---

## Fundamentos do Java aprendidos

- **Orientação a Objetos**: Classes e objetos, encapsulamento, métodos.
- **Métodos**: Definição e chamada de métodos para manipular atributos de objetos.
- **Console Output**: Uso de `System.out.println` para exibir informações no console.
---

![Smart TV](https://example.com/smart-tv-image.gif)

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
Este projeto é mantido por [PH3-Digital](https://github.com/PH3-Digital). Contribuições são bem-vindas!