package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {

    private int idTicket = nextIdTicket;

    private static int nextIdTicket;

    private Boolean withHelmet = true;

    private String status = "Active";

    private LocalDateTime startHour;

    private LocalDateTime endHour;

    private LocalDate date;
    private String idUserTicket;

    private int mustPay = 0;

    private Boolean isGood = true;

    public Ticket(String userTicket) {

        this.idUserTicket = idUserTicket;
    }

    //getters and setters
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

    public String getIdUserTicket() {
        return idUserTicket;
    }

    public void setIdUserTicket(String idUserTicket) {
        this.idUserTicket = idUserTicket;
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

    public LocalDateTime getStartHour() {
        return startHour;
    }

    public void setStartHour() {
        this.startHour = LocalDateTime.now();
    }

    public LocalDateTime getEndHour() {
        return endHour;
    }

    public void setEndHour() {
        this.endHour = LocalDateTime.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate() {
        this.date = LocalDate.now();
    }
}
