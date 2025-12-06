public class Hewan extends MakhlukHidup {
    private String kakiEmpat, kakiDua;

    public Hewan(String kakiEmpat, String kakiDua){
        this.kakiEmpat = kakiEmpat;
        this.kakiDua   = kakiDua;
    }
    
    @Override
    public void berdiri (){
        // Catatan: Logika ini hardcode (Kambing/Ayam), 
        // tapi secara sintaks valid.
        System.out.println("Kambing berdiri menggunakan :  " + kakiEmpat);
        System.out.println("Ayam berdiri menggunakan    :  " + kakiDua);
    }    
}
