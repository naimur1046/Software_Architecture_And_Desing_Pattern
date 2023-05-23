package creational_design_patterns.Abstrac_Factory_Method.Concrete_Factory.Asteroids;

import creational_design_patterns.Abstrac_Factory_Method.Product.Asteriods.Rocky_Asteroids;
import creational_design_patterns.Abstrac_Factory_Method.Product.Asteriods.Silicon_Asteroids;
import creational_design_patterns.Abstrac_Factory_Method.Product.Obstacle;

public class Level2AsteroidsFactory extends AsteriodsFactory
{

    @Override
    public Obstacle createObstacle(int score) {
        if (score>1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
