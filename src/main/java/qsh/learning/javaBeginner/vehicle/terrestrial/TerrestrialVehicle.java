package qsh.learning.javaBeginner.vehicle.terrestrial;

import qsh.learning.javaBeginner.vehicle.NoAccelerationException;
import qsh.learning.javaBeginner.vehicle.TooHighSpeedException;
import qsh.learning.javaBeginner.vehicle.Vehicle;
import qsh.learning.javaBeginner.vehicle.Wheel;

import java.util.ArrayList;
import java.util.List;

public class TerrestrialVehicle implements Vehicle {

    private final boolean oneWheelsLine;
    protected List<Wheel> rightWheels = new ArrayList<>();
    protected List<Wheel> leftWheels = new ArrayList<>();
    private int speed = 0;

    public TerrestrialVehicle(List<Wheel> wheels) {
        this(wheels, false);
    }

    public TerrestrialVehicle(List<Wheel> wheels, boolean oneWheelsLine) {
        this.oneWheelsLine = oneWheelsLine;
        // ajouter les roues dans le bon axe, en fonction de la direction
        // trier les roues sur chaque axes, du meilleur au plus mauvais pneu
        // Voici le comparateur sous forme de classe anonyme qui peut vous aider :

        //        var comparator = new Comparator<Wheel>() {
        //            @Override
        //            public int compare(Wheel o1, Wheel o2) {
        //                return Double.compare(o1.wear(), o2.wear());
        //            }
        //        }.reversed();
    }

    public void accelerate() throws NoAccelerationException, TooHighSpeedException {
        if (speed > 30) {
            throw new TooHighSpeedException();
        }
        this.speed++;
    }

    public void decelerate() {
        if (speed > 0) {
            this.speed--;
        }
    }

    public void resetSpeed() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNbOfWheels() {
        return rightWheels.size() + leftWheels.size();
    }

    public String getWheelsDescription() {
        // parcourir les roues pour afficher sur le modèle suivant
        // RXX/BRAND---RXX/BRAND
        //          |
        // RXX/BRAND---RXX/BRAND
        //
        // ou 1 seul axe
        //
        // RXX/BRAND
        //    |
        // RXX/BRAND
    }
}
