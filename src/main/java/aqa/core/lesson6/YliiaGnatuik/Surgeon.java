package aqa.core.lesson6.YliiaGnatuik;

import java.util.Objects;

public class Surgeon extends Doctor {

    private String scalpel;
    private String threads;

    public Surgeon(String userName, String firstName, String lastName, Integer age, String phoneNumber, String scalpel, String threads) {
        super(userName, firstName, lastName, age, phoneNumber);
        this.scalpel = scalpel;
        this.threads = threads;
    }

    public Surgeon(String userName, String firstName, String lastName, Integer age, String phoneNumber) {
        super(userName, firstName, lastName, age, phoneNumber);
        this.scalpel = "None";
        this.threads = "None";
    }

    @Override
    public Specification getSpecification() {
        return Specification.surgeon;
    }

    @Override
    protected boolean isHomeDoctor() {
        return false;
    }

    @Override
    public String patientExamination() {
        //Surgeon review
        return super.patientExamination();
    }

    public String getScalpel() {
        return scalpel;
    }

    public void setScalpel(String scalpel) {
        this.scalpel = scalpel;
    }

    public String getThreads() {
        return threads;
    }

    public void setThreads(String threads) {
        this.threads = threads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Surgeon surgeon = (Surgeon) o;
        return Objects.equals(getScalpel(), surgeon.getScalpel()) && Objects.equals(getThreads(), surgeon.getThreads());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getScalpel(), getThreads());
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "scalpel='" + scalpel + '\'' +
                ", threads='" + threads + '\'' +
                '}';
    }
}
