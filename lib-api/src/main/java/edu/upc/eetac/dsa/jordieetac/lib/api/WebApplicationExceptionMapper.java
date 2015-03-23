package edu.upc.eetac.dsa.jordieetac.lib.api;

import javax.ws.rs.*;

@Provider
public class WebApplicationExceptionMapper implements
		ExceptionMapper<WebApplicationException> {
	@Override
	public Response toResponse(WebApplicationException exception) {
		LibreriaError error = new LibreriaError(
				exception.getResponse().getStatus(), exception.getMessage());
		return Response.status(error.getStatus()).entity(error)
				.type(MediaType.LIBRERIA_API_ERROR).build();
	}

}