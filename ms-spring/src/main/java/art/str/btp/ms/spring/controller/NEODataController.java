package art.str.btp.ms.spring.controller;

import art.str.btp.ms.spring.config.JplApiConfig;
import art.str.btp.ms.spring.controller.exceptions.ApiException;
import art.str.btp.ms.spring.mapping.NEOResponseMapper;
import art.str.btp.ms.spring.model.dto.JPLResponse;
import art.str.btp.ms.spring.model.neo.NearEarthObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("neo")
public class NEODataController {

    private final NEOResponseMapper mapper;
    private final JplApiConfig config;
    private final String url;
    private final RestTemplate restTemplate;

    @Autowired
    public NEODataController(JplApiConfig config, NEOResponseMapper mapper) {
        this.config = config;
        this.mapper = mapper;
        this.restTemplate = new RestTemplate();
        this.url = this.config.getBaseUrl() + "?size=" + this.config.getPageSize() + "&api_key=" + this.config.getApiKey();
    }

    @GetMapping("fetch-all")
    public List<NearEarthObject> fetchAll() {
        List<NearEarthObject> nearEarthObjects = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(this.config.getPageCount()); i++) {
            JPLResponse response = this.restTemplate.getForObject(this.url + "&page=" + i, JPLResponse.class);
            nearEarthObjects.addAll(this.mapper.mapResponseList(response.getNear_earth_objects()));
        }
        return nearEarthObjects;
    }

    @GetMapping("fetch/{pageNum}")
    public List<NearEarthObject> fetch(@PathVariable String pageNum) {
        try {
            Integer.parseInt(pageNum);
        } catch (NumberFormatException e) {
            throw new ApiException("Failed to convert pageNum to valid integer", e);
        }
        JPLResponse response = this.restTemplate.getForObject(this.url + "&page=" + pageNum, JPLResponse.class);
        if (response != null) {
            return this.mapper.mapResponseList(response.getNear_earth_objects());
        }
        throw new ApiException("Failed to retrieve data from JPL API");
    }
}
