package java8.autoQA.A2;

public class Film {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    private double prise;

    public Film(String title, double prise) {
        this.title = title;
        this.prise = prise;
    }
}
