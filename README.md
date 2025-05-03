# Tweets Dataset (Java)

Projeto feito como parte da disciplina de Laboratório de Estrutura de Dados, seguindo todas as regras (sem uso de estruturas complexas).

## 🔧 Requisitos

- Java instalado (Java 17 recomendado)
- Arquivo `tweets.csv` (necessário para execução do projeto - fornecido pelo professor)
  Coloque o arquivo `tweets.csv` na raiz do projeto

## 🚀 Como executar

### 1. Gerar arquivo com datas formatadas (DD/MM/AAAA):

```
javac TweetsDateFormatter.java
java TweetsDateFormatter
```

> Gera o arquivo: `tweets_formated_data.csv`

### 2. Gerar arquivo com pessoas mencionadas e contagem:

```
javac TweetsMentionExtractor.java
java TweetsMentionExtractor
```

> Gera o arquivo: `tweets_mentioned_persons.csv`

## 📝 Resultado

- `tweets_formated_data.csv`
- `tweets_mentioned_persons.csv`
