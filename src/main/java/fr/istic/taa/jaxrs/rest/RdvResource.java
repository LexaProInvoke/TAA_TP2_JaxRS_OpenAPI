package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.generic.ProfDao;
import fr.istic.taa.jaxrs.dao.generic.RdvDao;
import fr.istic.taa.jaxrs.domain.Rdv;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/rdvs")
@Produces({"application/json"})
public class RdvResource {

  RdvDao dao = new RdvDao();

  @GET
  @Path("/{id}")
  public Rdv getPetById(@PathParam("id") Long petId)  {
      // return pet
      return dao.findOne(petId);
  }

  @GET
  public List<Rdv> getAllRdvs() {
    return dao.findAll();
  }
}