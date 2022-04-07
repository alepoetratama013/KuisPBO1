package javapbo7;
import javapbo7.beasiswa.bmahasiswa;
        
public class beasiswamahasiswa implements bmahasiswa{
    double struktur,relev,problem;
    double hasil;
    public beasiswamahasiswa(double struktur, double relev, double problem) {
        this.struktur = struktur;
        this.relev = relev;
        this.problem = problem;
    }
    
    @Override
    public double struktur() {
        struktur = (struktur*60)/100;
        return struktur;
    }

    @Override
    public double relev() {
        relev = (relev*25)/100;
        return relev;
    }

    @Override
    public double problem() {
        problem = (problem*15)/100;
        return problem;
    }
    public double hasil() {
        hasil = struktur() + relev() + problem();
        return hasil;
    }
    
}
