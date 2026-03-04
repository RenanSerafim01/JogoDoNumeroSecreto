# 🎮 Jogo do Número Secreto

## 📖 Sobre o Projeto
Um jogo interativo de adivinhação na web! O desafio é simples: o jogador precisa descobrir o número secreto gerado aleatoriamente pelo sistema (entre 1 e 10). A cada palpite, o jogo fornece dicas dizendo se o número misterioso é maior ou menor, testando a intuição e a lógica de quem joga.

## 🧠 O que aprendi e apliquei neste projeto
Este desenvolvimento foi um excelente laboratório para praticar conceitos fundamentais de **JavaScript**, saindo da teoria para a prática:

* **Manipulação do DOM:** Uso de `document.querySelector` e `getElementById` para interagir com o HTML, alterando textos em tempo real e habilitando/desabilitando o botão de reiniciar o jogo.
* **Acessibilidade com Web Speech API:** Implementação do `speechSynthesis` para fazer o navegador "falar" as mensagens do jogo em português, deixando a experiência mais imersiva.
* **Lógica de Arrays:** Criação de uma lista (`listaDeNumerosSorteados`) para armazenar o histórico do jogo e garantir que os mesmos números não se repitam até que todas as possibilidades se esgotem.
* **Funções Recursivas:** A função `gerarNumeroAleatorio` foi programada para chamar a si mesma caso o número gerado já esteja na lista de sorteados.
* **Boas práticas (Código Limpo):** Uso de *Template Strings* (`` `${variavel}` ``) e *Operadores Ternários* para ajustar a gramática do jogo dinamicamente (mudando entre "tentativa" e "tentativas").

## 🚀 Tecnologias Utilizadas
* HTML5
* CSS3
* JavaScript

## 👨‍💻 Autor
**Renan Serafim** *Estudante de Sistemas de Informação - FIAP*

---