/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kd
 */
public class Tariff {
    int tariffId;
    String city;
    String medium;
    String startPoint;
    String endPoint;
    double amount;

    public Tariff(int tariffId, String city, String medium, String startPoint, String endPoint, double amount) {
        this.tariffId = tariffId;
        this.city = city;
        this.medium = medium;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.amount = amount;
    }
public Tariff(){
}
    public double getAmount() {
        return amount;
    }

    public String getCity() {
        return city;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public String getMedium() {
        return medium;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public int getTariffId() {
        return tariffId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

}
