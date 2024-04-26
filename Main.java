import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static final String ANSI_RESET =  "\u001B[0m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";



    static void tabuleiro(int linhas, int colunas, List<Xadrez> pers){
        boolean personagem;
        int color = 0;
        int colorx = 0;
        int aux = 0;
        System.out.printf("\n--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--\n");
;
        for (int i = 0; i < linhas; i++) {
            System.out.printf("%d ", i + 1);
            for (int j = 0; j < colunas; j++) {
                personagem = false;
                for(int k = 0; k < pers.size(); k++){
                        if(pers.get(k).getPosY() - 1 == i && pers.get(k).getPosX() - 1== j){

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







                            aux++;
                            personagem = true;
                        }

                }
                if (!personagem){
                    if(colorx % 2 == 0) {
                        if (color % 2 == 0) {
                            System.out.print(ANSI_BLACK_BACKGROUND + "[ ሞ ]" + ANSI_RESET);
                        } else {
                            System.out.print("[ ሞ ]");
                        }
                    } else if (color % 2 == 0) {
                        System.out.print("[ ሞ ]");
                    } else {
                        System.out.print(ANSI_BLACK_BACKGROUND + "[ ሞ ]" + ANSI_RESET);
                    }
                }
                color++;
            }

            colorx++;
            System.out.printf("\n");
        }


            System.out.printf("    %d     %d    %d     %d     %d    %d     %d    %d  ", 1, 2, 3, 4, 5, 6, 7, 8);

        System.out.printf("\n--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--\n");
        System.out.printf("[1] - Play\n");
        System.out.printf("[2] - Exit\n");

    }



    public static void main(String[] args){
            List<Xadrez> personagens = new ArrayList<Xadrez>();
            List<Cyan>  inimigo = new ArrayList<Cyan>();
            Scanner leitor = new Scanner(System.in);
            int opcao;
            int teste;
            int pos1;
            int pos2;
            int controle = 0;
            int turno = 0;
            int aux;

            //peças cyan
            personagens.add(new Cyan(1, 1, "♖", "Ciano"));
            personagens.add(new Cyan(1, 2, "♞", "Ciano"));
            personagens.add(new Cyan(1, 3, "♝", "Ciano"));
            personagens.add(new Cyan(1, 4, "♔", "Ciano"));
            personagens.add(new Cyan(1, 5, "♕", "Ciano"));
            personagens.add(new Cyan(1, 6, "♝", "Ciano"));
            personagens.add(new Cyan(1, 7, "♞", "Ciano"));
            personagens.add(new Cyan(1, 8, "♖", "Ciano"));

            personagens.add(new Cyan(2, 1, "♟", "Ciano"));
            personagens.add(new Cyan(2, 2, "♟", "Ciano"));
            personagens.add(new Cyan(2, 3, "♟", "Ciano"));
            personagens.add(new Cyan(2, 4, "♟", "Ciano"));
            personagens.add(new Cyan(2, 5, "♟", "Ciano"));
            personagens.add(new Cyan(2, 6, "♟", "Ciano"));
            personagens.add(new Cyan(2, 7, "♟", "Ciano"));
            personagens.add(new Cyan(2, 8, "♟", "Ciano"));


            //peças white
            personagens.add(new Yellow(8, 1, "♜", "Amarelo"));
            personagens.add(new Yellow(8, 2, "♞", "Amarelo"));
            personagens.add(new Yellow(8, 3, "♝", "Amarelo"));
            personagens.add(new Yellow(8, 5, "♚", "Amarelo"));
            personagens.add(new Yellow(8, 4, "♛", "Amarelo"));
            personagens.add(new Yellow(8, 6, "♝", "Amarelo"));
            personagens.add(new Yellow(8, 7, "♞", "Amarelo"));
            personagens.add(new Yellow(8, 8, "♜", "Amarelo"));

            personagens.add(new Yellow(7, 1, "♟", "Amarelo"));
            personagens.add(new Yellow(7, 2, "♟", "Amarelo"));
            personagens.add(new Yellow(7, 3, "♟", "Amarelo"));
            personagens.add(new Yellow(7, 4, "♟", "Amarelo"));
            personagens.add(new Yellow(7, 5, "♟", "Amarelo"));
            personagens.add(new Yellow(7, 6, "♟", "Amarelo"));
            personagens.add(new Yellow(7, 7, "♟", "Amarelo"));
            personagens.add(new Yellow(7, 8, "♟", "Amarelo"));


            /*
            for(int i = 0; i < 4; i++) {
                pos1[i] = personagens.get(i).pos1();
                pos2[i] = personagens.get(i).pos2();
                simbolo[i] = personagens.get(i).imagem();
            }


             */

            do {
                tabuleiro(8, 8, personagens);



                System.out.printf("--~--~--~--~--~--~--~--~--~--~--~--~--~--~--~--\n");
                System.out.print( "   ♔ ♕ ♖ ♗ ♘ ♙ : ♚ ♛  ♜  ♝  ♞ ♟");
                System.out.print( "\nInforme um numero de acordo com as opçoes: ");
                opcao = Integer.parseInt(leitor.nextLine());


                switch(opcao){

                    case 1:
                        System.out.printf("Informe a posição Y: ");
                        pos1 = Integer.parseInt(leitor.nextLine());

                        System.out.printf("Informe a posição X: ");
                        pos2 = Integer.parseInt(leitor.nextLine());

                        for(int i = 0; i < personagens.size() ; i++) {
                            if(personagens.get(i).getPosY() == pos1 && personagens.get(i).getPosX() == pos2){
                                System.out.printf("Escolha a posição Y para mexer a peça: ");
                                pos1 = Integer.parseInt(leitor.nextLine());
                                personagens.get(i).setPosY(pos1);

                                

                                System.out.printf("Escolha a posição X para mexer a peça: ");
                                pos2 = Integer.parseInt(leitor.nextLine());
                                personagens.get(i).setPosX(pos2);


                                controle = 1;
                                turno++;
                            }
                        }

                        if(controle != 1){
                            System.out.printf("Informe uma posição que tenha uma peça!\n");
                        }

                        controle = 0;
                    break;

                    case 2:
                        teste = personagens.get(0).getPosX();

                        if(teste <= 1 || teste >= 8){
                            System.out.println("ERRRO");
                        }
                        else
                            personagens.get(0).setPosX(1);
                    break;


                    default:
                    break;


                }

            }while(opcao != 3);
    }



}