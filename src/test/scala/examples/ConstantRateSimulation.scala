package examples

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class ConstantRateSimulation extends Simulation {

  val httpProtocol = http.baseURL("https://www.google.com")

  val numberOfUsers = 10
  val duration = 10

  val scn = scenario("Constant Rate traffic")
    .exec(http("open_page")
      .get("/")
      .check(status.is(200)))
    .inject(constantUsersPerSec(numberOfUsers) during (duration seconds))
    .throttle(reachRps(numberOfUsers.toInt) in (5 seconds), holdFor(duration seconds))

  setUp(scn).protocols(httpProtocol)
}
