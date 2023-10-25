package qsh.learning.javaBeginner;

public class Main {
    public static void main(String[] args) {
        var car = /* créer l'objet Car */;

        var wheel = /* créer l'objet Wheel */;
        /* initialiser les caractéristiques de Wheel  */

        /* attribuer la Wheel sur les 4 essieux */

        System.out.println("Car is started " + car.started + " should be false");
        /* la voiture démarre avec une vitesse de 5 */
        System.out.println("Car is started " + car.started + " should be true");

        System.out.println("Actual car speed " + car.speed + " should be 5");
        /* la vitesse de la voiture augmente de 5 */
        System.out.println("Actual car speed " + car.speed + " should be 10");
        /* la vitesse de la voiture augmente de 20 */
        System.out.println("Actual car speed " + car.speed + " should be 30");
        /* la vitesse de la voiture diminue de 5 */
        System.out.println("Actual car speed " + car.speed + " should be 25");
    }
}