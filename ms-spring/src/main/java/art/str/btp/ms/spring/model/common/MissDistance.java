package art.str.btp.ms.spring.model.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class MissDistance implements Serializable {
    private static final long serialVersionUID = -4450514428980127634L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double astronomical;
    private Double lunar;
    private Double kilometers;
    private Double miles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAstronomical() {
        return astronomical;
    }

    public void setAstronomical(Double astronomical) {
        this.astronomical = astronomical;
    }

    public Double getLunar() {
        return lunar;
    }

    public void setLunar(Double lunar) {
        this.lunar = lunar;
    }

    public Double getKilometers() {
        return kilometers;
    }

    public void setKilometers(Double kilometers) {
        this.kilometers = kilometers;
    }

    public Double getMiles() {
        return miles;
    }

    public void setMiles(Double miles) {
        this.miles = miles;
    }
}
