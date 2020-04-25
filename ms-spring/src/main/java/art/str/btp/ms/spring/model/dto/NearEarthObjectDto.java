package art.str.btp.ms.spring.model.dto;

import art.str.btp.ms.spring.model.dto.measurements.CloseApproachDataDto;
import art.str.btp.ms.spring.model.dto.measurements.OrbitalDataDto;
import art.str.btp.ms.spring.model.dto.misc.LinksDto;
import art.str.btp.ms.spring.model.common.NEOEstimatedDiameter;

import java.util.List;

public class NearEarthObjectDto {
    private Boolean is_potentially_hazardous_asteroid;
    private LinksDto linksDto;
    private Boolean is_sentry_object;
    // The reference ID of the Asteroid - This correlates to the SPK ID for the JPL NEO data,
    private String neo_reference_id;
    private String name;
    private String name_limited;
    private String desgination;
    // A Link to the NASA JPL Small-Body Database website
    private String nasa_jpl_url;
    private Double absolute_magnitude_h;
    private NEOEstimatedDiameter estimated_diameter;
    private List<CloseApproachDataDto> close_approach_data;
    private String sentry_data;
    private OrbitalDataDto orbital_data;

    public Boolean getIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(Boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public LinksDto getLinksDto() {
        return linksDto;
    }

    public void setLinksDto(LinksDto linksDto) {
        this.linksDto = linksDto;
    }

    public Boolean getIs_sentry_object() {
        return is_sentry_object;
    }

    public void setIs_sentry_object(Boolean is_sentry_object) {
        this.is_sentry_object = is_sentry_object;
    }

    public String getNeo_reference_id() {
        return neo_reference_id;
    }

    public void setNeo_reference_id(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_limited() {
        return name_limited;
    }

    public void setName_limited(String name_limited) {
        this.name_limited = name_limited;
    }

    public String getDesgination() {
        return desgination;
    }

    public void setDesgination(String desgination) {
        this.desgination = desgination;
    }

    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }

    public void setNasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }

    public Double getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public void setAbsolute_magnitude_h(Double absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    public NEOEstimatedDiameter getEstimated_diameter() {
        return estimated_diameter;
    }

    public void setEstimated_diameter(NEOEstimatedDiameter estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }

    public List<CloseApproachDataDto> getClose_approach_data() {
        return close_approach_data;
    }

    public void setClose_approach_data(List<CloseApproachDataDto> close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    public String getSentry_data() {
        return sentry_data;
    }

    public void setSentry_data(String sentry_data) {
        this.sentry_data = sentry_data;
    }

    public OrbitalDataDto getOrbital_data() {
        return orbital_data;
    }

    public void setOrbital_data(OrbitalDataDto orbital_data) {
        this.orbital_data = orbital_data;
    }
}
