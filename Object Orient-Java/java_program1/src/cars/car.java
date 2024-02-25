package cars;

public class car {
    private String plateNo;
    private double km;
    private boolean rented;

    @Override
    public String toString() {
        return
                "plateNo='" + plateNo + '\'' +
                ", km=" + km ;

    }

    //Constructor

    public car(){
        //constructor overloading
        //setPlateNo("N/A");
        //setKm(0);
        //setRented(false);
        this(":N/A", 0); //instead of the above, this changes with the code
    }
    public car(String plateNo, double km){
        setPlateNo(plateNo);
        setKm(km);


    }
    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        if (km > 0 && km > this.km) {
            this.km = km;
        }
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
