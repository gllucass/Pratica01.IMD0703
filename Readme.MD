# Projeto: Decodificação e Codificação por Transposição de Caracteres

**Desenvolvido por:** Geraldo Lucas Bezerra Rocha  
**Disciplina:** IMD0703 - SEGURANÇA DE REDES - T02  
**Algoritmo de transposição**  
**Universidade Federal do Rio Grande do Norte (UFRN)**  
**Professor:** Anderson Claudio Rodriges Da Silva

## Descrição

Este programa em Java realiza a decodificação e recriptografia de uma mensagem que foi cifrada por transposição de letras.

## Etapas implementadas

1. A frase cifrada `"Ad0holae7ml.ui0ue.lm3ig.adeta."` contém 30 caracteres.  
2. A frase é inserida em uma matriz **5x6** (5 linhas, 6 colunas), preenchida **linha por linha** (esquerda para a direita).  
3. A matriz é exibida na tela.  
4. Para decifrar a mensagem, o programa lê a matriz **coluna por coluna** (de cima para baixo).  
5. A frase decodificada é apresentada.  
6. O processo de engenharia reversa é aplicado:
   - A frase decodificada é usada para preencher novamente uma matriz **5x6**, agora **coluna por coluna**.
   - A matriz é então lida **linha por linha** para recriar a frase cifrada original.  
7. A frase recriptografada é exibida para confirmar que o algoritmo está correto.

## Saída esperada

- Matriz preenchida  
- Frase decodificada  
- Matriz reconstituída (engenharia reversa)  
- Frase recriptografada  
