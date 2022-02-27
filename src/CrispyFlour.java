import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, double cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return getQuantity() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate a = getManufacturingDate().plusYears(1);
        return a;
    }

    @Override
    public double getRealMoney() {
        double money1 = 0;
        if(getExpiryDate() == LocalDate.now().plusMonths(2))
            money1 += getCost() - 40/100*getCost();
        else if (getExpiryDate() == LocalDate.now().plusMonths(4))
            money1 += getCost() - 20/100*getCost();
        else
            money1 += getCost() - 5/100*getCost();
        return money1;
    }

    @Override
    public String toString() {
        return super.toString() + " có giá là: " + getRealMoney() +
                " số lượng là: " + quantity + " ngày sản xuất là: "
                + getManufacturingDate() + " ngày hết hạn là: "
                + getExpiryDate() +"\n";
    }
}
