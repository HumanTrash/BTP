package art.str.btp.ms.micronaut.model.dto.measurements;

import art.str.btp.ms.micronaut.model.common.MissDistance;
import art.str.btp.ms.micronaut.model.common.RelativeVelocityDto;

public class CloseApproachDataDto {
    private String close_approach_date_full;
    private String close_approach_date;
    private Long epoch_date_close_approach;
    private RelativeVelocityDto relative_velocity;
    private MissDistance miss_distance;
    private String orbiting_body;

    public String getClose_approach_date_full() {
        return close_approach_date_full;
    }

    public void setClose_approach_date_full(String close_approach_date_full) {
        this.close_approach_date_full = close_approach_date_full;
    }

    public String getClose_approach_date() {
        return close_approach_date;
    }

    public void setClose_approach_date(String close_approach_date) {
        this.close_approach_date = close_approach_date;
    }

    public Long getEpoch_date_close_approach() {
        return epoch_date_close_approach;
    }

    public void setEpoch_date_close_approach(Long epoch_date_close_approach) {
        this.epoch_date_close_approach = epoch_date_close_approach;
    }

    public RelativeVelocityDto getRelative_velocity() {
        return relative_velocity;
    }

    public void setRelative_velocity(RelativeVelocityDto relative_velocity) {
        this.relative_velocity = relative_velocity;
    }

    public MissDistance getMiss_distance() {
        return miss_distance;
    }

    public void setMiss_distance(MissDistance miss_distance) {
        this.miss_distance = miss_distance;
    }

    public String getOrbiting_body() {
        return orbiting_body;
    }

    public void setOrbiting_body(String orbiting_body) {
        this.orbiting_body = orbiting_body;
    }
}
