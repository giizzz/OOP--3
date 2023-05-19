public class Cember {
    private double r;
    public static final double PI=3.1415;//final olarak tanımlanmasının sebebi değiştirilmemesi içindir

    public Cember(){
        this.r=0;
    }
    public Cember(double r){
        this.r=r;
    }
    public double alan(){
        return PI*r*r;
    }
    public double cevre(){
        return 2*PI*r;
    }

}
