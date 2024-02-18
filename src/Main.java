
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("---<Donner la taille de la première poupée: ");
        int taille1 = input.nextInt();
        System.out.print("---<Donner la taille de la deuxième poupée: ");
        int taille2 = input.nextInt();
        System.out.print("---<Donner la taille de la troisième poupée: ");
        int taille3 = input.nextInt();

        PoupeeRusse poupee1 = new PoupeeRusse(taille1, false);
        PoupeeRusse poupee2 = new PoupeeRusse(taille2, false);
        PoupeeRusse poupee3 = new PoupeeRusse(taille3, false);
        int choix;
        int taillechoix;
        do {
            System.out.println("---------------<    Menu   >---------------------");
            System.out.println("|------------------------------------------------|");
            System.out.println("|1--<         ouvrir une poupee               >--|");
            System.out.println("|2--<         fermer une poupee               >--|");
            System.out.println("|3--< placer une poupee dans une autre poupee >--|");
            System.out.println("|4--<     Retirer la poupée d’un autre        >--|");
            System.out.println("|5--<          Quitter                        >--|");
            System.out.println("-------------------------------------------------- ");
            System.out.print("-----< choisir une opperation :");
            choix = input.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("---<entrez la taille de la poupée qui peut ouvrir :");
                    taillechoix = input.nextInt();
                    if (taillechoix == taille1) {
                        poupee1.ouvrir();
                    } else if (taillechoix == taille2) {
                        poupee2.ouvrir();
                    } else if (taillechoix == taille3) {
                        poupee3.ouvrir();
                    }else {
                        System.out.println("aucun poupée avec cette taille.");
                    }
                    break;
                case 2:
                    System.out.print("---<entrez la taille de la poupée qui peut fermer :");
                    taillechoix = input.nextInt();
                    if (taillechoix == taille1) {
                        poupee1.fermer();
                    } else if (taillechoix == taille2) {
                        poupee2.fermer();
                    } else if (taillechoix == taille3) {
                        poupee3.fermer();
                    }else {
                        System.out.println(" aucun poupée avec cette taille");
                    }
                    break;
                case 3:
                    System.out.print("---<Entrez la taille de la poupée à placer : ");
                    int tpplacer = input.nextInt();
                    System.out.print("---<entrez la taille de la poupée dans laquelle la placer : ");
                    int tpplacerDans = input.nextInt();
                    if (tpplacerDans >= tpplacer) {
                        System.out.println("impossible , la poupée est trop grosse ");
                    } else if (tpplacer == taille1 && tpplacerDans == taille2) {
                        poupee1.placerDans(poupee2);
                    } else if (tpplacer == taille1 && tpplacerDans == taille3) {
                        poupee1.placerDans(poupee3);
                    } else if (tpplacer == taille2 && tpplacerDans == taille1) {
                        poupee2.placerDans(poupee1);
                    } else if (tpplacer == taille2 && tpplacerDans == taille3) {
                        poupee2.placerDans(poupee3);
                    } else if (tpplacer == taille3 && tpplacerDans == taille1) {
                        poupee3.placerDans(poupee1);
                    } else if (tpplacer == taille3 && tpplacerDans == taille2) {
                        poupee3.placerDans(poupee2);
                    } else
                        System.out.println("aucun poupée avec cette taille");

                    break;
                case 4:
                    System.out.println("---<entrez la taille que vous retirée :");
                    int taillepsortirde = input.nextInt();
                    if (taillepsortirde == taille1) {
                        poupee1.sortirDe(poupee2);
                    } else if (taillepsortirde == taille1) {
                        poupee1.sortirDe(poupee3);
                    } else if (taillepsortirde == taille2) {
                        poupee2.sortirDe(poupee1);
                    } else if (taillepsortirde == taille2) {
                        poupee2.sortirDe(poupee3);
                    } else if (taillepsortirde == taille3) {
                        poupee3.sortirDe(poupee1);
                    } else if (taillepsortirde == taille3) {
                        poupee3.sortirDe(poupee2);
                    } else {
                        System.out.println("aucun avec cette taille ");
                    }
                    break;
                case 5:
                    System.out.println("à bientot , vous avez quitter");
                default:
                    System.out.println("choix invalid !");
            }
        }
        while (choix != 5);

    }
}