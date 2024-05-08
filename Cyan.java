public class Cyan extends Xadrez {

    Cyan(int posY, int posX, String desenho, String cor, String tipo){
        super(posY, posX, desenho, cor, tipo);
    }

    public int controleC(){
        return 1;
    }

    public int movimentar() {
        return -1; // Ou algum outro valor padrão para Cyan
    }




    @Override
    public String toString(){
        return "\u001B[36m" + this.getDesenho() + "\u001B[0m";
    }
}
