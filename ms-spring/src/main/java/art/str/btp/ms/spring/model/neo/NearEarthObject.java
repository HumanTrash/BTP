package art.str.btp.ms.spring.model.neo;

import art.str.btp.ms.spring.model.neo.data.CloseApproachData;
import art.str.btp.ms.spring.model.neo.data.EstimatedDiameter;
import art.str.btp.ms.spring.model.neo.data.OrbitalData;

import java.util.List;

public class NearEarthObject {
    private Boolean isPotentiallyDangerous;
    private Boolean isSentryObject;
    private String sentryData;
    private String name;
    private Double magnitude;
    private Integer referenceId;
    private EstimatedDiameter estimatedDiameter;
    private OrbitalData orbitalData;
    private List<CloseApproachData> closeApproachData;

    public List<CloseApproachData> getCloseApproachData() {
        return closeApproachData;
    }

    public void setCloseApproachData(List<CloseApproachData> closeApproachData) {
        this.closeApproachData = closeApproachData;
    }

    public Boolean getIsPotentiallyDangerous() {
        return isPotentiallyDangerous;
    }

    public void setIsPotentiallyDangerous(Boolean isPotentiallyDangerous) {
        this.isPotentiallyDangerous = isPotentiallyDangerous;
    }

    public Boolean getIsSentryObject() {
        return isSentryObject;
    }

    public void setIsSentryObject(Boolean isSentryObject) {
        this.isSentryObject = isSentryObject;
    }

    public String getSentryData() {
        return sentryData;
    }

    public void setSentryData(String sentryData) {
        this.sentryData = sentryData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.magnitude = magnitude;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public EstimatedDiameter getEstimatedDiameter() {
        return estimatedDiameter;
    }

    public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    public OrbitalData getOrbitalData() {
        return orbitalData;
    }

    public void setOrbitalData(OrbitalData orbitalData) {
        this.orbitalData = orbitalData;
    }
}
