# Questao3-DesafioAcademiaCapgemini

A questão foi feita utilizando Java JDK 15.0.2, IDE Eclipse 4.20.0

Foi utilizada a API Java Util Scanner para a entrada de dados e Math.floor para arrendondar para baixo números.

Q3. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Rodar o programa na IDE. A entrada e saída de dados é feita no próprio console. O programa deve retornar se há algum par de anagramas e quantos pares de anagramas há.

Na resolução, foi criado um vetorDeCaracteres para receber cada caractere da palavra digitada e ser possível a comparação entre eles. O comprimento da palavra foi levado em consideração na hora de criar o vetor. Em seguida, foram criadas variáveis para armazenar a quantidade de anagramas e de letras repetidas da palavra, que também contam como pares de anagramas. Foi feito um duplo laço FOR para percorrer o vetor em busca de caracteres iguais e a quantidade armazenada na variável correspondente. 

Em seguida, considerando que a quantidade de pares de anagramas possíveis dentro da palavra terá sempre comprimento menor do que a palavra original, foi feito o calculo fatorial do tamanho total da palavra menos o valor de letras repetidas, pois pelo principio fundamental da contagem as letras repetida contam como uma só. Como o valor buscado são os pares de anagramas, o número fatorial foi dividido por 2 e arrendondado para menos. 

Somou-se os anagramas decorrentes de letras repetidas ao cálculo fatorial e obteve-se o total de pares de anagramas possíveis, caso houvesse. Ou seja, se não houver letras repetidas na palavra fornecida, não é possível haver pares de anagramas dentro da palavra.
