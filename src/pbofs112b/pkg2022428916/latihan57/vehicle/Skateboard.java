package pbofs112b.pkg2022428916.latihan57.vehicle;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("SkateBoard");
        super.setBrand("Ally Skate");
        System.out.println("Brand   : " + super.getBrand());
        super.setModel("Rocket");
        System.out.println("Model   : " + super.getModel());
        setBoardLength(54.5);
        System.out.println("Panjangnya Board : " + getBoardLength());
    }
    public double getBoardLength() {
        return myBoardLength;
    }
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}
