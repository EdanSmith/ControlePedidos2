package br.com.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.model.Pedido;

@Path("pedido")
public class PedidoResource {

	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@POST
	public Pedido gravar(Pedido pedido) {
		System.out.println(pedido);

		return pedido;
	}

}
