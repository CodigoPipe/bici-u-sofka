package entities;


public class Bicycle {

    private String code;

    private String type;

    private String color;

    private Boolean isAvailable;

    public Bicycle(String code, String type, String color, Boolean isAvailable) {
        this.code = code;
        this.type = type;
        this.color = color;
        this.isAvailable = isAvailable;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
