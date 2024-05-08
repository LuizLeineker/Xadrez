import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static final String ANSI_BLACK =  "\u001B[30m";

    public static final String ANSI_YELLOW =  "\u001B[33m";

    public static final String ANSI_CYAN =  "\u001B[36m";

    public static final String ANSI_RESET =  "\u001B[0m";

    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

    static void inicio(List<Xadrez> personagens){

        //peças cyan
        personagens.add(new Cyan(5, 6, "♖", "Cyan", "T"));
        personagens.add(new Cyan(1, 2, "♞", "Cyan", "C"));
        personagens.add(new Cyan(1, 3, "♝", "Cyan", "B"));
        personagens.add(new Cyan(5, 5, "♔", "Cyan", "REI"));
        personagens.add(new Cyan(1, 5, "♕", "Cyan", "RAINHA"));
        personagens.add(new Cyan(1, 6, "♝", "Cyan", "B"));
        personagens.add(new Cyan(1, 7, "♞", "Cyan", "C"));
        personagens.add(new Cyan(1, 8, "♖", "Cyan", "T"));

        personagens.add(new Cyan(5, 4, "♟", "Cyan", "P"));
        personagens.add(new Cyan(2, 2, "♟", "Cyan", "P"));
        personagens.add(new Cyan(2, 3, "♟", "Cyan", "P"));
        personagens.add(new Cyan(2, 4, "♟", "Cyan", "P"));
        personagens.add(new Cyan(2, 5, "♟", "Cyan", "P"));
        personagens.add(new Cyan(2, 6, "♟", "Cyan", "P"));
        personagens.add(new Cyan(2, 7, "♟", "Cyan", "P"));
        personagens.add(new Cyan(2, 8, "♟", "Cyan", "P"));


        //peças gold
        personagens.add(new Gold(6, 4, "♜", "Gold", "T"));
        personagens.add(new Gold(8, 2, "♞", "Gold", "C"));
        personagens.add(new Gold(8, 3, "♝", "Gold", "B"));
        personagens.add(new Gold(6, 6, "♚", "Gold", "REI"));
        personagens.add(new Gold(8, 4, "♛", "Gold", "RAINHA"));
        personagens.add(new Gold(8, 6, "♝", "Gold", "B"));
        personagens.add(new Gold(8, 7, "♞", "Gold", "C"));
        personagens.add(new Gold(4, 1, "♜", "Gold", "T"));

        personagens.add(new Gold(6, 5, "♟", "Gold", "P"));
        personagens.add(new Gold(7, 2, "♟", "Gold", "P"));
        personagens.add(new Gold(7, 3, "♟", "Gold", "P"));
        personagens.add(new Gold(7, 4, "♟", "Gold", "P"));
        personagens.add(new Gold(7, 5, "♟", "Gold", "P"));
        personagens.add(new Gold(7, 6, "♟", "Gold", "P"));
        personagens.add(new Gold(7, 7, "♟", "Gold", "P"));
        personagens.add(new Gold(7, 8, "♟", "Gold", "P"));

    }

    static void tabuleiro(int linhas, int colunas, List<Xadrez> pers){
        boolean personagem;
        int color = 0;
        int colorx = 0;
        int aux = 0;
        int ultimo = 0;
        System.out.printf("\n--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--\n");

        for (int i = 0; i < linhas; i++) {
            System.out.printf("%d ", i + 1);
            for (int j = 0; j < colunas; j++) {
                personagem = false;
                for(int k = 0; k < pers.size(); k++){
                        if(pers.get(k).getPosY() - 1 == i && pers.get(k).getPosX() - 1 == j){

                                if (colorx % 2 == 0){
                                    if (color % 2 == 0) {
                                        System.out.print(ANSI_BLACK_BACKGROUND + "[ " + pers.get(k).toString() + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);
                                    } else {
                                        System.out.print("[ "+ pers.get(k).toString() + " ]");
                                    }
                                }
                                     else if(color % 2 == 0){
                                        System.out.print("[ "+ pers.get(k).toString() + " ]");
                                     }
                                     else
                                        System.out.print(ANSI_BLACK_BACKGROUND + "[ " + pers.get(k).toString() + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);

                            personagem = true;
                        }

                }
                if (!personagem){
                    if(colorx % 2 == 0) {
                        if (color % 2 == 0) {
                            System.out.print(ANSI_BLACK_BACKGROUND + "[ " + ANSI_BLACK + "▬" + ANSI_RESET + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);
                        } else{
                            System.out.print("[ ▬ ]");
                        }
                    } else if (color % 2 == 0) {
                        System.out.print("[ ▬ ]");
                    } else {
                        System.out.print(ANSI_BLACK_BACKGROUND + "[ " + ANSI_BLACK + "▬" + ANSI_RESET + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);
                    }
                }
                color++;


            }





             /*   for (int j = 0; j < 32; j++){           //PRINTA NO LADO DIREITO  AS PEÇAS COMIDAS (tiltei, queria colocar as peças no lado, 4 em cada fila, mais é muito trabalho
                    if(pers.get(j).getTipo().equals("X")){
                        System.out.print(" " + pers.get(j).toString());
                        pers.get(j).setTipo("D");
                        aux2++;
                    }
                    if(aux2 >= 4){
                        break;
                    }

                }

            for (int j = 0; j < 32; j++){           //PRINTA NO LADO DIREITO  AS PEÇAS COMIDAS (tiltei, queria colocar as peças no lado, 4 em cada fila, mais é muito trabalho
                if(pers.get(j).getTipo().equals("X") && aux > 3){
                    System.out.print(" " + pers.get(j).toString());
                    pers.get(j).setTipo("D");
                }
            }  */


            colorx++;
            System.out.printf("\n");
        }

       /* for(int i = 0; i < pers.size(); i++) {          //DEVOLVE TIPO AS PEÇAS COMIDAS! (tiltei, queria colocar as peças no lado, 4 em cada fila, mais é muito trabalho
            if(pers.get(i).getTipo().equals("D")){
                pers.get(i).setTipo("X");
            }
        }    */



        System.out.printf("    %d     %d    %d     %d     %d    %d     %d    %d  ", 1, 2, 3, 4, 5, 6, 7, 8);

        for (int i = 0; i < pers.size(); i++) {
            if(pers.get(i).getTipo().equals("X")){
                System.out.printf("\n--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--");
                System.out.printf("\n                 PEÇAS COMIDAS:       ");
                System.out.printf("\n         ");
                break;
            }
        }


        for (int i = 0; i < pers.size() ; i++) {     //printa as peças comida EMBAIXO
            if(pers.get(i).getTipo().equals("X")){
                System.out.print(" " + pers.get(i).toString() + " ");
                aux++;
                ultimo++;
                if(aux == 8 && ultimo!=32){
                    System.out.print("\n         ");
                    aux = 0;
                }
            }
        }


        System.out.printf("\n--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--\n");

    }

    static void end(String win){
        if(win.equals("GOLD")){
            System.out.print("\n\n\n\n\n#################### XADREZ ###################\n");
            System.out.print(ANSI_YELLOW +  "                  FIM DE JOGO\n");
            System.out.printf("               PARABÉNS TIME %s!!!   \n", win);
            System.out.print(ANSI_RESET + "#####################♚♞♛#####################\n\n");
        }
        else{
            System.out.print("\n\n\n\n\n#################### XADREZ ###################\n");
            System.out.print(ANSI_CYAN + "                  FIM DE JOGO\n");
            System.out.printf("               PARABÉNS TIME %s!!!   \n", win);
            System.out.print(ANSI_RESET + "#####################♚♞♛#####################\n\n");
        }
    }

    static int movimentoGold(int posy, int posx, int indice, List<Xadrez> personagens){
        Scanner leitor = new Scanner(System.in);
        int max;
        int pos1, pos2;
        int p1, p2;
        boolean delete = false;
        System.out.printf("Escolha a posição Y para mexer a peça: ");
        pos1 = Integer.parseInt(leitor.nextLine());

        System.out.printf("Escolha a posição X para mexer a peça: ");
        pos2 = Integer.parseInt(leitor.nextLine());

        if((pos1 < 1  || pos1 > 8)  || (pos2 < 1  || pos2 > 8)){
            return -1;
        }

        switch(personagens.get(indice).getTipo()){
            case "REI":
                System.out.print("MIOJO");
                return 1;


            case "RAINHA":
                System.out.print("RAINHA");
                return 1;


            case "B":
                return 1;


            case "C":
                return 1;


            case "T":
                //MOVIMENTAR TORRE

                //FRENTE
                if(pos1 < posy && pos2 == posx){
                    max = posy - pos1;                           // RECEBE A DIFERENÇA ENTRE A POS ORIGINAL E A POS DE MOVIMENTO
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();

                        for(int j = 1; j <= max; j++){            //VERIFICA SE TEM PEÇAS NA FRENTE
                            if(posy - j == p1 && posx == p2 && pos1 != p1){
                                return  -1;
                            }
                        }
                        if(pos1 == p1 && posx == p2 && personagens.get(i).getCor().equals("Gold")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            return  -1;
                        }

                        if((pos1 == p1 && posx == p2) && personagens.get(i).getCor().equals("Cyan")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("GOLD");
                                personagens.add(new Cyan(965, 556, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Cyan(587, 560, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }
                    }

                    personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PRA FRENTE
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }




                //ATRAS
                if(pos1 > posy && pos2 == posx){
                    max = pos1 - posy;                      // RECEBE A DIFERENÇA ENTRE A POS ORIGINAL E A POS DE MOVIMENTO
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();
                        for(int j = 1; j <= max ; j++){
                            if(posy + j == p1 && posx == p2 && pos1 != p1){                      //VERIFICA SE TEM PEÇAS ATRAS
                                return  -1;
                            }
                        }

                        if(pos1 == p1 && posx == p2 && personagens.get(i).getCor().equals("Gold")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            return  -1;
                        }

                        if((pos1 == p1 && posx == p2) && personagens.get(i).getCor().equals("Cyan")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("GOLD");
                                personagens.add(new Cyan(565, 556, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Cyan(587, 560, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }
                    }
                    personagens.get(indice).setPosY(pos1);                      //FAZ O MOVIMENTO DA TORRE PRA ATRAS
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }




                //ESQUERDA
                if(pos1 == posy && pos2 < posx){
                    max = posx - pos2;
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();
                        for(int j = 1; j <= max ; j++){
                            if(posx - j == p2 && posy == p1 && pos2 != p2){                     //VERIFICA SE TEM UM PEÇA NO LADO ESQUERDO
                                return -1;
                            }
                        }
                        if(pos2 == p2 && posy == p1 && personagens.get(i).getCor().equals("Gold")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            return  -1;
                        }

                        if((posy == p1 && pos2 == p2) && personagens.get(i).getCor().equals("Cyan")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("GOLD");
                                personagens.add(new Cyan(965, 556, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Cyan(587, 560, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }


                    }
                    personagens.get(indice).setPosY(pos1);                  //FAZ O MOVIMENTO DA TORRE PARA O LADO ESQUERDO
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }




                //DIREITA
                if(pos1 == posy && pos2 > posx){
                    max = pos2 - posx;
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();
                        for(int j = 1; j <= max ; j++){
                            if(posx + j == p2 && posy == p1 && pos2 != p2){                     //VERIFICA SE TEM UM PEÇA NO LADO DIREITO
                                return -1;
                            }
                        }
                        if(pos2 == p2 && posy == p1 && personagens.get(i).getCor().equals("Gold")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            return  -1;
                        }

                        if((posy == p1 && pos2 == p2) && personagens.get(i).getCor().equals("Cyan")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("GOLD");
                                personagens.add(new Cyan(965, 556, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Cyan(587, 560, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }
                    }
                    personagens.get(indice).setPosY(pos1);                    //FAZ O MOVIMENTO DA TORRE PARA O LADO DIREITO
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }


                System.out.print("ELSE");
                return -1;


            case "P":
                for(int i = 0; i < personagens.size() ; i++){              //SISTEMA DE COMER PEÇAS ( ESSE FUNCIONA SÓ PARA O PEAO)
                    p1 = personagens.get(i).getPosY();
                    p2 = personagens.get(i).getPosX();

                    if((posy - 1 == p1 && posx + 1 == p2) && personagens.get(i).getCor().equals("Cyan")){  //nesse if ele verificar se tem uma peça nessa posição (digonal direita)
                        if(p1 == pos1 && p2 == pos2){  //aqui ele verifica se o usuario inseriu para a peça andar nessa direção aonde está a outra peça para comer
                            personagens.get(indice).setPosY(pos1);
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){ //se o rei morrer acaba o jogo
                                end("GOLD");
                                personagens.add(new Cyan(925, 120, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            personagens.add(new Cyan(925, 120, personagens.get(i).getDesenho(), "Cyan", "X"));
                            personagens.remove(i);
                            return 1;
                        }
                    }
                    if((posy - 1 == p1 && posx - 1 == p2) && personagens.get(i).getCor().equals("Cyan")){        //nesse if ele verificar se tem uma peça nessa posição (digonal esquerda)
                        if(p1 == pos1 && p2 == pos2){    //aqui ele verifica se o usuario inseriu para a peça andar nessa direção aonde está a outra peça para comer
                            personagens.get(indice).setPosY(pos1);
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){   //se o rei morrer acaba o jogo
                                end("GOLD");
                                personagens.add(new Cyan(925, 120, personagens.get(i).getDesenho(), "Cyan", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            personagens.add(new Cyan(142, 547, personagens.get(i).getDesenho(), "Cyan", "X"));
                            personagens.remove(i);
                            return 1;
                        }
                    }
                }  //durante esse for tem 2 verificaçoes pois o peao pode comer tanto para a direita da diagonal quanto para esquerda.



                for(int i = 0; i < personagens.size() ; i++){          //VERIFICAR SE A CASA DA FRENTE TEM ALGUEM
                    p1 = personagens.get(i).getPosY();
                    p2 = personagens.get(i).getPosX();
                    if(posy -1 == p1 && posx == p2){
                        return -1;
                    }
                }

                for(int j = 1; j < 9; j++){                         //SISTEMA DE ANDAR DUAS CASA PRIMEIRA VEZ DO PEAO
                    if(posx == j && posy == 7){
                        if(posy - 2 == pos1 && posx == pos2){
                            personagens.get(indice).setPosY(pos1);
                            return 1;
                        }
                    }
                }
                if(posy - 1 == pos1 && posx == pos2){                   //FAZ A MOVIMENTAÇÃO 1 CASA
                    personagens.get(indice).setPosY(pos1);
                    return 1;
                }

            default:
            return  -1;


        }


    }

    static int movimentoCyan(int posy, int posx, int indice, List<Xadrez> personagens){
        Scanner leitor = new Scanner(System.in);
        int pos1, pos2;
        int p1, p2;
        int max;
        System.out.printf("Escolha a posição Y para mexer a peça: ");
        pos1 = Integer.parseInt(leitor.nextLine());

        System.out.printf("Escolha a posição X para mexer a peça: ");
        pos2 = Integer.parseInt(leitor.nextLine());

        if((pos1 < 1  || pos1 > 8)  || (pos2 < 1  || pos2 > 8)){
            return -1;
        }

        switch(personagens.get(indice).getTipo()){
            case "REI":
                System.out.print("MIOJO");
                return 1;


            case "RAINHA":
                System.out.print("RAINHA");
                return  1;


            case "B":


                return  1;

            case "C":


                return  1;

            case "T":
                //MOVIMENTAR TORRE


                //ATRAS (LOGICA CONTRARIA DO GOLD)
                if(pos1 < posy && pos2 == posx){
                    max = posy - pos1;                           // RECEBE A DIFERENÇA ENTRE A POS ORIGINAL E A POS DE MOVIMENTO
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();
                        for(int j = 1; j <= max; j++){         //VERIFICA SE TEM PEÇAS NA ATRAS(LOGICA CONTRARIA DO MOVIMENTO GOLD (SÉ É PARA FRENTE AQUI VAI SER PRA TRAS))
                            if(posy - j == p1 && posx == p2 && pos1 != p1){
                                System.out.print("erro casa ");
                                return  -1;
                            }
                        }
                        if(pos1 == p1 && posx == p2 && personagens.get(i).getCor().equals("Cyan")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            System.out.print("time");
                            return  -1;
                        }

                        if((pos1 == p1 && posx == p2) && personagens.get(i).getCor().equals("Gold")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("CYAN");
                                personagens.add(new Gold(965, 556, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Gold(587, 560, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }
                    }

                    personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PRA ATRAS
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }



                //FRENTE
                if(pos1 > posy && pos2 == posx){
                    max = pos1 - posy;                      // RECEBE A DIFERENÇA ENTRE A POS ORIGINAL E A POS DE MOVIMENTO
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();
                        for(int j = 1; j <= max ; j++){
                            if(posy + j == p1 && posx == p2 && pos1 != p1){                      //VERIFICA SE TEM PEÇAS NA FRENTE
                                return  -1;
                            }
                        }
                        if(pos1 == p1 &&  posx == p2 && personagens.get(i).getCor().equals("Cyan")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            return  -1;
                        }

                        if((pos1 == p1 && posx == p2) && personagens.get(i).getCor().equals("Gold")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("CYAN");
                                personagens.add(new Gold(965, 556, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Gold(965, 556, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }
                    }
                    personagens.get(indice).setPosY(pos1);                      //FAZ O MOVIMENTO DA TORRE PRA FRENTE
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }



                //DIREITA (ESQUERDA NO OLHAR DO DOURADO)
                if(pos1 == posy && pos2 < posx){
                    max = posx - pos2;
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();
                        for(int j = 1; j <= max ; j++){
                            if(posx - j == p2 && posy == p1 && pos2 != p2){                     //VERIFICA SE TEM UM PEÇA NO LADO DIREITO
                                return -1;
                            }
                        }
                        if(pos2 == p2 && posy == p1 && personagens.get(i).getCor().equals("Cyan")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            return  -1;
                        }

                        if((posy == p1 && pos2 == p2) && personagens.get(i).getCor().equals("Gold")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("CYAN");
                                personagens.add(new Gold(965, 556, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Gold(965, 556, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }
                    }
                    personagens.get(indice).setPosY(pos1);                  //FAZ O MOVIMENTO DA TORRE PARA O LADO DIREITO
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }

                //ESQUERDA  (DIREITA NO OLHAR DO DOURADO)
                if(pos1 == posy && pos2 > posx){
                    max = pos2 - posx;
                    for(int i = 0; i < personagens.size(); i++){
                        p1 = personagens.get(i).getPosY();
                        p2 = personagens.get(i).getPosX();
                        for(int j = 1; j <= max ; j++){
                            if(posx + j == p2 && posy == p1 && pos2 != p2){                     //VERIFICA SE TEM UM PEÇA NO LADO ESQUERDO
                                return -1;
                            }
                        }
                        if(posy == p1 && pos2 == p2 && personagens.get(i).getCor().equals("Cyan")){   //VERIFICA SE NA CASA QUE O JOGADOR VAI ANDAR É PEÇA DE QUAL TIME
                            return  -1;
                        }

                        if((posy == p1 && pos2 == p2) && personagens.get(i).getCor().equals("Gold")){      //REMOVER A PEÇA
                            personagens.get(indice).setPosY(pos1);                //FAZ O MOVIMENTO DA TORRE PARA ONDE COMEU A PEÇA
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){
                                end("CYAN");
                                personagens.add(new Gold(965, 556, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            else{
                                personagens.add(new Gold(965, 556, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 1;
                            }
                        }
                    }
                    personagens.get(indice).setPosY(pos1);                    //FAZ O MOVIMENTO DA TORRE PARA O LADO ESQUERDO
                    personagens.get(indice).setPosX(pos2);
                    return 1;
                }

                System.out.print("ELSE");
                return  -1;

            case "P":
                for(int i = 0; i < personagens.size() ; i++){              //SISTEMA DE COMER PEÇAS ( ESSE FUNCIONA SÓ PARA O PEAO)
                    p1 = personagens.get(i).getPosY();
                    p2 = personagens.get(i).getPosX();
                    if((posy + 1 == p1 && posx + 1 == p2) && personagens.get(i).getCor().equals("Gold")){  //nesse if ele verificar se tem uma peça nessa posição (digonal direita)
                        if(p1 == pos1 && p2 == pos2){  //aqui ele verifica se o usuario inseriu para a peça andar nessa direção aonde está a outra peça para comer
                            personagens.get(indice).setPosY(pos1);
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){  //se o rei morrer acaba o jogo
                                end("CYAN");
                                personagens.add(new Gold(439, 656, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            personagens.add(new Gold(923, 765, personagens.get(i).getDesenho(), "Gold", "X"));
                            personagens.remove(i);
                            return 1;
                        }
                    }
                    if((posy + 1 == p1 && posx - 1 == p2) && personagens.get(i).getCor().equals("Gold")){        //nesse if ele verificar se tem uma peça nessa posição (digonal esquerda)
                        if(p1 == pos1 && p2 == pos2){    //aqui ele verifica se o usuario inseriu para a peça andar nessa direção aonde está a outra peça para comer
                            personagens.get(indice).setPosY(pos1);
                            personagens.get(indice).setPosX(pos2);
                            if(personagens.get(i).getTipo().equals("REI")){ //se o rei morrer acaba o jogo
                                end("CYAN");
                                personagens.add(new Gold(932, 945, personagens.get(i).getDesenho(), "Gold", "X"));
                                personagens.remove(i);
                                return 2;
                            }
                            personagens.add(new Gold(976, 659, personagens.get(i).getDesenho(), "Gold", "X"));
                            personagens.remove(i);
                            return 1;
                        }
                    }
                }  //durante esse for tem 2 verificaçoes pois o peao pode comer tanto para a direita da diagonal quanto para esquerda.



                for(int i = 0; i < personagens.size() ; i++){         //VERIFICAR SE A CASA DA FRENTE TEM ALGUEM
                    p1 = personagens.get(i).getPosY();
                    p2 = personagens.get(i).getPosX();
                    if(posy + 1 == p1 && posx == p2){
                        return -1;
                    }
                }


                for(int j = 1; j < 9; j++){                       //MOVIMENTAR O PEAO 2 CASAS A FRENTE NA PRIMEIRA MEXIDA
                    if(posx == j && posy == 2){
                        if(posy + 2 == pos1 && posx == pos2){
                            personagens.get(indice).setPosY(pos1);
                            return  1;
                        }
                    }
                }
                if(posy + 1 == pos1 && posx == pos2){           //MOVIMENTAR O PEAO
                    personagens.get(indice).setPosY(pos1);
                    return  1;
                }

                

            default:
            return  -1;
        }
    }


    public static void main(String[] args){
            List<Xadrez> personagens = new ArrayList<Xadrez>();
            Scanner leitor = new Scanner(System.in);
            int opcao;
            int posx, posy;
            int controle = 0;
            int turno = 0;
            int aux = 0;
            int registro = 0;
            int retorno = 0;
            inicio(personagens);

            do{
                tabuleiro(8, 8, personagens);
                System.out.printf("[1] - Play\n");
                System.out.printf("[2] - Exit\n");
                System.out.printf("--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--\n");
                System.out.print( "     ♔ ♕ ♖ ♗ ♘ ♙ : ♚ ♛  ♜  ♝  ♞ ♟\n");
                System.out.printf("--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--\n");
                System.out.print( "Informe um numero de acordo com as opçoes: ");
                opcao = Integer.parseInt(leitor.nextLine());


                switch(opcao){

                    case 1:
                        if( turno % 2 == 0){
                            System.out.printf("\nDourado, escolha um cordenada para selecionar a peça que deseja mexer...");
                        }
                        else{
                            System.out.printf("\nCiano, escolha um cordenada para selecionar a peça que deseja mexer...");
                        }


                        System.out.printf("\nInforme a posição Y: ");
                        posy = Integer.parseInt(leitor.nextLine());

                        System.out.printf("Informe a posição X: ");
                        posx = Integer.parseInt(leitor.nextLine());

                        for(int i = 0; i < personagens.size() ; i++){
                            if(personagens.get(i).getPosY() == posy && personagens.get(i).getPosX() == posx){


                                if(personagens.get(i).getCor().equals("Gold") && turno % 2 == 0){
                                    registro = 1;

                                    retorno = movimentoGold(posy, posx, i, personagens);

                                    if(retorno == 1){
                                        aux = 1;
                                        turno++;
                                    }

                                    if(retorno == 2){
                                        tabuleiro(8, 8, personagens);
                                        aux = 1;
                                        turno++;
                                        opcao = 2;
                                    }

                                }

                                else if(personagens.get(i).getCor().equals("Cyan") && turno % 2 != 0){
                                    registro = 1;

                                    retorno = movimentoCyan(posy, posx, i, personagens);

                                    if(retorno == 1){
                                        aux = 1;
                                        turno++;
                                    }

                                    if(retorno == 2){
                                        tabuleiro(8, 8, personagens);
                                        aux = 1;
                                        turno++;
                                        opcao = 2;
                                    }


                                }

                                if(aux != 1 && registro == 1){
                                    System.out.println("\nMovimento Invalido!");
                                }

                                if(personagens.get(i).getCor().equals("Gold") && registro != 1){
                                    System.out.printf("\nInfelizmente a peça selecionada é do time Dourado, agora é a vez do Ciano jogar \n");
                                }
                                else if(personagens.get(i).getCor().equals("Cyan") && registro != 1){
                                    System.out.printf("\nInfelizmente a peça selecionada é do time Ciano, agora é a vez do Dourado jogar \n");
                                }

                                aux = 0;
                                registro = 0;
                                controle = 1;
                            }
                        }

                        if(controle != 1){
                            System.out.printf("\nInforme uma posição que tenha uma peça!\n");
                        }

                        controle = 0;
                    break;


                    default:
                    break;


                }

            }while(opcao != 2);
    }



}