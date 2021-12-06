package Task3;

public class Rating {
    private int rating;

    //Constructors
    public Rating(final int rating){
        this.rating = rating;
    }
    public Rating(){
    }

    //Getter
    public int getRating() {
        return rating;
    }

    //Setter
    public void setRating(final int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "" + getRating();
    }
}
