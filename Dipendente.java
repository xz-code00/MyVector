class Dipendente {
    private String cognome;
    private double stipendio;

    public Dipendente(String cognome, double stipendio){
        this.cognome = cognome;
        this.stipendio = stipendio;
    }

    public String getCognome(){
        return cognome;
    }
    public double getStipendio(){
        return stipendio;
    }

    public String toString(){
        return cognome + " " + stipendio;
    }

    public boolean equals(Object x){
        if (x instanceof Dipendente)
            return (this.cognome.equals(((Dipendente)x).cognome) && this.stipendio == ((Dipendente)x).stipendio);
        else
            return false;
    }



}
