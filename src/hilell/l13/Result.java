package hilell.l13;

public enum Result {

    POSITIVE(1), NEGATIVE(-1), ZERO(0);  // Result POSITIVE = new Result(1);

     private int value;
     private int value2;

    Result() {
    }

    Result(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
 /*
        Зробити клас User (імя, прізвище, вік, стать, місто(4 міста), хоббі(одне з трьох на вибір)


         */