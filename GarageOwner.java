package swassig;

public class GarageOwner {
    private String name;
    private String phone;
    static GarageOwner singleton = new GarageOwner();

    private GarageOwner() {

    }

    static GarageOwner getSingleton() {

        return singleton;
    }

    void setName(String N){
        this.name=N;
    }
    void setPhone(String P){
        this.phone=P;
    }
    public String get_name() {
        return name;
    }

    public String get_phone() {
        return phone;
    }
}
