package creational_design_patterns.factory_method;

public class Level2AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids Create_Asteroids(int score) {
        if(score>1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
