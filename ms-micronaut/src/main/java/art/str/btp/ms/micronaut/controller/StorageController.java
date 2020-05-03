package art.str.btp.ms.micronaut.controller;

import art.str.btp.ms.micronaut.db.NearEarthObjectRepository;
import art.str.btp.ms.micronaut.model.dto.api.ApiOperationResultType;
import art.str.btp.ms.micronaut.model.dto.api.ApiResponse;
import art.str.btp.ms.micronaut.model.neo.NearEarthObject;
import io.micronaut.http.annotation.*;
import org.apache.commons.collections4.IterableUtils;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Controller("storage/neo")
public class StorageController {

    private final NearEarthObjectRepository repository;

    @Inject
    public StorageController(NearEarthObjectRepository repository) {
        this.repository = repository;
    }

    @Post("save/all")
    public ApiResponse saveAll(@Body List<NearEarthObject> nearEarthObjects) {
        List<NearEarthObject> repositoryResponse = IterableUtils.toList(repository.saveAll(nearEarthObjects));

        if (repositoryResponse.size() == nearEarthObjects.size()) {
            return new ApiResponse("Successfully inserted data for " + repositoryResponse.size() + " near earth objects", ApiOperationResultType.SUCCESSFUL);
        }
        else {
            return new ApiResponse("Something went wrong, no data was inserted", ApiOperationResultType.FAILED);
        }
    }

    @Post("save")
    public ApiResponse save(@Body NearEarthObject nearEarthObject) {
        NearEarthObject dbResponse = repository.save(nearEarthObject);
        return new ApiResponse("Saved near earth object with ID: " + dbResponse.getId().toString(), ApiOperationResultType.SUCCESSFUL);
    }

    @Patch("update")
    public ApiResponse updateByID(@Body NearEarthObject nearEarthObject) {
        NearEarthObject dbResponse = repository.save(nearEarthObject);
        return new ApiResponse("Updated near earth object with ID: " + dbResponse.getId().toString(), ApiOperationResultType.SUCCESSFUL);
    }

    @Delete("delete/{neoId}")
    public ApiResponse deleteNearEarthObjectById(Long neoId) {
        repository.deleteById(neoId);

        return new ApiResponse("Deleted near earth object with ID: " + neoId.toString(), ApiOperationResultType.SUCCESSFUL);
    }

    @Get("id/{neoId}")
    public NearEarthObject findByID(Long neoId) {
        Optional<NearEarthObject> dbResponse = repository.findById(neoId);
        return dbResponse.orElse(null);
    }

    @Get("name/{neoName}")
    public NearEarthObject findByName(String neoName) {
        Optional<NearEarthObject> dbResponse = repository.findByName(neoName);
        return dbResponse.orElse(null);
    }

    @Get("fetch-all")
    public List<NearEarthObject> findAll() {
        return repository.findAll();
    }
}
