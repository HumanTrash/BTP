package art.str.btp.ms.spring.db;

import art.str.btp.ms.spring.model.neo.NearEarthObject;
import art.str.btp.ms.spring.model.neo.data.EstimatedDiameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NearEarthObjectRepository extends JpaRepository<NearEarthObject, Long> {
    Optional<NearEarthObject> findByName(String name);
    Optional<NearEarthObject> findById(Long id);
    List<NearEarthObject> findByEstimatedDiameterGreaterThan(EstimatedDiameter estimatedDiameter);
    List<NearEarthObject> findAll();
}
