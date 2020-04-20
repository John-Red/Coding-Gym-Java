package model;

public class JobHistory {
    private int duration; // то как долго он работал в компании
    private String position;
    private String employer; // название компании (работодатель)

    public JobHistory(int duration, String position, String employer) {
        this.duration = duration;
        this.position = position;
        this.employer = employer;
    }

    public int getDuration() {
        return duration;
    }

    public String getPosition() {
        return position;
    }

    public String getEmployer() {
        return employer;
    }

    public String toString() {
        return this.employer;
    }
}
