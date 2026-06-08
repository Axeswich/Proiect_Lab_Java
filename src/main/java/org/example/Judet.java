package org.example;

import java.util.Comparator;

public class Judet {
    String ISO;
    String judet;
    String Regiunea;
    String nrLocuitori;
    String suprafata;
    Judet(){
    }
    Judet(String Iso, String judet, String Regiunea, String nrLocuitori, String suprafata){
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
    @Override
            public boolean equals(Object o){
                if(this.toString().equals(o.toString())){
                    return true;
                }
                return false;
    }
    Comparator<Judet> judeteComparator = new Comparator<Judet>() {
        @Override
        public int compare(Judet o1, Judet o2) {
            return o1.nrLocuitori.compareTo(o2.nrLocuitori);
        }
    };

}
