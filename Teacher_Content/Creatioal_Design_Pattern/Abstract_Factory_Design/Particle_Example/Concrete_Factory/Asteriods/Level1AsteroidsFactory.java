package creational_design_patterns.Abstrac_Factory_Method.Concrete_Factory.Asteroids;

import creational_design_patterns.Abstrac_Factory_Method.Product.Asteriods.Ice_Asteroids;
import creational_design_patterns.Abstrac_Factory_Method.Product.Asteriods.Iron_Asteroids;
import creational_design_patterns.Abstrac_Factory_Method.Product.Obstacle;

public class Level1AsteroidsFactory extends AsteriodsFactory
{

    @Override
    public Obstacle createObstacle(int score) {
        if(score>500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
