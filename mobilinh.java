public public class mobilinh extends kendaraaninh {

    private String tipe;

    public mobilinh(String merek, int tahunProduksi, String tipe) {
        super(merek, tahunProduksi);
        this.tipe = tipe;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipe: " + tipe);
    }
} {
    
}
