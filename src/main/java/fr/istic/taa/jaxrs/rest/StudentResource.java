package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.generic.RdvDao;
import fr.istic.taa.jaxrs.dao.generic.StudentDao;
import fr.istic.taa.jaxrs.domain.Student;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/students")
@Produces({"application/json"})
public class StudentResource {

  StudentDao dao = new StudentDao();

  @GET
  @Path("/{id}")
  public Student getPetById(@PathParam("id") Long petId)  {
        return dao.findOne(petId);
  }

  @GET
  public List<Student> getAllStudents() {
    return dao.findAll();
  }

}