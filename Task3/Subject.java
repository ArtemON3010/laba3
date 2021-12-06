package Task3;

public class Subject {

    private String name;
    private int amount_per_week;

    //Constructors
    public Subject(final String name, final int amount_per_week){
        this.name = name;
        this.amount_per_week = amount_per_week;
    }

    public Subject(final String name){
        this.name = name;
    }

    //Getter

    public String getName() {
        return name;
    }

    public int getAmount_per_week() {
        return amount_per_week;
    }

    //Setter

    public void setName(final String name) {
        this.name = name;
    }

    public void setAmount_per_week(final int amount_per_week) {
        this.amount_per_week = amount_per_week;
    }

    @Override
    public String toString() {
        return "" + getName();
    }
}
