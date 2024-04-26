public class Xadrez {
    private int posX = 0;
    private int posY = 0;
    private String desenho;

    private String cor;

    Xadrez(int py, int px, String imagem, String color){
        posY = py;
        posX = px;
        desenho = imagem;
    }

    public int getPosY(){

        return  posY;
    }

    public int getPosX(){

        return  posX;
    }

    public String getDesenho(){

        return desenho;
    }

    public String getCor() {
        return cor;
    }

    public void setPosY(int pos1){
        posY = pos1 ;
    }

    public void setPosX(int pos2){
        posX = pos2;
    }

    public void setDesenho(String desenho){
        this.desenho = desenho;
    }
}
