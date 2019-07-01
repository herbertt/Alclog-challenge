package com.alclog.challenge.services;


import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.alclog.challenge.model.EntityManagerHelper;
import com.alclog.challenge.model.Produto;

@Path("/v1/produto")
public class ProdutoFacedeREST extends AbstractFacade<Produto> {
	
	private EntityManager em;

	public ProdutoFacedeREST() {
		super(Produto.class);
		// TODO Auto-generated constructor stub
	}
	
	@PUT
	@Override
	@Consumes({ "application/xml", "application/json" })
	public Response create(Produto entity) {
		if (entity.getNome().length() <= 3) {
			return Response.status(Status.CONFLICT).entity("Customer name is too short").type(MediaType.TEXT_PLAIN).build();
		}
		return super.edit(entity);
	}
	
	@POST
	@Override
	@Consumes({ "application/xml", "application/json" })
	public Response edit(Produto entity) {
		if (entity.getNome().length() <= 3) {
			return Response.status(Status.CONFLICT).entity("Customer name is too short").type(MediaType.TEXT_PLAIN).build();
		}
		return super.edit(entity);
	}
	
	@DELETE
	@Path("remove/{id}")
	public Response remove(@PathParam("id") Integer id) {
		return super.remove(super.find(id));
	}
	
	@GET
	@Path("{id}")
	@Produces({ "application/json" })
	public Produto find(@PathParam("id") Integer id) {
		return super.find(id);
	}
	
	@GET
	@Override
	@Produces({ "application/json" })
	public List<Produto> findAll() {
		return super.findAll();
	}
	
	@GET
	@Path("{from}/{to}")
	@Produces({ "application/xml", "application/json" })
	public List<Produto> findRange(@PathParam("from") Integer from,
			@PathParam("to") Integer to) {
		return super.findRange(new int[] { from, to });
	}
	
	@GET
	@Path("count")
	@Produces("text/plain")
	public String countREST() {
		return String.valueOf(super.count());
	}

	@Override
	protected EntityManager getEntityManager() {
		em = EntityManagerHelper.getEntityManager();
		return em;
	}
	
}
