package shop;

public class User {

    private String name; // 고객명

    private Paytype payType;

    public User(String name, Paytype payType) {
        this.name = name;
        this.payType = payType;

    }

    public String getName() {
        return name;
    }

    public Paytype getPayType() {
        return payType;
    }
}
