package art.str.btp.ms.micronaut.model.common;

public class RelativeVelocityDto {
    private Double kilometers_per_second;
    private Double kilometers_per_hour;
    private Double miles_per_hour;

    public Double getKilometers_per_second() {
        return kilometers_per_second;
    }

    public void setKilometers_per_second(Double kilometers_per_second) {
        this.kilometers_per_second = kilometers_per_second;
    }

    public Double getKilometers_per_hour() {
        return kilometers_per_hour;
    }

    public void setKilometers_per_hour(Double kilometers_per_hour) {
        this.kilometers_per_hour = kilometers_per_hour;
    }

    public Double getMiles_per_hour() {
        return miles_per_hour;
    }

    public void setMiles_per_hour(Double miles_per_hour) {
        this.miles_per_hour = miles_per_hour;
    }
}