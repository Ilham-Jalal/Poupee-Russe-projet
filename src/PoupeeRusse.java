
class PoupeeRusse extends Poupee{
    private Poupee poupee;
    public PoupeeRusse(int taille , boolean ouverte) {
        super(taille);
    }
    public Poupee getPoupee() {
        return poupee;
    }

    public void setPoupee(Poupee poupee) {
        this.poupee = poupee;
    }

    @Override
    public void ouvrir() {
        if (!isOuvert()) {
            setOuverte(true);
            System.out.println("La poupée est ouverte.");
        } else {
            System.out.println("La poupée est déjà ouverte.");
        }
    }

    @Override
    public void fermer() {
        if (isOuvert()) {
            setOuverte(false);
            System.out.println("La poupée est fermée.");
        } else {
            System.out.println("La poupée est déjà fermée.");
        }
    }


    @Override
    public void placerDans(Poupee p) {
        if (!isOuvert()) {
            System.out.println("La poupée est fermée.");
        } else if (poupee != null) {
            System.out.println("La poupée est pleine.");
        }
//        else if (this.getTaille() >= p.getTaille()) {
//            System.out.println("Impossible de placer la poupée.");
//        }
       else {
            setPoupee(p);
            System.out.println("La poupée a été placée avec succès.");
             }
    }

    /**
     * @param p
     */
    @Override
    void sortirDe(Poupee p) {
        if (!isOuvert()) {
            System.out.println("La poupée est fermée.");
        } else if (poupee == null) {
            System.out.println("La poupée est vide.");
        } else {
            setPoupee(null);
            System.out.println("La poupée a été retirée avec succès.");
        }
    }
}