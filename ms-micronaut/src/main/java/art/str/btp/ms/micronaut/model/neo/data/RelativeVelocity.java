package art.str.btp.ms.micronaut.model.neo.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RelativeVelocity implements Serializable {
    private static final long serialVersionUID = 7328789765411496027L;

    @Id
    @SequenceGenerator(name = "relativeVelocityGen")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "relativeVelocityGen")
    private Long id;

    private Double kmPerSecond;
    private Double kmPerHour;
    private Double milesPerHour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getKmPerSecond() {
        return kmPerSecond;
    }

    public void setKmPerSecond(Double kmPerSecond) {
        this.kmPerSecond = kmPerSecond;
    }

    public Double getKmPerHour() {
        return kmPerHour;
    }

    public void setKmPerHour(Double kmPerHour) {
        this.kmPerHour = kmPerHour;
    }

    public Double getMilesPerHour() {
        return milesPerHour;
    }

    public void setMilesPerHour(Double milesPerHour) {
        this.milesPerHour = milesPerHour;
    }
}