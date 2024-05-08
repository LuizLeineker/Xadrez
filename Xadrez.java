public class Xadrez {
    private int posX = 0;
    private int posY = 0;
    private String desenho;
    private String cor;
    private String tipo;

    Xadrez(int py, int px, String imagem, String color, String type){
        posY = py;
        posX = px;
        desenho = imagem;
        cor = color;
        tipo = type;
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

    public String getTipo(){
        return tipo;
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


    public int movimentar(){
        return -1; // Ou algum outro valor padrão para Cyan
    }
}
