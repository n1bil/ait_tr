package main.lesson_17.classwork.computer.model;

public class Smartphone extends Laptop {

    private long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", hours=" + hours +
                ", weight=" + weight +
                ", imei=" + imei +
                '}';
    }
}
