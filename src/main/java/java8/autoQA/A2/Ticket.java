package java8.autoQA.A2;

public class Ticket {
    String ticketClass;
    int prise;

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public Ticket(String ticketClass, int prise) {
        this.ticketClass = ticketClass;
        this.prise = prise;
    }

    public static int compare (Ticket t1, Ticket t2){
        if (t1.getPrise() > t2.getPrise()) return 1;
        return -2;
    }
}
