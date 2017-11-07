package za.ac.cput.cajun.KeenenVanDalen;

public class Car {

    private int vinNo;
    private String brand;
    private int km;

    public Car(int vinNo, String brand, int km) {
        this.vinNo = vinNo;
        this.brand = brand;
        this.km = km;
    }

    public int getVinNo() {
        return vinNo;
    }

    public void setVinNo(int vinNo) {
        this.vinNo = vinNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return vinNo  == car.vinNo;
    }

    @Override
    public int hashCode() {
        return vinNo;
    }

}
