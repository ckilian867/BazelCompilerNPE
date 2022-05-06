import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import java.net.URI;
import java.net.URISyntaxException;

public class Problem {

  public void test() throws URISyntaxException {
    Response res = Response.created(new URI("test")).build();
    // commenting out the following line allows the build to succeed
    res.readEntity(new GenericType<>() {});
  }
}
