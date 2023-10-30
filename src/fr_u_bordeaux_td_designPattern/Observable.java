/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

package fr_u_bordeaux_td_designPattern;

// Interface Observable
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

    // Méthode pour notifier tous les observateurs
    void notifyObservers(Gateau_Interface gateaux);
}