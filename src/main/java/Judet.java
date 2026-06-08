public class Judet {
    String ISO;
    String judet;
    String Regiunea;
    int nrLocuitori;
    int suprafata;
    Judet(){
    }
    Judet(String Iso, String judet, String Regiunea, int nrLocuitori, int suprafata){
        this.ISO = Iso;
        this.judet=judet;
        this.Regiunea = Regiunea;
        this.nrLocuitori = nrLocuitori;
        this.suprafata = suprafata;
    }
    @Override
    public String toString(){
        return ISO+" "+judet+" "+Regiunea+" "+nrLocuitori+" "+suprafata;
    }
}
