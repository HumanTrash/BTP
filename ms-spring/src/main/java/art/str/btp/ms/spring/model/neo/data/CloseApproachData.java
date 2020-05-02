package art.str.btp.ms.spring.model.neo.data;

import art.str.btp.ms.spring.model.common.MissDistance;
import art.str.btp.ms.spring.model.neo.NearEarthObject;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CloseApproachData implements Serializable {
    private static final long serialVersionUID = 5471042371624530856L;

    @Id
    @SequenceGenerator(name = "closeApproachGen")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "closeApproachGen")
    private Long id;

    private String orbitingBody;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime closeApproachDate;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "relativeVelocity_id")
    private RelativeVelocity relativeVelocity;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "missDistance_id")
    private MissDistance missDistance;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private NearEarthObject nearEarthObject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public NearEarthObject getNearEarthObject() {
        return nearEarthObject;
    }

    public void setNearEarthObject(NearEarthObject nearEarthObject) {
        this.nearEarthObject = nearEarthObject;
    }
}
