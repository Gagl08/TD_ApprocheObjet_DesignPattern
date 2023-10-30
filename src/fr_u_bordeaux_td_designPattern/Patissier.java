/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

package fr_u_bordeaux_td_designPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un patissier et contenant les informations associées
 * Implémente l'interface Observable pour la gestion des observateurs
 * @author gburgues
 * @author boycos
 */

public class Patissier implements Observable {
    // Attributs privés de la classe Patissier
    private final int seuil;
    private final List<Gateau_Interface> stockGateaux;
    private final List<Observer> observers = new ArrayList<>();
    private final GateauFactory gateauFactory;

    // Constructeur prenant en paramètre le seuil et une GateauFactory
    public Patissier(int seuil, GateauFactory gateauFactory) {
        this.seuil = seuil;
        this.stockGateaux = new ArrayList<>();
        this.gateauFactory = gateauFactory;
    }

    // Méthode pour ajouter un gâteau au stock du patissier
    public void addGateau(Gateau_Interface gateau) {
        stockGateaux.add(gateau);
    }

    // Méthode pour ajouter un observateur à la liste d'observateurs
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Méthode pour retirer un observateur de la liste d'observateurs
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

    }

    // Méthode pour notifier tous les observateurs
    @Override
    public void notifyObservers(Gateau_Interface gateaux) {
        for (Observer observer : observers) {
            observer.update(gateaux);
        }
    }


    // Méthode pour vérifier le stock de gâteaux et en créer de nouveaux si le seuil est atteint
    public void checkStock(Patissier patissier) {
        if (stockGateaux.size() < seuil) {
            ArrayList<Ingredients> ingredients = new ArrayList<>();
            ingredients.add(new Ingredients("Salade"));
            ingredients.add(new Ingredients("Tomate"));
            ingredients.add(new Ingredients("Oignon"));

            Gateau_Interface nouveauGateau = gateauFactory.createGateau("gateau", "Nouveau Gâteau", "Recette du nouveau gâteau", 45, ingredients, this);
            addGateau(nouveauGateau);
            System.out.println("Nouveau gâteau fabriqué!");
        }
    }

    public void removeGateau(Gateau_Interface gateau) {
        stockGateaux.remove(gateau);
        notifyObservers(gateau);
    }
}
