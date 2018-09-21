import org.springframework.cloud.contract.spec.Contract;


Contract.make{
    description: "should have some response"
    request{
        url: "/fraud"
        method GET()
    }
    response{
        status: 201
        body: ([ "mark", "GetFraudValueRand" ])
    }


}
