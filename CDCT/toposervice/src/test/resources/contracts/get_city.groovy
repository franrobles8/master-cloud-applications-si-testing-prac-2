import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return the identifier of the city and its topography of a city given the city"

    request {
        url "/api/topographicdetails/Madrid"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                id: "Madrid",
                landscape: "Flat"
        )
    }
}