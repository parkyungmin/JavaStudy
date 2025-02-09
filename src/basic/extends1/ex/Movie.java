package basic.extends1.ex;

public class Movie extends Item{
    private String direcort;
    private String actor;

    public Movie(String name, int price, String direcort, String actor) {
        super(name, price);
        this.direcort = direcort;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독:" + direcort + ", 배우:" + actor);
    }
}
