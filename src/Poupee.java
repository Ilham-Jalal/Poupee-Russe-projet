public abstract class Poupee {
    private int taille;
    private boolean ouverte;

    public Poupee(int taille){
        this.taille=taille;
        this.ouverte=false;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public boolean isOuvert() {
        return ouverte;
    }

    public void setOuverte(boolean ouverte) {
        this.ouverte = ouverte;
    }

    public abstract void ouvrir();

    public abstract void fermer();

    abstract void placerDans(Poupee p);

    abstract void sortirDe(Poupee p);
}