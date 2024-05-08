public class PeaoCyan extends Cyan{
    private int p1;
    private int p2;
    private int py;
    private int px;


    PeaoCyan(int posY, int posX, String desenho, String cor, String tipo, int pos1, int pos2){
        super(posY, posX, desenho, cor, tipo);
        this.p1 = pos1;
        this.p2 = pos2;
        this.py = posY;
        this.px = posX;
    }

    @Override
    public int movimentar(){
        if(py + 1 == p1 && px == p2)
            return 1;
        else{
            return super.movimentar();
        }
    }



    //vai aumentar uma casa, ja o peao amarela diminui

}
