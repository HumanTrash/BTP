package art.str.btp.ms.spring.model.neo.data;

import java.util.Date;

public class OrbitalData {
    private Integer orbitId;
    private Date orbitDeterminationDate;
    private Date firstObservationDate;
    private Date lastObservationDate;
    private Integer dataArcDays;
    private Integer observationsUsed;
    private Integer orbitUncertainty;
    private Double minimumOrbitIntersection;
    private Double jupiterTisserandInvariation;
    private Double epochOsculation;
    private Double eccentricity;
    private Double semiMajorAxis;
    private Double inclination;
    private Double ascNodeLongitude;
    private Double orbitalPeriod;
    private Double perihelionDistance;
    private Double perihelionArgument;
    private Double aphelionDistance;
    private Double perihilionTime;
    private Double meanAnomaly;
    private Double meanMotion;
    private String equinox;
    private Boolean isSentryObj;
    private NEOOrbit orbitType;

    public Integer getOrbitId() {
        return orbitId;
    }

    public void setOrbitId(Integer orbitId) {
        this.orbitId = orbitId;
    }

    public Date getOrbitDeterminationDate() {
        return orbitDeterminationDate;
    }

    public void setOrbitDeterminationDate(Date orbitDeterminationDate) {
        this.orbitDeterminationDate = orbitDeterminationDate;
    }

    public Date getFirstObservationDate() {
        return firstObservationDate;
    }

    public void setFirstObservationDate(Date firstObservationDate) {
        this.firstObservationDate = firstObservationDate;
    }

    public Date getLastObservationDate() {
        return lastObservationDate;
    }

    public void setLastObservationDate(Date lastObservationDate) {
        this.lastObservationDate = lastObservationDate;
    }

    public Integer getDataArcDays() {
        return dataArcDays;
    }

    public void setDataArcDays(Integer dataArcDays) {
        this.dataArcDays = dataArcDays;
    }

    public Integer getObservationsUsed() {
        return observationsUsed;
    }

    public void setObservationsUsed(Integer observationsUsed) {
        this.observationsUsed = observationsUsed;
    }

    public Integer getOrbitUncertainty() {
        return orbitUncertainty;
    }

    public void setOrbitUncertainty(Integer orbitUncertainty) {
        this.orbitUncertainty = orbitUncertainty;
    }

    public Double getMinimumOrbitIntersection() {
        return minimumOrbitIntersection;
    }

    public void setMinimumOrbitIntersection(Double minimumOrbitIntersection) {
        this.minimumOrbitIntersection = minimumOrbitIntersection;
    }

    public Double getJupiterTisserandInvariation() {
        return jupiterTisserandInvariation;
    }

    public void setJupiterTisserandInvariation(Double jupiterTisserandInvariation) {
        this.jupiterTisserandInvariation = jupiterTisserandInvariation;
    }

    public Double getEpochOsculation() {
        return epochOsculation;
    }

    public void setEpochOsculation(Double epochOsculation) {
        this.epochOsculation = epochOsculation;
    }

    public Double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(Double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public Double getInclination() {
        return inclination;
    }

    public void setInclination(Double inclination) {
        this.inclination = inclination;
    }

    public Double getAscNodeLongitude() {
        return ascNodeLongitude;
    }

    public void setAscNodeLongitude(Double ascNodeLongitude) {
        this.ascNodeLongitude = ascNodeLongitude;
    }

    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(Double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Double getPerihelionDistance() {
        return perihelionDistance;
    }

    public void setPerihelionDistance(Double perihelionDistance) {
        this.perihelionDistance = perihelionDistance;
    }

    public Double getPerihelionArgument() {
        return perihelionArgument;
    }

    public void setPerihelionArgument(Double perihelionArgument) {
        this.perihelionArgument = perihelionArgument;
    }

    public Double getAphelionDistance() {
        return aphelionDistance;
    }

    public void setAphelionDistance(Double aphelionDistance) {
        this.aphelionDistance = aphelionDistance;
    }

    public Double getPerihilionTime() {
        return perihilionTime;
    }

    public void setPerihilionTime(Double perihilionTime) {
        this.perihilionTime = perihilionTime;
    }

    public Double getMeanAnomaly() {
        return meanAnomaly;
    }

    public void setMeanAnomaly(Double meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    public Double getMeanMotion() {
        return meanMotion;
    }

    public void setMeanMotion(Double meanMotion) {
        this.meanMotion = meanMotion;
    }

    public String getEquinox() {
        return equinox;
    }

    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }

    public Boolean getIsSentryObj() {
        return isSentryObj;
    }

    public void setIsSentryObj(Boolean isSentryObj) {
        this.isSentryObj = isSentryObj;
    }

    public NEOOrbit getOrbitType() {
        return orbitType;
    }

    public void setOrbitType(NEOOrbit orbitType) {
        this.orbitType = orbitType;
    }
}
