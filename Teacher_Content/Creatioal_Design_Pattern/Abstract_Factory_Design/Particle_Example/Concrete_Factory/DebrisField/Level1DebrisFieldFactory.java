package creational_design_patterns.Abstrac_Factory_Method.Concrete_Factory.DebrisField;

import creational_design_patterns.Abstrac_Factory_Method.Product.DebrisField.DynamicDebrisField;
import creational_design_patterns.Abstrac_Factory_Method.Product.DebrisField.StaticDebrisField;
import creational_design_patterns.Abstrac_Factory_Method.Product.Obstacle;

public class Level1DebrisFieldFactory extends DebrisFieldFactory
{

    @Override
    public Obstacle createObstacle(int score) {
        if(score>1500) return new DynamicDebrisField();
        else return new StaticDebrisField();
    }
}
