package fr.polytech.sim.cycling;

public class TagAlongBike extends Bike {

    public TagAlongBike(Bike childBike) {
        super();
        this.components.add(childBike);
    }
}
