public class Demenagement {
    public static void main(String[] args) {
        // Affiche un message de bienvenue dans la console
        System.out.println("Welcome to Demo");

        // Déclare la variable totalCartons qui contient le nombre total de cartons à transporter
        int totalCartons = 34;

        // Déclare la variable capaciteCamion qui représente la capacité maximale du camion
        int capaciteCamion = 9;

        // Déclare la variable voyage pour compter le nombre de voyages effectués
        int voyage = 0;

        // Boucle while qui s'exécute tant qu'il reste des cartons à transporter
        while (totalCartons > 0) {
            // Incrémente le nombre de voyages à chaque itération
            voyage++;

            // Déclare une variable pour stocker le nombre de cartons transportés dans ce voyage
            int cartonsTransportes;

            // Si le nombre de cartons restant est supérieur ou égal à la capacité du camion
            if (totalCartons >= capaciteCamion) {
                // Le camion transporte le nombre maximum de cartons (la capacité du camion)
                cartonsTransportes = capaciteCamion;
            } else {
                // Si moins de cartons restent, le camion transporte uniquement le reste
                cartonsTransportes = totalCartons;
            }

            // Affiche dans la console le nombre de cartons transportés pour ce voyage
            System.out.println("Voyage " + voyage + ": un voyage de " + cartonsTransportes + " cartons.");

            // Réduit le nombre de cartons restants après chaque voyage
            totalCartons -= cartonsTransportes;
        }
    }
}
