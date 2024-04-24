import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET =  "\u001B[0m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";

    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

    /* if(posX[0] - 1 == i && posY[0] - 1 == j)//
            System.out.print("[ " + ANSI_RED +  imagem[0] + ANSI_RESET + " ]" );

                else if(posX[1] - 1 == i && posY[1] - 1 == j)
            System.out.print("[ " + ANSI_GREEN +  imagem[1] + ANSI_RESET + " ]" );
             else
                    System.out.printf("[ . ]");


     */
    static void tabuleiro(int linhas, int colunas, List<Personagem> pers){
        boolean personagem;
        int color = 0;
        int colorx = 0;
        int colory = 0;
        int aux = 0;
        System.out.printf("\n--~--~--~--~--~--~--~--~--~--~--~--\n");
;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                personagem = false;
                for(int k = 0; k < pers.size(); k++){
                        if(pers.get(k).getPosX() - 1 == i && pers.get(k).getPosY() - 1== j){
                            if(aux < 16){
                                if (colorx % 2 == 0){
                                    if (color % 2 == 0) {
                                        System.out.print(ANSI_BLACK_BACKGROUND + "[ " + ANSI_CYAN + pers.get(k).getDesenho() + ANSI_RESET + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);
                                    } else {
                                        System.out.print("[ " + ANSI_RED + pers.get(k).getDesenho() + ANSI_RESET + " ]");
                                    }
                                }
                                     else if(color % 2 == 0){
                                     System.out.print("[ " + ANSI_RED + pers.get(k).getDesenho() + ANSI_RESET + " ]");
                                     }
                                     else
                                        System.out.print(ANSI_BLACK_BACKGROUND + "[ " + ANSI_CYAN + pers.get(k).getDesenho() + ANSI_RESET + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);


                            }


                            else{
                                if (colorx % 2 == 0){
                                    if (color % 2 == 0) {
                                        System.out.print(ANSI_BLACK_BACKGROUND + "[ " + ANSI_RED + pers.get(k).getDesenho() + ANSI_RESET + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);
                                    } else {
                                        System.out.print("[ " + ANSI_RED + pers.get(k).getDesenho() + ANSI_RESET + " ]");
                                    }
                                }
                                else if(color % 2 == 0){
                                    System.out.print("[ " + ANSI_RED + pers.get(k).getDesenho() + ANSI_RESET + " ]");
                                }
                                else
                                    System.out.print(ANSI_BLACK_BACKGROUND + "[ " + ANSI_RED + pers.get(k).getDesenho() + ANSI_RESET + ANSI_BLACK_BACKGROUND + " ]" + ANSI_RESET);


                            }


                            aux++;
                            personagem = true;
                        }

                }
                if (!personagem){
                    if(colorx % 2 == 0) {
                        if (color % 2 == 0) {
                            System.out.print(ANSI_BLACK_BACKGROUND + "[ . ]" + ANSI_RESET);
                        } else {
                            System.out.print("[ . ]");
                        }
                    } else if (color % 2 == 0) {
                        System.out.print("[ . ]");
                    } else {
                        System.out.print(ANSI_BLACK_BACKGROUND + "[ . ]" + ANSI_RESET);
                    }
                }
                color++;
            }
            colorx++;
            System.out.printf("\n");
        }

        System.out.printf("--~--~--~--~--~--~--~--~--~--~--~--\n");
        System.out.printf("    [W]\n");
        System.out.printf("[A] [S] [D]\n");
        System.out.printf("[5] - Sair do Menu\n");

    }



    public static void main(String[] args){
            List<Personagem> personagens = new ArrayList<Personagem>();
            Scanner leitor = new Scanner(System.in);
            int [] pos1 = new int[4];
            int [] pos2 = new int[4];
            String [] simbolo = new String[4];
            String opcao;
            int aux = 0;
            int teste;

            //aux
            personagens.add(new Personagem(4, 4, "."));

            //peças pretas
            personagens.add(new Personagem(1, 1, "T"));
            personagens.add(new Personagem(1, 2, "1"));
            personagens.add(new Personagem(1, 3, "X"));
            personagens.add(new Personagem(1, 4, "$"));
            personagens.add(new Personagem(1, 5, "♚"));
            personagens.add(new Personagem(1, 6, "X"));
            personagens.add(new Personagem(1, 7, "1"));
            personagens.add(new Personagem(1, 8, "T"));

            personagens.add(new Personagem(2, 1, "i"));
            personagens.add(new Personagem(2, 2, "i"));
            personagens.add(new Personagem(2, 3, "i"));
            personagens.add(new Personagem(2, 4, "i"));
            personagens.add(new Personagem(2, 5, "i"));
            personagens.add(new Personagem(2, 6, "i"));
            personagens.add(new Personagem(2, 7, "i"));
            personagens.add(new Personagem(2, 8, "i"));


            //peças brancas
            personagens.add(new Personagem(8, 1, "T"));
            personagens.add(new Personagem(8, 2, "1"));
            personagens.add(new Personagem(8, 3, "X"));
            personagens.add(new Personagem(8, 5, "$"));
            personagens.add(new Personagem(8, 4, "*"));
            personagens.add(new Personagem(8, 6, "X"));
            personagens.add(new Personagem(8, 8, "T"));
            personagens.add(new Personagem(8, 7, "1"));

            personagens.add(new Personagem(7, 1, "I"));
            personagens.add(new Personagem(7, 2, "i"));
            personagens.add(new Personagem(7, 3, "i"));
            personagens.add(new Personagem(7, 4, "i"));
            personagens.add(new Personagem(7, 5, "i"));
            personagens.add(new Personagem(7, 6, "i"));
            personagens.add(new Personagem(7, 7, "i"));
            personagens.add(new Personagem(7, 8, "i"));


            /*
            for(int i = 0; i < 4; i++) {
                pos1[i] = personagens.get(i).pos1();
                pos2[i] = personagens.get(i).pos2();
                simbolo[i] = personagens.get(i).imagem();
            }


             */

            do {
                tabuleiro(8, 8, personagens);



                System.out.printf("--~--~--~--~--~--~--~--~--~--~--~--\n");
                System.out.print( "♔ ♕ ♖ ♗ ♘ ♙  black: ♚ ♛  ♜  ♝  ♞ ♟");
                System.out.print( "\n Informe um caracter de acordo com as opçoes:");
                opcao = leitor.nextLine();


                switch(opcao){

                    case "W":
                       teste = personagens.get(0).getPosX();

                       if(teste <= 1 || teste >= 8){
                           System.out.println("ERRRO");
                       }
                       else
                       personagens.get(0).setPosX(1);

                    break;

                    case "S":
                        teste = personagens.get(0).getPosX();

                        if(teste <= 1 || teste >= 8){
                            System.out.println("ERRRO");
                        }
                        else
                            personagens.get(0).setPosX(1);
                    break;

                    case "A":
                        pos2[0]--;
                    break;

                    case "D":
                        pos2[0]++;
                    break;

                    default:
                    break;


                }


                if(opcao.equals("5")){
                    aux = 5;
                }


            }while(aux != 5);
    }



}