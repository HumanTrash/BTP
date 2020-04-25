package art.str.btp.ms.spring.mapping;

import art.str.btp.ms.spring.mapping.exceptions.MappingException;
import art.str.btp.ms.spring.model.dto.NearEarthObjectDto;
import art.str.btp.ms.spring.model.dto.measurements.CloseApproachDataDto;
import art.str.btp.ms.spring.model.dto.measurements.OrbitClassDto;
import art.str.btp.ms.spring.model.dto.measurements.OrbitalDataDto;
import art.str.btp.ms.spring.model.common.NEOEstimatedDiameter;
import art.str.btp.ms.spring.model.neo.data.CloseApproachData;
import art.str.btp.ms.spring.model.neo.data.EstimatedDiameter;
import art.str.btp.ms.spring.model.neo.data.NEOOrbit;
import art.str.btp.ms.spring.model.neo.NearEarthObject;
import art.str.btp.ms.spring.model.neo.data.OrbitalData;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface NEOResponseMapper {

    @Mapping(source = "is_potentially_hazardous_asteroid", target = "isPotentiallyDangerous")
    @Mapping(source = "is_sentry_object", target = "isSentryObject")
    @Mapping(source = "sentry_data", target = "sentryData")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "neo_reference_id", target = "referenceId")
    @Mapping(source = "absolute_magnitude_h", target = "magnitude")
    @Mapping(source = "estimated_diameter", target = "estimatedDiameter", qualifiedByName = "mapEstimatedDiameter")
    @Mapping(source = "close_approach_data", target = "closeApproachData", qualifiedByName = "mapCloseApproachList")
    @Mapping(source = "orbital_data", target = "orbitalData", qualifiedByName = "mapOrbitalData")
    NearEarthObject mapResponse(NearEarthObjectDto resp);

    List<NearEarthObject> mapResponseList(List<NearEarthObjectDto> nearEarthObjectDtoList);

    @Named("mapEstimatedDiameter")
    @Mapping(source = "meters.estimated_diameter_min", target = "min")
    @Mapping(source = "meters.estimated_diameter_max", target = "max")
    EstimatedDiameter mapToEstimatedDiameterAsMeters(NEOEstimatedDiameter estimatedDiameter);

    @Mapping(source = "close_approach_date_full", target = "closeApproachDate", qualifiedByName = "mapDateTime")
    @Mapping(source = "orbiting_body", target = "orbitingBody")
    @Mapping(source = "miss_distance", target = "missDistance")
    @Mapping(source = "relative_velocity.kilometers_per_second", target = "relativeVelocity.kmPerSecond")
    @Mapping(source = "relative_velocity.kilometers_per_hour", target = "relativeVelocity.kmPerHour")
    @Mapping(source = "relative_velocity.miles_per_hour", target = "relativeVelocity.milesPerHour")
    CloseApproachData mapCloseApproachData(CloseApproachDataDto closeApproachDataDto);

    @Named("mapCloseApproachList")
    List<CloseApproachData> mapCloseApproachDataList(List<CloseApproachDataDto> closeApproachDataDtoList);

    @Named("mapOrbitalData")
    @Mapping(source = "orbit_id", target = "orbitId")
    @Mapping(source = "orbit_determination_date", target = "orbitDeterminationDate", qualifiedByName = "mapDate")
    @Mapping(source = "first_observation_date", target = "firstObservationDate", qualifiedByName = "mapDate")
    @Mapping(source = "last_observation_date", target = "lastObservationDate", qualifiedByName = "mapDate")
    @Mapping(source = "data_arc_in_days", target = "dataArcDays")
    @Mapping(source = "observations_used", target = "observationsUsed")
    @Mapping(source = "orbit_uncertainty", target = "orbitUncertainty")
    @Mapping(source = "minimum_orbit_intersection", target = "minimumOrbitIntersection")
    @Mapping(source = "jupiter_tisserand_invariant", target = "jupiterTisserandInvariation")
    @Mapping(source = "epoch_osculation", target = "epochOsculation")
    @Mapping(source = "eccentricity", target = "eccentricity")
    @Mapping(source = "semi_major_axis", target = "semiMajorAxis")
    @Mapping(source = "inclination", target = "inclination")
    @Mapping(source = "ascending_node_longitude", target = "ascNodeLongitude")
    @Mapping(source = "orbital_period", target = "orbitalPeriod")
    @Mapping(source = "perihelion_distance", target = "perihelionDistance")
    @Mapping(source = "perihelion_argument", target = "perihelionArgument")
    @Mapping(source = "aphelion_distance", target = "aphelionDistance")
    @Mapping(source = "perihelion_time", target = "perihilionTime")
    @Mapping(source = "mean_anomaly", target = "meanAnomaly")
    @Mapping(source = "mean_motion", target = "meanMotion")
    @Mapping(source = "equinox", target = "equinox")
    @Mapping(source = "is_sentry_object", target = "isSentryObj")
    @Mapping(source = "orbit_class", target = "orbitType", qualifiedByName = "mapOrbitType")
    OrbitalData mapOrbitalData(OrbitalDataDto orbitalDataDto);

    @Named("mapOrbitType")
    default NEOOrbit mapOrbitType(OrbitClassDto orbitClassDto) {
        if (orbitClassDto == null || orbitClassDto.getOrbit_class_type() == null) {
            return null;
        }
        switch (orbitClassDto.getOrbit_class_type()) {
            case "APO":
                return NEOOrbit.APO;
            case "AMO":
                return NEOOrbit.AMO;
            case "IEO":
                return NEOOrbit.IEO;
            case "ATE":
                return NEOOrbit.ATE;
            default:
                throw new MappingException("Failed to map OrbitClassDto to NEOOrbit, unexpected input: " + orbitClassDto.getOrbit_class_type());
        }
    }

    @Named("mapDateTime")
    default DateTime mapDateTime(String dateTime) {
        if (dateTime == null) {
            return null;
        }
        return DateTime.parse(dateTime.toLowerCase(), DateTimeFormat.forPattern("yyyy-MMM-dd HH:mm").withLocale(Locale.ENGLISH));
    }

    @Named("mapDate")
    default Date mapDate(String date) throws ParseException {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd").parse(date);
    }
}
