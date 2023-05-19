import java.util.Scanner;
public class cemberTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double r;
        System.out.print("Alanını ve çevresini öğrenmek istediğiniz çemberin yarıçapını giriniz->");
        r=input.nextDouble();
        Cember c1=new Cember(r);
        System.out.printf("Çemberin Alanı->%.4f\n",c1.alan());
        System.out.printf("Çemberin Çevresi->%.4f\n",c1.cevre());
    }
}
