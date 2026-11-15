import javax.xml.namespace.QName;

public class Kucing extends Hewan{
    public Kucing(String nama) {
        super(nama);
    }
    @Override
    public void bersuara() {
        System.out.println(nama + ": Meong!");
    }
}