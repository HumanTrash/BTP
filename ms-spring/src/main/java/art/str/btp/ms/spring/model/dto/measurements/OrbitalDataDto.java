package art.str.btp.ms.spring.model.dto.measurements;

public class OrbitalDataDto {
    private String orbit_id;
    private String orbit_determination_date;
    private String first_observation_date;
    private String last_observation_date;
    private Integer data_arc_in_days;
    private Integer observations_used;
    private String orbit_uncertainty;
    private String minimum_orbit_intersection;
    private String jupiter_tisserand_invariant;
    private String epoch_osculation;
    private String eccentricity;
    private String semi_major_axis;
    private String inclination;
    private String ascending_node_longitude;
    private String orbital_period;
    private String perihelion_distance;
    private String perihelion_argument;
    private String aphelion_distance;
    private String perihelion_time;
    private String mean_anomaly;
    private String mean_motion;
    private String equinox;
    private OrbitClassDto orbit_class;
    private Boolean is_sentry_object;

    public String getOrbit_id() {
        return orbit_id;
    }

    public void setOrbit_id(String orbit_id) {
        this.orbit_id = orbit_id;
    }

    public String getOrbit_determination_date() {
        return orbit_determination_date;
    }

    public void setOrbit_determination_date(String orbit_determination_date) {
        this.orbit_determination_date = orbit_determination_date;
    }

    public String getFirst_observation_date() {
        return first_observation_date;
    }

    public void setFirst_observation_date(String first_observation_date) {
        this.first_observation_date = first_observation_date;
    }

    public String getLast_observation_date() {
        return last_observation_date;
    }

    public void setLast_observation_date(String last_observation_date) {
        this.last_observation_date = last_observation_date;
    }

    public Integer getData_arc_in_days() {
        return data_arc_in_days;
    }

    public void setData_arc_in_days(Integer data_arc_in_days) {
        this.data_arc_in_days = data_arc_in_days;
    }

    public Integer getObservations_used() {
        return observations_used;
    }

    public void setObservations_used(Integer observations_used) {
        this.observations_used = observations_used;
    }

    public String getOrbit_uncertainty() {
        return orbit_uncertainty;
    }

    public void setOrbit_uncertainty(String orbit_uncertainty) {
        this.orbit_uncertainty = orbit_uncertainty;
    }

    public String getMinimum_orbit_intersection() {
        return minimum_orbit_intersection;
    }

    public void setMinimum_orbit_intersection(String minimum_orbit_intersection) {
        this.minimum_orbit_intersection = minimum_orbit_intersection;
    }

    public String getJupiter_tisserand_invariant() {
        return jupiter_tisserand_invariant;
    }

    public void setJupiter_tisserand_invariant(String jupiter_tisserand_invariant) {
        this.jupiter_tisserand_invariant = jupiter_tisserand_invariant;
    }

    public String getEpoch_osculation() {
        return epoch_osculation;
    }

    public void setEpoch_osculation(String epoch_osculation) {
        this.epoch_osculation = epoch_osculation;
    }

    public String getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    public String getSemi_major_axis() {
        return semi_major_axis;
    }

    public void setSemi_major_axis(String semi_major_axis) {
        this.semi_major_axis = semi_major_axis;
    }

    public String getInclination() {
        return inclination;
    }

    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    public String getAscending_node_longitude() {
        return ascending_node_longitude;
    }

    public void setAscending_node_longitude(String ascending_node_longitude) {
        this.ascending_node_longitude = ascending_node_longitude;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getPerihelion_distance() {
        return perihelion_distance;
    }

    public void setPerihelion_distance(String perihelion_distance) {
        this.perihelion_distance = perihelion_distance;
    }

    public String getPerihelion_argument() {
        return perihelion_argument;
    }

    public void setPerihelion_argument(String perihelion_argument) {
        this.perihelion_argument = perihelion_argument;
    }

    public String getAphelion_distance() {
        return aphelion_distance;
    }

    public void setAphelion_distance(String aphelion_distance) {
        this.aphelion_distance = aphelion_distance;
    }

    public String getPerihelion_time() {
        return perihelion_time;
    }

    public void setPerihelion_time(String perihelion_time) {
        this.perihelion_time = perihelion_time;
    }

    public String getMean_anomaly() {
        return mean_anomaly;
    }

    public void setMean_anomaly(String mean_anomaly) {
        this.mean_anomaly = mean_anomaly;
    }

    public String getMean_motion() {
        return mean_motion;
    }

    public void setMean_motion(String mean_motion) {
        this.mean_motion = mean_motion;
    }

    public String getEquinox() {
        return equinox;
    }

    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }

    public OrbitClassDto getOrbit_class() {
        return orbit_class;
    }

    public void setOrbit_class(OrbitClassDto orbit_class) {
        this.orbit_class = orbit_class;
    }

    public Boolean getIs_sentry_object() {
        return is_sentry_object;
    }

    public void setIs_sentry_object(Boolean is_sentry_object) {
        this.is_sentry_object = is_sentry_object;
    }
}
