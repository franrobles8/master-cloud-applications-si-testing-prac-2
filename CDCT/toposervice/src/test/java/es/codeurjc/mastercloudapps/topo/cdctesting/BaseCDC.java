package es.codeurjc.mastercloudapps.topo.cdctesting;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.codeurjc.mastercloudapps.topo.controller.TopoController;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

@SpringBootTest
public abstract class BaseCDC {
    
    @Autowired
    TopoController topoController;

    @BeforeEach
    public void setup() {
        standaloneSetup(topoController);
    }

}
