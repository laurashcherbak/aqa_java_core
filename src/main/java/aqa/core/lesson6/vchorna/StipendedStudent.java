package aqa.core.lesson6.vchorna;

class StipendedStudent extends Student {
    private final Float stipend;

    public StipendedStudent(String firstName, String middleName, String lastName, Integer course, Float stipend) {
        super(firstName, middleName, lastName, course);
        this.stipend = stipend;
    }

    public Float getStipend() {
        return stipend;
    }

    @Override
    public String toString() {
        return super.toString() + ", stipend: " + stipend;
    }
}
