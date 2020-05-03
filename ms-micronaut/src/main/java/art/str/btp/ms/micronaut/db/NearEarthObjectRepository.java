package art.str.btp.ms.micronaut.db;

import art.str.btp.ms.micronaut.model.neo.NearEarthObject;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NearEarthObjectRepository extends CrudRepository<NearEarthObject, Long> {
    Optional<NearEarthObject> findByName(String name);
    Optional<NearEarthObject> findById(Long id);
    List<NearEarthObject> findAll();
}
