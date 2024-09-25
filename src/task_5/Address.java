package task_5;

public final class Address implements Cloneable {
    private final String region;
    private final String street;

    public Address(String region, String street) {
        this.region = region;
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
