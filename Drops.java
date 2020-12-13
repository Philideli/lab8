package lab8;

import java.util.Objects;

public class Drops extends Medicine{
    private double volume;

    public Drops(String name, double volume, int receiveFrequencyPerDay, int actionTime, String disease){
        super(name, receiveFrequencyPerDay, actionTime, disease);
        this.volume = volume;
    }

    public Drops(String name, double volume){
        super(name, 2, 10, "почервоніння");
        this.receiveFrequencyPerDay = 2;
        this.actionTime = 10;
        this.disease = "почервоніння";
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drops drops = (Drops) o;
        return Double.compare(drops.volume, volume) == 0;
    }

    @Override
    public String toString() {
        return "Drops{" +
                "name='" + name +
                ", volume=" + volume + '\'' +
                ", receiveFrequencyPerDay=" + receiveFrequencyPerDay +
                ", actionTime=" + actionTime +
                ", disease='" + disease + '\'' +
                '}';
    }

    public String toString(int i) {
        return  "name='" + name +
                ", volume=" + volume + '\'' +
                ", receiveFrequencyPerDay=" + receiveFrequencyPerDay +
                ", actionTime=" + actionTime +
                ", disease='" + disease + '\'';
    }

}
