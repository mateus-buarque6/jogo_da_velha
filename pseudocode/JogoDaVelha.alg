algoritmo "JogoDaVelha"
// Função : Montar um jogo da velha otimizado e baseado em POG (programação orientada à gambiarras)
// Autor : Mateus Buarque
// Data : 10/07/2016
// Seção de Declarações 
var
   M: Vetor[1..3,1..3] de Caractere
   P, i, j: Inteiro
   R: Caractere
   
Procedimento EscreverMenu ()
Inicio
      Escreval("=================")
      Escreval("    RESULTADO    ")
      Escreval("=================")
      Escreval()
FimProcedimento

inicio
// Seção de Comandos
Repita
   M[1,1] := ("1")
   M[1,2] := ("2")
   M[1,3] := ("3")
   M[2,1] := ("4")
   M[2,2] := ("5")
   M[2,3] := ("6")
   M[3,1] := ("7")
   M[3,2] := ("8")
   M[3,3] := ("9")
   j := 9
   i := 0
Enquanto (i < j) faca
   i := i + 1
   Se (i % 2 = 1)entao
      Escreval("=======================")
      Escreval("     JOGO DA VELHA     ")
      Escreval("=======================")
      Escreval()
      Escreval("     ",M[1,1],"  |  ",M[1,2],"  |  ",M[1,3]:4)
      Escreval("   -----+-----+-----")
      Escreval("     ",M[2,1],"  |  ",M[2,2],"  |  ",M[2,3]:4)
      Escreval("   -----+-----+-----")
      Escreval("     ",M[3,1],"  |  ",M[3,2],"  |  ",M[3,3]:4)
      Escreval()
      Escreval("Jogador [X] deseja jogar em qual posição")
      Leia(P)
      Escolha (P)
      Caso 1
          M[1,1] := "X"
      Caso 2
          M[1,2] := "X"
      Caso 3
          M[1,3] := "X"
      Caso 4
          M[2,1] := "X"
      Caso 5
          M[2,2] := "X"
      Caso 6
          M[2,3] := "X"
      Caso 7
          M[3,1] := "X"
      Caso 8
          M[3,2] := "X"
      Caso 9
          M[3,3] := "X"
      FimEscolha
      LimpaTela
   FimSe
   Se (i % 2 = 0) entao
      Escreval("=======================")
      Escreval("     JOGO DA VELHA     ")
      Escreval("=======================")
      Escreval()
      Escreval("     ",M[1,1],"  |  ",M[1,2],"  |  ",M[1,3]:4)
      Escreval("   -----+-----+-----")
      Escreval("     ",M[2,1],"  |  ",M[2,2],"  |  ",M[2,3]:4)
      Escreval("   -----+-----+-----")
      Escreval("     ",M[3,1],"  |  ",M[3,2],"  |  ",M[3,3]:4)
      Escreval()
      Escreval("Jogador [O] deseja jogar em qual posição")
      Leia(P)
      Escolha (P)
        Caso 1
          M[1,1] := "O"
        Caso 2
          M[1,2] := "O"
        Caso 3
          M[1,3] := "O"
        Caso 4
          M[2,1] := "O"
        Caso 5
          M[2,2] := "O"
        Caso 6
          M[2,3] := "O"
        Caso 7
          M[3,1] := "O"
        Caso 8
          M[3,2] := "O"
        Caso 9
          M[3,3] := "O"
      FimEscolha
      LimpaTela
   FimSe
   Se ((M[1,1] = M[2,1]) e (M[2,1] = M[3,1])) ou ((M[1,2] = M[2,2]) e (M[2,2] = M[3,2])) ou ((M[1,3] = M[2,3]) e (M[2,3] = M[3,3])) ou ((M[1,1] = M[2,2]) e (M[2,2] = M[3,3])) ou ((M[1,3] = M[2,2]) e (M[2,2] = M[3,1])) ou ((M[1,1] = M[1,2]) e (M[1,2] = M[1,3])) ou ((M[2,1] = M[2,2]) e (M[2,2] = M[2,3])) ou ((M[3,1] = M[3,2]) e (M[3,2] = M[3,3])) entao
         j := i
   FimSe
FimEnquanto
  Se (j = 9) entao
    EscreverMenu()
    Escreval("EMPATE")
  Senao
    Se (j % 2 = 1) entao
       EscreverMenu ()
       Escreval("VITÓRIA DO JOGADOR 1 [X]")
    FimSe
    Se (j % 2 = 0) entao
       EscreverMenu ()
       Escreval("VITÓRIA DO JOGADOR 2 [O]")
    FimSe
  FimSe
  Escreval()
  Escreval("QUER CONTINUAR [S/N]?")
  Leia (R)
  Se (Maiusc(R) = "S") entao
     LimpaTela
  FimSe
Ate (Maiusc(R) = "N")
    Escreval()
    Escreval("ALGORITMO CRIADO POR MATEUS BUARQUE")
fimalgoritmo
