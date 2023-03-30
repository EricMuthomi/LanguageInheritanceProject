public class Noodle {
    protected double lengthInCentimeters, widthInCentimeters;
    protected  String shape, ingredients;
    protected String texture = "brittle";

    //the class constructor
    public Noodle(double lengthInCentimeters, double widthInCentimeters,String shape, String ingredients){
        this.lengthInCentimeters = lengthInCentimeters;
        this.widthInCentimeters = widthInCentimeters;
        this.shape = shape;
        this.ingredients = ingredients;
    }

    public void cook(){
        this.texture = "cooked";
    }
}
