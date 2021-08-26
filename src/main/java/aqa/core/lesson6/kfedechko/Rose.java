package aqa.core.lesson6.kfedechko;

public class Rose extends Flower {

    @Override
    public boolean isBlooming() {
        return getAgeDays() > 30 && getAgeDays() < 40;
    }

    public boolean isRed() {
        return "red".equalsIgnoreCase(getColor());
    }

}
