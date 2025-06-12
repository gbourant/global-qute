package gr;

import io.quarkiverse.renarde.Controller;
import io.quarkus.qute.Engine;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("")
public class HelloResource extends Controller {

    @Inject
    Engine engine;

    @GET
    @Path("hello")
    public TemplateInstance hello() {
        return engine.parse("{#input /}").instance();
    }

    @GET
    @Path("year")
    public TemplateInstance year() {
        return engine.parse("{YEAR}").instance();
    }

    @GET
    @Path("onboarding")
    public TemplateInstance onboarding() {
        return engine.parse("{#onboardingForm /}").instance();
    }


}
