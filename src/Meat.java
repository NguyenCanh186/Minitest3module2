import java.time.LocalDate;
import java.util.Date;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, double cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * getWeight();
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate a = getManufacturingDate().plusDays(7);
        return a;
    }

    @Override
    public double getRealMoney() {
        double money = 0;
        if(getExpiryDate() == LocalDate.now().plusDays(5))
            money += getCost() - 30/100*getCost();
         else if (getExpiryDate() == LocalDate.now().plusDays(7))
            money += getCost() - 10/100*getCost();
         return money;
    }

    @Override
    public String toString() {
        return super.toString() + ", có giá là: "
                + getRealMoney() + " khối lượng là: "
                + getWeight() + " ngày sản xuất là: "
                + getManufacturingDate() + " ngày hết hạn là: "
                + getExpiryDate() + "\n";
    }
}
