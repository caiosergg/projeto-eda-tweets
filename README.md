# Tweets Dataset (Java)

Este projeto em Java foi desenvolvido como parte da disciplina de Laboratório de Estrutura de Dados, seguindo a regra de não utilizar estruturas de dados complexas. O objetivo principal é processar um conjunto de dados de tweets para realizar formatação de datas, extração de menções e ordenação dos resultados utilizando diferentes algoritmos.

## 🔧 Requisitos

Certifique-se de ter os seguintes requisitos instalados e configurados em seu ambiente de desenvolvimento:

- **Java:** Versão 17 ou superior
- **Arquivo `tweets.csv`:** Este arquivo é essencial para a execução do projeto e deve ser fornecido pelo professor.

## 🚀 Como executar

O projeto é dividido em etapas de processamento e ordenação. Siga as instruções abaixo para executar cada parte:

### 1. Geração do arquivo com datas formatadas (DD/MM/AAAA)

Este passo tem como objetivo ler o arquivo `tweets.csv` e gerar um novo arquivo com as datas dos tweets no formato `DD/MM/AAAA`.

1.  **Compilar o código:**
    ```bash
    javac TweetsDateFormatter.java
    ```
2.  **Executar o programa:**
    ```bash
    java TweetsDateFormatter
    ```
3.  **Resultado:** Após a execução, um novo arquivo chamado `tweets_formated_data.csv` será gerado no diretório raiz do projeto.

### 2. Geração do arquivo com pessoas mencionadas e contagem

Esta etapa processa o arquivo `tweets.csv` para identificar as pessoas mencionadas em cada tweet e contar o número de menções de cada pessoa.

1.  **Compilar o código:**
    ```bash
    javac TweetsMentionExtractor.java
    ```
2.  **Executar o programa:**
    ```bash
    java TweetsMentionExtractor
    ```
3.  **Resultado:** Um arquivo chamado `tweets_mentioned_persons.csv` será criado na raiz do projeto, contendo as pessoas mencionadas e a respectiva contagem.

### 📝 Arquivos gerados pelas etapas de processamento

-   `tweets_formated_data.csv`: Contém os dados dos tweets com as datas no formato `DD/MM/AAAA`.
-   `tweets_mentioned_persons.csv`: Lista as pessoas mencionadas nos tweets e o número de vezes que cada uma foi mencionada.

### Parte de Ordenação

A partir do arquivo `tweets_mentioned_persons.csv`, o programa principal (`Main.java`) executa a ordenação dos dados utilizando diferentes algoritmos, conforme solicitado na disciplina.

#### 🔧 Requisitos para a Parte de Ordenação

Para executar a parte de ordenação, crie uma pasta chamada `data` e certifique-se de que os seguintes arquivos estejam presentes nessa pasta do seu projeto:

-   `tweets.csv`
-   `tweets_formated_data.csv`
-   `tweets_mentioned_persons.csv`
-   
## 🔗 Link para download dos arquivos

Para facilitar o download, todos os arquivos necessários (`tweets.csv`, `tweets_formated_data.csv` e `tweets_mentioned_persons.csv`) foram compactados em um único arquivo `.zip`. Você pode baixá-lo diretamente clicando no link abaixo:

[Baixar arquivos.zip](https://drive.google.com/file/d/1n62_ITXsJ9-5mwru1bTSTGFss2f0TjpK/view?usp=drive_link)

#### 🚀 Como executar a Parte de Ordenação

1.  **Compilar o programa principal:**
    ```bash
    javac Main.java
    ```
2.  **Executar o programa:**
    ```bash
    java Main
    ```
    A execução deste comando iniciará o fluxo completo do programa, aplicando os algoritmos de ordenação e gerando os arquivos de saída.

#### 📝 Arquivos de saída gerados pela ordenação

Crie a pasta `outputs` para receber todos os arquivos de saída.

Os arquivos de saída gerados dependerão dos critérios de ordenação aplicados e dos algoritmos utilizados. Abaixo estão os exemplos de arquivos que serão criados:

**Ordenação por data do tweet:**

```bash
tweets_mentioned_persons_date_insertionSort_medioCaso.csv
tweets_mentioned_persons_date_mergeSort_medioCaso.csv
tweets_mentioned_persons_date_quickSort_medioCaso.csv
