package art.str.btp.ms.spring.controller;

import art.str.btp.ms.spring.db.NearEarthObjectRepository;
import art.str.btp.ms.spring.model.dto.api.ApiOperationResultType;
import art.str.btp.ms.spring.model.dto.api.ApiResponse;
import art.str.btp.ms.spring.model.neo.NearEarthObject;
import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("storage")
public class StorageController {

    private final NearEarthObjectRepository repository;

    public StorageController(NearEarthObjectRepository repository) {
        this.repository = repository;
    }

    @PostMapping("create")
    public ApiResponse create(@RequestBody List<NearEarthObject> nearEarthObjects) {
        List<NearEarthObject> repositoryResponse = repository.saveAll(nearEarthObjects);

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setTimeStamp(new DateTime());

        if (repositoryResponse.size() == nearEarthObjects.size()) {
            apiResponse.setResultType(ApiOperationResultType.SUCCESSFUL);
            apiResponse.setMessage("Successfully inserted data for " + repositoryResponse.size() + " near earth objects");
        }
        if (!repositoryResponse.isEmpty() && repositoryResponse.size() != nearEarthObjects.size()) {
            apiResponse.setResultType(ApiOperationResultType.PARTLY);
            apiResponse.setMessage("Something went wrong, check the logs. Inserted data for " + repositoryResponse.size() + " near earth objects out of " + nearEarthObjects.size());
        }
        if (repositoryResponse.isEmpty()) {
            apiResponse.setResultType(ApiOperationResultType.FAILED);
            apiResponse.setMessage("Something went wrong, no data was inserted");
        }
        return apiResponse;
    }

    @GetMapping("neo/id/{neoId}")
    public NearEarthObject findByID(@PathVariable Long neoId) {
        Optional<NearEarthObject> dbResponse = repository.findById(neoId);
        return dbResponse.orElse(null);
    }

    @GetMapping("neo/name/{neoName}")
    public NearEarthObject findByName(@PathVariable String neoName) {
        Optional<NearEarthObject> dbResponse = repository.findByName(neoName);
        return dbResponse.orElse(null);
    }

    @GetMapping("neo/fetch-all")
    public List<NearEarthObject> findAll() {
        return repository.findAll();
    }
}
