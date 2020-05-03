package art.str.btp.ms.micronaut.controller;

import art.str.btp.ms.micronaut.config.JplApiConfig;
import art.str.btp.ms.micronaut.controller.exceptions.ApiException;
import art.str.btp.ms.micronaut.mapping.NEOResponseMapper;
import art.str.btp.ms.micronaut.model.dto.JPLResponse;
import art.str.btp.ms.micronaut.model.neo.NearEarthObject;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Controller("neo")
public class NEODataController {
    private final NEOResponseMapper mapper;
    private final JplApiConfig config;
    private final String url;
    private final RxHttpClient httpClient;

    public NEODataController(JplApiConfig config, NEOResponseMapper mapper, @Client("${jpl.baseUrl}") RxHttpClient httpClient) {
        this.config = config;
        this.mapper = mapper;
        this.url = "?size=" + this.config.getPageSize() + "&api_key=" + this.config.getApiKey();
        this.httpClient = httpClient;
    }

    @Get("fetch-all")
    public List<NearEarthObject> fetchAll() {
        List<NearEarthObject> nearEarthObjects = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(this.config.getPageCount()); i++) {
            JPLResponse response = this.httpClient.toBlocking().retrieve(this.url + "&page=" + i, JPLResponse.class);
            nearEarthObjects.addAll(this.mapper.mapResponseList(response.getNear_earth_objects()));
        }
        return nearEarthObjects;
    }

    @Get("fetch/{pageNum}")
    public List<NearEarthObject> fetch( String pageNum) {
        try {
            Integer.parseInt(pageNum);
        } catch (NumberFormatException e) {
            throw new ApiException("Failed to convert pageNum to valid integer", e);
        }
        JPLResponse response = this.httpClient.toBlocking().retrieve(this.url + "&page=" + pageNum, JPLResponse.class);
        if (response != null) {
            return this.mapper.mapResponseList(response.getNear_earth_objects());
        }
        throw new ApiException("Failed to retrieve data from JPL API");
    }
}
