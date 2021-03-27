package pbofs112b.pkg2022428916.latihan57.vehicle;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class Bicycle extends Vehicle{
    public int myGearCount;
    
    public Bicycle() {
        System.out.println("Bicycle");
        super.setBrand("Trek Bike");
        System.out.println("Brand   : " + super.getBrand());
        super.setModel("7.4FX");
        System.out.println("Model   : " + super.getModel());
        setGearCount(23);
        System.out.println("Jumlah Gear : " + getGearCount());
        System.out.println("");
    }
    public int getGearCount() {
        return myGearCount;
    }
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}
