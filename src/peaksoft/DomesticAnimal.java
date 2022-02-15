package peaksoft;

public abstract class DomesticAnimal {
    private double weight;
    private byte age;
    private char gender;
    private String nickName;

    public DomesticAnimal(double weight, byte age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DomesticAnimal{");
        sb.append("weight=").append(weight);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
