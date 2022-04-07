
package javapbo7;
import javapbo7.beasiswa.bpelajar;

public class beasiswapelajar implements bpelajar {
    double k,v,d;
    String keterangan;
    double hasil;
    
    public beasiswapelajar(double konten, double visual, double designthink) {
        this.k = konten;
        this.v = visual;
        this.d = designthink;
    }
    
     @Override
    public double konten() {
        k= k*0.50;
        return k;
    }

    @Override
    public double visual() {
        v = v*0.20;
        return v;
    }

    @Override
    public double designthink() {
        d= d*0.30;
        return d;
    }

    @Override
    public double hasil() {
        hasil = konten()+visual()+designthink();
        return hasil;
    }   
    
 
}
