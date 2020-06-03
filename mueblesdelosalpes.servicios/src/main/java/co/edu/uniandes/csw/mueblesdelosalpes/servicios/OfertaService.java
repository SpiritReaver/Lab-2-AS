/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Mueble;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kaoz_
 */
@Path("/oferta")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfertaService {

    @EJB
    private IServicioOfertaMockLocal ofertasEjb;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/ofertas")
    public List<Oferta> getTodasLasOfertas() {
        return ofertasEjb.listarOfertas();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/agregar")

    public List<Oferta> agregarOfertas(List<Oferta> of) {
        for (Oferta oferta : of) {
            ofertasEjb.agregarOferta(oferta);
        }
        return of;

    }

}
