package art.str.btp.ms.micronaut.model.common;


import art.str.btp.ms.micronaut.model.dto.measurements.EstimatedDiameterDto;

public class NEOEstimatedDiameter {
    private EstimatedDiameterDto kilometers;
    private EstimatedDiameterDto meters;
    private EstimatedDiameterDto miles;
    private EstimatedDiameterDto feet;

    public EstimatedDiameterDto getKilometers() {
        return kilometers;
    }

    public void setKilometers(EstimatedDiameterDto kilometers) {
        this.kilometers = kilometers;
    }

    public EstimatedDiameterDto getMeters() {
        return meters;
    }

    public void setMeters(EstimatedDiameterDto meters) {
        this.meters = meters;
    }

    public EstimatedDiameterDto getMiles() {
        return miles;
    }

    public void setMiles(EstimatedDiameterDto miles) {
        this.miles = miles;
    }

    public EstimatedDiameterDto getFeet() {
        return feet;
    }

    public void setFeet(EstimatedDiameterDto feet) {
        this.feet = feet;
    }
}
