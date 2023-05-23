package creational_design_patterns.Abstrac_Factory_Method;

import creational_design_patterns.Abstrac_Factory_Method.Abstract_Factory.ObstacleFactory;
import creational_design_patterns.Abstrac_Factory_Method.Concrete_Factory.Asteroids.Level1AsteroidsFactory;
import creational_design_patterns.Abstrac_Factory_Method.Concrete_Factory.Asteroids.Level2AsteroidsFactory;
import creational_design_patterns.Abstrac_Factory_Method.Concrete_Factory.DebrisField.Level1DebrisFieldFactory;
import creational_design_patterns.Abstrac_Factory_Method.Concrete_Factory.DebrisField.Level2DebrisFieldFactory;
import creational_design_patterns.Abstrac_Factory_Method.Product.Asteriods.Asteriods;
import creational_design_patterns.Abstrac_Factory_Method.Product.Obstacle;

public class Client
{
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        ObstacleFactory obstacleFactory;

        if(level==1) obstacleFactory= new Level1AsteroidsFactory();
        else obstacleFactory=new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Obstacle obstacle= obstacleFactory.createObstacle(score);
        obstacle.show();

        if(level==1) obstacleFactory=new Level1DebrisFieldFactory();
        else obstacleFactory=new Level2DebrisFieldFactory();

        obstacle=obstacleFactory.createObstacle(score);
        obstacle.show();
    }
}
