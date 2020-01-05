import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("Should return a list of repairs")
    request {
        url "repairs"
        method GET()
    }
    response {
        status 200
        body( ["oil", "brake"])
    }
}