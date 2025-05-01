package Kiosk.Challengelevel2;

public enum user
{
    personOfnatioNalmerit(0.1),
    soldier(0.05),
    student(0.03),
    common(0.00);

    private double discountrate;

    private user(double discountrate) {
        this.discountrate = discountrate;
    }

    public double getDiscountrate() {
        return discountrate;
    }
}
