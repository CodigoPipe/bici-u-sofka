package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {

    private String idTicket = "T-" + nextIdTicket;

    private static int nextIdTicket;

    private Boolean withHelmet = true;

    private String status = "Active";

    private LocalDateTime startHour;

    private LocalDateTime endHour;

    private LocalDate date;
    private String idUserTicket;

    private int mustPay = setHowMuchPaid();

    private Boolean isGood = true;



    public Ticket(String userTicket) {

        this.idUserTicket = idUserTicket;
    }

    //getters and setters
    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
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

    public void setWithHelmet() {
        this.withHelmet = false;
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

    public void setGood() {
        isGood = false;
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

    public int setHowMuchPaid(){
        if(this.withHelmet == false){
            this.mustPay += 5;
        }
        /*if(isGood == false){
            this.mustPay += 5;
        }*/
        return this.mustPay;
    }


}
