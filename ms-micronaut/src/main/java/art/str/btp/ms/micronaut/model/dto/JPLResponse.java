package art.str.btp.ms.micronaut.model.dto;

import art.str.btp.ms.micronaut.model.dto.misc.LinksDto;
import art.str.btp.ms.micronaut.model.dto.misc.PageDto;

import java.util.List;

public class JPLResponse {
    private List<NearEarthObjectDto> near_earth_objects;
    private PageDto pageDto;
    private LinksDto linksDto;

    public List<NearEarthObjectDto> getNear_earth_objects() {
        return near_earth_objects;
    }

    public void setNear_earth_objects(List<NearEarthObjectDto> near_earth_objects) {
        this.near_earth_objects = near_earth_objects;
    }

    public PageDto getPageDto() {
        return pageDto;
    }

    public void setPageDto(PageDto pageDto) {
        this.pageDto = pageDto;
    }

    public LinksDto getLinksDto() {
        return linksDto;
    }

    public void setLinksDto(LinksDto linksDto) {
        this.linksDto = linksDto;
    }
}
