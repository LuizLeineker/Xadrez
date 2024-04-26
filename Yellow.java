public class Yellow extends Xadrez {
    Yellow(int posY, int posX, String desenho, String cor){
        super(posY, posX, desenho, cor);
    }

    public int controleW(){
        return 0;
    }

    @Override
    public String toString(){
        return "\u001B[33m" + this.getDesenho() + "\u001B[0m";
    }

}
