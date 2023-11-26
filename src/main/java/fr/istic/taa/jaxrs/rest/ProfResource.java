package fr.istic.taa.jaxrs.rest;
import java.util.List;
import fr.istic.taa.jaxrs.dao.generic.ProfDao;
import fr.istic.taa.jaxrs.domain.Prof;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/professors")
@Produces({"application/json"})
public class ProfResource {

  ProfDao dao = new ProfDao();
  @GET
  @Path("/{id}")
  public Prof getPetById(@PathParam("id") Long petId)  {
      // return pet
      return dao.findOne(petId);
  }

  @GET
  public List<Prof> getAllProfessors() {
    return dao.findAll();
  }
}