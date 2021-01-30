package es.codeurjc.mastercloudapps.planner.clients.cdctesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.web.client.RestTemplate;

import es.codeurjc.mastercloudapps.planner.models.LandscapeResponse;

@SpringBootTest
@AutoConfigureStubRunner(
    ids = {"froblesc-pd.parla:toposervice:+:8085"},
    stubsMode = StubsMode.LOCAL
)
public class TopoClientTest {
    
    @Test
    void getCityTopographyService() {
        RestTemplate restTemplate = new RestTemplate();

        LandscapeResponse landscape = restTemplate.getForObject("http://localhost:8085/api/topographicdetails/Madrid", LandscapeResponse.class);
        assertEquals("Madrid", landscape.getId());
        assertEquals("Flat", landscape.getLandscape());
    }

}
