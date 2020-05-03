package art.str.btp.ms.micronaut.model.neo;


import art.str.btp.ms.micronaut.model.neo.data.CloseApproachData;
import art.str.btp.ms.micronaut.model.neo.data.EstimatedDiameter;
import art.str.btp.ms.micronaut.model.neo.data.OrbitalData;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "neo")
public class NearEarthObject implements Serializable {
    private static final long serialVersionUID = 1228935553335492296L;

    @Id
    private Long id;

    private Boolean isPotentiallyDangerous;
    private Boolean isSentryObject;
    private String sentryData;
    private String name;
    private Double magnitude;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "estimatedDiameter_id")
    private EstimatedDiameter estimatedDiameter;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "oribtalData_id")
    private OrbitalData orbitalData;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "neo_id")
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

    public Long getId() {
        return id;
    }

    public void setId(Long referenceId) {
        this.id = referenceId;
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
