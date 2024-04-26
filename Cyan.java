public class Cyan extends Xadrez {

    Cyan(int posY, int posX, String desenho, String cor){
        super(posY, posX, desenho, cor);
    }

    public int controleC(){
        return 1;
    }


    @Override
    public String toString(){
        return "\u001B[36m" + this.getDesenho() + "\u001B[0m";
    }
}
