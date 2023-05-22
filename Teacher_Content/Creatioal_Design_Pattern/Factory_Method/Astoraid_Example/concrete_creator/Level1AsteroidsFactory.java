package creational_design_patterns.factory_method;

public class Level1AsteroidsFactory extends AsteroidsFactory
{

    @Override
    public Asteroids Create_Asteroids(int score) {
        if(score>500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
