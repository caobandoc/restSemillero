package com.clearminds.caoc.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.caoc.dtos.Estudiante;
import com.clearminds.caoc.excepciones.BDDException;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		System.out.println("Ingresando estudiante: " +estudiante.toString());
		ServicioEstudiante se = new ServicioEstudiante();
		try {
			se.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante){
		System.out.println("Actualizar estudiante: " +estudiante.toString());
		ServicioEstudiante se = new ServicioEstudiante();
		try {
			se.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
