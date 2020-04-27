package art.str.btp.ms.spring.model.neo.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EstimatedDiameter implements Serializable {
    private static final long serialVersionUID = -9035898001295450905L;

    @Id
    @SequenceGenerator(name = "estimatedDiameterGen")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estimatedDiameterGen")
    private Long id;

    private Double min;
    private Double max;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }
}
