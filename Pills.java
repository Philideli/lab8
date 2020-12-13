package lab8;

import java.util.Objects;

public class Pills extends Medicine{
    private double dosage;

    public Pills(String name, double dosage, int receiveFrequencyPerDay, int actionTime, String disease){
        super(name, receiveFrequencyPerDay, actionTime, disease);
        this.dosage = dosage;
    }

    public Pills(String name, double dosage){
        super(name, 2, 10, "біль");
        this.receiveFrequencyPerDay = 2;
        this.actionTime = 10;
        this.disease = "біль";
        this.dosage = dosage;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pills pills = (Pills) o;
        return Double.compare(pills.dosage, dosage) == 0;
    }

    @Override
    public String toString() {
        return "Pills{" +
                "name='" + name +
                ", dosage=" + dosage + '\'' +
                ", receiveFrequencyPerDay=" + receiveFrequencyPerDay +
                ", actionTime=" + actionTime +
                ", disease='" + disease + '\'' +
                '}';
    }

    public String toString(int i) {
        return  "name='" + name +
                ", dosage=" + dosage + '\'' +
                ", receiveFrequencyPerDay=" + receiveFrequencyPerDay +
                ", actionTime=" + actionTime +
                ", disease='" + disease + '\'';
    }
}
