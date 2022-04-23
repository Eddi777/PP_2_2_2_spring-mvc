package web.models;

public class Car {
    private String model;
    private String number;
    private int garageId;

    public Car() {
    }

    public Car(String model, String number, int garage_id) {
        this.model = model;
        this.number = number;
        this.garageId = garage_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getGarageId() {
        return garageId;
    }

    public void setGarageId(int garageId) {
        this.garageId = garageId;
    }

    @Override
    public String toString() {
        return "Car: id " + garageId + ", model/number: " + model + "/" + number + ".";
    }

}
