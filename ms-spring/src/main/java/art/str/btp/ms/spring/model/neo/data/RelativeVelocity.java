package art.str.btp.ms.spring.model.neo.data;

public class RelativeVelocity {
    private Double kmPerSecond;
    private Double kmPerHour;
    private Double milesPerHour;

    public Double getKmPerSecond() {
        return kmPerSecond;
    }

    public void setKmPerSecond(Double kmPerSecond) {
        this.kmPerSecond = kmPerSecond;
    }

    public Double getKmPerHour() {
        return kmPerHour;
    }

    public void setKmPerHour(Double kmPerHour) {
        this.kmPerHour = kmPerHour;
    }

    public Double getMilesPerHour() {
        return milesPerHour;
    }

    public void setMilesPerHour(Double milesPerHour) {
        this.milesPerHour = milesPerHour;
    }
}