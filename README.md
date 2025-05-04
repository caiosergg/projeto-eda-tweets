# 🐦 Tweets Dataset (Java)

Projeto desenvolvido como parte da disciplina **Laboratório de Estrutura de Dados (LEDA)**. O objetivo é aplicar algoritmos de ordenação em um conjunto de dados de tweets, **sem o uso de estruturas complexas**.

---

## 📦 Requisitos

- **Java 17** (ou superior) instalado.
- **Arquivos CSV necessários:**
  - [`tweets.csv`](#) *(link para download)*
  - `tweets_formated_data.csv` *(gerado automaticamente a partir do `tweets.csv`)*
  - `tweets_mentioned_persons.csv` *(gerado automaticamente a partir do `tweets_formated_data.csv`)*

> ⚠️ **Importante:** Os arquivos `.csv` não estão incluídos no repositório devido ao tamanho. Baixe-os pelos links indicados ou solicite ao professor.  
> - `tweets_formated_data.csv` é gerado ao executar `TweetsDateFormatter.java`  
> - `tweets_mentioned_persons.csv` é gerado ao executar `TweetsMentionExtractor.java`

---

## 🚀 Como Executar

### 1. Gerar o arquivo com **datas formatadas** (`tweets_formated_data.csv`)


javac TweetsDateFormatter.java
java TweetsDateFormatter
# Resultado: tweets_formated_data.csv

### 2. Gerar o arquivo com **pessoas mencionadas e contagem** (`tweets_mentioned_persons.csv`)

javac TweetsMentionExtractor.java
java TweetsMentionExtractor
# Resultado: tweets_mentioned_persons.csv

### 3. Executar a **ordenação dos dados**

Com os arquivos anteriores gerados, aplique os algoritmos de ordenação sobre o arquivo `tweets_mentioned_persons.csv`.

> ✅ A execução principal do projeto é iniciada pelo arquivo `Main.java`.

#### 🔽 Tipos de ordenação:

- Por **data** (`date`) – ordem **crescente**
- Por **número de pessoas mencionadas** (`mentioned_person_count`) – ordem **decrescente**
- Por **nome de usuário** (`user`) – ordem **alfabética**

#### 📊 Algoritmos obrigatórios:

- Selection Sort  
- Insertion Sort  
- Merge Sort  
- Quick Sort  
- Quick Sort (com Mediana de 3)  
- Counting Sort  
- HeapSort  

Cada algoritmo deve ser executado nos três casos de análise:

- Melhor caso  
- Caso médio  
- Pior caso  

#### 📁 Exemplos de nomes de arquivos gerados:

- tweets_mentioned_persons_date_insertionSort_medioCaso.csv
- tweets_mentioned_persons_count_quickSort_piorCaso.csv
- tweets_mentioned_persons_user_mergeSort_melhorCaso.csv
