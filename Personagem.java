public class Personagem{
    private int posX = 0;
    private int posY = 0;
    private String desenho;

    int indice; //esse talvez vai ser um ponto de controle para printar com cor ou talvez não (apenas uma ideia);

    Personagem(int px, int py, String imagem){
        posX = px;
        posY = py;
        desenho = imagem;
    }

    public int getPosX(){

        return  posX;
    }

    public int getPosY(){

        return  posY;
    }

    public String getDesenho(){

        return desenho;
    }


    public void setPosX(int pos1) {
        posX = posX + pos1 ;
    }

    public void setPosY(int pos2) {
        posY = posX - pos2;
    }

    public void setDesenho(String desenho){
        this.desenho = desenho;
    }
}
