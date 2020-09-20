package app.sharma.doctorclientapp;

public class DoctorWaiting {
    private String name, waiting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWaiting() {
        return waiting;
    }

    public void setWaiting(String waiting) {
        this.waiting = waiting;
    }

    public DoctorWaiting() {
    }

    public DoctorWaiting(String name, String waiting) {
        this.name = name;
        this.waiting = waiting;
    }
}
