public class Gold extends Xadrez {
    Gold(int posY, int posX, String desenho, String cor, String type){
        super(posY, posX, desenho, cor, type);
    }

    public int controleW(){
        return 0;
    }

    @Override
    public String toString(){
        return "\u001B[33m" + this.getDesenho() + "\u001B[0m";
    }

}
