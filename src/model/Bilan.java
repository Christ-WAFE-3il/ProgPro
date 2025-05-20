package model;

import java.util.ArrayList;
import java.util.List;

public class Bilan {
    private int idBilan;
    private String mois;
    private double totalHeures;
    private int totalRepas;
    private double montant;
    private Enfant enfant;

    private StrategieCalcul strategie; // Injectée via le constructeur ou un setter

    public Bilan(int idBilan, String mois, double totalHeures, int totalRepas, StrategieCalcul strategie) {
        this.idBilan = idBilan;
        this.mois = mois;
        this.totalHeures = totalHeures;
        this.totalRepas = totalRepas;
        this.enfant = enfant;
        this.strategie = strategie;
        this.montant = strategie.calculerMontant(totalHeures, totalRepas);
    }

    public double getMontant() {
        return montant;
    }
    
    public StrategieCalcul getStrategie() {
		return strategie;
	}

	public void setStrategie(StrategieCalcul strategie) {
		this.strategie = strategie;
	}

	public void setEnfant(Enfant enfant) {
		this.enfant = enfant;
	}

	public Enfant getEnfant() {
        return enfant;
    }

    // Redéfinition toString
    @Override
    public String toString() {
        return "Bilan{" +
                "mois='" + mois + '\'' +
                ", totalHeures=" + totalHeures +
                ", totalRepas=" + totalRepas +
                ", montant=" + montant +
                '}';
    }

	public int getIdBilan() {
		return idBilan;
	}

	public void setIdBilan(int idBilan) {
		this.idBilan = idBilan;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public double getTotalHeures() {
		return totalHeures;
	}

	public void setTotalHeures(double totalHeures) {
		this.totalHeures = totalHeures;
	}

	public int getTotalRepas() {
		return totalRepas;
	}

	public void setTotalRepas(int totalRepas) {
		this.totalRepas = totalRepas;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
    
    
    
}
