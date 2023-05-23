package creational_design_patterns.Abstrac_Factory_Method.Abstract_Factory;

import creational_design_patterns.Abstrac_Factory_Method.Product.Obstacle;

public abstract class ObstacleFactory
{
    public abstract Obstacle createObstacle(int score);

}
