# JavaBank 💵

## Descrição 📋

Este projeto simula algumas operações de um banco, onde você pode realizar três operações principais: depósito, saque e visualização da quantia que está na conta. O projeto foi desenvolvido inteiramente em Java.

## Autenticação do Titular do Cartão 🔐

O projeto solicita o número do cartão e o PIN do usuário para identificar o titular da conta. Isso é feito através da classe [CardAuthenticator](src/main/java/org/javabank/services/CardAuthenticator.java), que autentica o titular do cartão com base no número do cartão e no PIN inseridos. Os usuários estão cadastrados na classe [CardManager](src/main/java/org/javabank/services/CardManager.java).

## Dependências 📦

Este projeto utiliza a biblioteca [Lombok🌶](https://projectlombok.org/) para gerar automaticamente os métodos getters e setters das classes.

## Como usar 📋

1. Clone o repositório para a sua máquina local.
2. Importe o projeto para a sua IDE de escolha que suporte Java (como IntelliJ IDEA, Eclipse, etc.).
3. Atualize as dependências do Maven.
4. Execute o projeto.

## Licença 📃

Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE.md para mais detalhes.
