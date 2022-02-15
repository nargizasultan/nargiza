package peaksoft;

public class Horse extends DomesticAnimal {
    private String color;


    public Horse(double weight, byte age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color=color;
    }
}
