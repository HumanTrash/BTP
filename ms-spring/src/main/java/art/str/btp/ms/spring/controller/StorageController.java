package art.str.btp.ms.spring.controller;

import art.str.btp.ms.spring.db.NearEarthObjectRepository;
import art.str.btp.ms.spring.model.dto.api.ApiOperationResultType;
import art.str.btp.ms.spring.model.dto.api.ApiResponse;
import art.str.btp.ms.spring.model.neo.NearEarthObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("storage/neo")
public class StorageController {

    private final NearEarthObjectRepository repository;

    public StorageController(NearEarthObjectRepository repository) {
        this.repository = repository;
    }

    @PostMapping("save/all")
    public ApiResponse saveAll(@RequestBody List<NearEarthObject> nearEarthObjects) {
        List<NearEarthObject> repositoryResponse = repository.saveAll(nearEarthObjects);

        if (repositoryResponse.size() == nearEarthObjects.size()) {
            return new ApiResponse("Successfully inserted data for " + repositoryResponse.size() + " near earth objects", ApiOperationResultType.SUCCESSFUL);
        }
        else {
            return new ApiResponse("Something went wrong, no data was inserted", ApiOperationResultType.FAILED);
        }
    }

    @PatchMapping("update")
    public ApiResponse updateByID(@RequestBody NearEarthObject nearEarthObject) {
        NearEarthObject dbResponse = repository.save(nearEarthObject);
        return new ApiResponse("Updated near earth object with ID: " + dbResponse.getId().toString(), ApiOperationResultType.SUCCESSFUL);
    }

    @DeleteMapping("delete/{neoId}")
    public ApiResponse deleteNearEarthObjectById(@PathVariable Long neoId) {
         repository.deleteById(neoId);
         return new ApiResponse("Deleted near earth object with ID: " + neoId.toString(), ApiOperationResultType.SUCCESSFUL);
    }

    @GetMapping("id/{neoId}")
    public NearEarthObject findByID(@PathVariable Long neoId) {
        Optional<NearEarthObject> dbResponse = repository.findById(neoId);
        return dbResponse.orElse(null);
    }

    @GetMapping("name/{neoName}")
    public NearEarthObject findByName(@PathVariable String neoName) {
        Optional<NearEarthObject> dbResponse = repository.findByName(neoName);
        return dbResponse.orElse(null);
    }

    @GetMapping("fetch-all")
    public List<NearEarthObject> findAll() {
        return repository.findAll();
    }
}
