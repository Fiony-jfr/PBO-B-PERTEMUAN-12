public class Tumbuhan extends MakhlukHidup {
    // Koreksi: Ubah 'Akar' menjadi 'akar' (camelCase)
    private String akar;

    public Tumbuhan(String akar){
        this.akar = akar;
    }

    @Override
    public void berdiri (){
        System.out.println("Tumbuhan berdiri dengan     :  " + akar);
    }
}
