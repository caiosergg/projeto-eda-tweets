Tweets Dataset (Java)
Projeto desenvolvido como parte da disciplina Laboratório de Estrutura de Dados (LEDA). O projeto segue todas as regras estabelecidas para a implementação de algoritmos de ordenação, sem o uso de estruturas complexas.

🔧 Requisitos
Java 17 (ou versão superior) instalado.

Arquivos CSV necessários para a execução do projeto:

tweets.csv (link para download)

tweets_formated_data.csv (gerado após a execução da transformação em "tweets.csv")

tweets_mentioned_persons.csv (gerado após a transformação "mentioned_person" com base no arquivo "tweets_formated_data.csv")

Aviso: Os arquivos CSV não estão incluídos diretamente no repositório, devido ao tamanho. Você pode baixá-los através dos links acima ou obtê-los com o seu professor. O arquivo tweets_formated_data.csv é gerado pela execução do arquivo TweetsDateFormatter.java e o tweets_mentioned_persons.csv é gerado com TweetsMentionExtractor.java.

🚀 Como executar
1. Gere o arquivo com datas formatadas (DD/MM/AAAA):
Compile e execute a classe TweetsDateFormatter.java para gerar o arquivo tweets_formated_data.csv:

bash
Copiar
Editar
javac TweetsDateFormatter.java
java TweetsDateFormatter
Resultado gerado: tweets_formated_data.csv

2. Gere o arquivo com pessoas mencionadas e contagem:
Compile e execute a classe TweetsMentionExtractor.java para gerar o arquivo tweets_mentioned_persons.csv:

bash
Copiar
Editar
javac TweetsMentionExtractor.java
java TweetsMentionExtractor
Resultado gerado: tweets_mentioned_persons.csv

3. Realize a ordenação dos dados
Após realizar as transformações anteriores, você pode começar a análise dos algoritmos de ordenação, utilizando o arquivo tweets_mentioned_persons.csv gerado. Os algoritmos de ordenação estudados no projeto devem ser aplicados a este arquivo, como descrito nas instruções do projeto. Aqui estão as etapas para gerar os arquivos de ordenação:

Ordenar por data (campo date) em ordem crescente.

Ordenar pelo número de pessoas mencionadas (campo mentioned_person_count) em ordem decrescente.

Ordenar pelo nome dos usuários (campo user) em ordem alfabética.

Para cada uma dessas ordenações, você deve usar todos os algoritmos recomendados (Selection Sort, Insertion Sort, Merge Sort, Quick Sort, QuickSort com Mediana de 3, Counting Sort, e HeapSort), gerando arquivos para cada algoritmo e caso (melhor, médio e pior).

Por exemplo, ao ordenar por data com o algoritmo Insertion Sort, o arquivo gerado seria: tweets_mentioned_persons_date_insertionSort_medioCaso.csv.

📝 Resultado Esperado
Após a execução do projeto, você deverá obter os seguintes arquivos:

tweets_formated_data.csv (resultado da transformação das datas)

tweets_mentioned_persons.csv (resultado da extração de menções e contagem de usuários)

Arquivos de ordenação gerados para cada algoritmo e caso, como por exemplo:

tweets_mentioned_persons_date_insertionSort_medioCaso.csv

tweets_mentioned_persons_count_insertionSort_medioCaso.csv

tweets_mentioned_persons_user_insertionSort_medioCaso.csv
