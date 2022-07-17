package entities;

import java.time.LocalDateTime;

public class Ticket {

    private int idTicket;

    private static int nextIdTicket;

    private Boolean withHelmet = true;

    private String status;

    private User userTicket;

    private int mustPay;

    private Boolean isGood = true;

    public Ticket(int idTicket, Boolean withHelmet, String status, User userTicket, int mustPay, Boolean isGood) {
        this.idTicket = idTicket;
        this.withHelmet = withHelmet;
        this.status = status;
        this.userTicket = userTicket;
        this.mustPay = mustPay;
        this.isGood = isGood;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public static int getNextIdTicket() {
        return nextIdTicket;
    }

    public static void setNextIdTicket(int nextIdTicket) {
        Ticket.nextIdTicket = nextIdTicket;
    }

    public Boolean getWithHelmet() {
        return withHelmet;
    }

    public void setWithHelmet(Boolean withHelmet) {
        this.withHelmet = withHelmet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUserTicket() {
        return userTicket;
    }

    public void setUserTicket(User userTicket) {
        this.userTicket = userTicket;
    }

    public int getMustPay() {
        return mustPay;
    }

    public void setMustPay(int mustPay) {
        this.mustPay = mustPay;
    }

    public Boolean getGood() {
        return isGood;
    }

    public void setGood(Boolean good) {
        isGood = good;
    }
}
