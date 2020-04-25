package art.str.btp.ms.spring.model.neo.data;

import art.str.btp.ms.spring.model.common.MissDistance;
import org.joda.time.DateTime;

public class CloseApproachData {
    private DateTime closeApproachDate;
    private RelativeVelocity relativeVelocity;
    private MissDistance missDistance;
    private String orbitingBody;

    public DateTime getCloseApproachDate() {
        return closeApproachDate;
    }

    public void setCloseApproachDate(DateTime closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }

    public RelativeVelocity getRelativeVelocity() {
        return relativeVelocity;
    }

    public void setRelativeVelocity(RelativeVelocity relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    public MissDistance getMissDistance() {
        return missDistance;
    }

    public void setMissDistance(MissDistance missDistance) {
        this.missDistance = missDistance;
    }

    public String getOrbitingBody() {
        return orbitingBody;
    }

    public void setOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
    }
}
