package creational_design_patterns.Abstrac_Factory_Method.Product.DebrisField;

import creational_design_patterns.Abstrac_Factory_Method.Product.Obstacle;

public class PersistentDebrisField implements Obstacle
{

    @Override
    public void show() {
        System.out.println("Persistent Debris Field Appeared");
    }
}
