package peaksoft;

import java.util.Arrays;

public class Farm {
    private String adress;
    private Cow [] cows;
    private Sheep [] sheeps;
    private Horse [] horse;
    private String OwnerName;

    public Farm(String adress, Cow[] cows, Sheep[] sheeps, Horse[] horse, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horse = horse;
        OwnerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Farm{");
        sb.append("adress='").append(adress).append('\'');
        sb.append(", cows=").append(Arrays.toString(cows));
        sb.append(", sheeps=").append(Arrays.toString(sheeps));
        sb.append(", horse=").append(Arrays.toString(horse));
        sb.append(", OwnerName='").append(OwnerName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
