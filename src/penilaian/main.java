
package penilaian;
public class main {
    public static void main (String []args){
        NilaiAkhir ridho = new NilaiAkhir("Muhammad Ridho","2110010148",85,90,92);
        System.out.println("Nama \t    = "+ ridho.getNama());
        System.out.println("Npm \t    = "+ ridho.getNpm()); 
        System.out.println("Nilai Akhir = "+ ridho.hitungNilaiAkhir());
        

    }
    
}