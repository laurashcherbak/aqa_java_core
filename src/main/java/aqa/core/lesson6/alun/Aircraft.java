package aqa.core.lesson6.alun;

public class Aircraft {
    int Wings; int WheelPairs; int CockPit;

    public Aircraft () {
        this.Wings = 2;
        this.WheelPairs = 3;
        this.CockPit = 1;
    }

    public Aircraft (int Wings, int WheelPairs, int CockPit) {
        this.Wings = Wings;
        this.WheelPairs = WheelPairs;
        this.CockPit = CockPit;
    }

        public Integer getCountOfWings() {
        return this.getCountOfWings();
    }

    public Integer getCountOfWheelPairs() {
        return this.getCountOfWheelPairs();
    }

    @Override
    public int hashCode() {
        int res = (int) 1 * Wings;
        return res;
    }

    @Override
    public String toString() {
        return "How mush wings needed to fly? " +this.Wings;
    }

    @Override
    public  boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass())
            return false;
        Aircraft Aircraft = (Aircraft) a;
        if (WheelPairs != Aircraft.WheelPairs) return false;
        return true;
    }
}
