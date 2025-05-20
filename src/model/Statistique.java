package model;

import java.util.*;

public class Statistique {
    private static Statistique instance;
    private List<Bilan> bilans;
    private Set<Enfant> enfants;

    private Statistique() {
        bilans = new ArrayList<>();
        enfants = new HashSet<>();
    }

    public static Statistique getInstance() {
        if (instance == null) {
            instance = new Statistique();
        }
        return instance;
    }

    public void ajouterBilan(Bilan bilan) {
        bilans.add(bilan);
        enfants.add(bilan.getEnfant()); // On suppose que chaque bilan est lié à un enfant
    }

    public double getRevenuTotal() {
        return bilans.stream().mapToDouble(Bilan::getMontant).sum();
    }

    public double getHeuresTotales() {
        return bilans.stream().mapToDouble(Bilan::getTotalHeures).sum();
    }

    public int getTotalRepas() {
        return bilans.stream().mapToInt(Bilan::getTotalRepas).sum();
    }

    public double getRevenuMoyen() {
        return bilans.isEmpty() ? 0 : getRevenuTotal() / bilans.size();
    }

    public int getNombreEnfants() {
        return enfants.size();
    }

    @Override
    public String toString() {
        return "Statistiques mensuelles :\n" +
                "- Revenu total : " + getRevenuTotal() + " €\n" +
                "- Heures totales : " + getHeuresTotales() + " h\n" +
                "- Total repas : " + getTotalRepas() + "\n" +
                "- Revenu moyen : " + getRevenuMoyen() + " €\n" +
                "- Nombre d'enfants gardés : " + getNombreEnfants();
    }
}
