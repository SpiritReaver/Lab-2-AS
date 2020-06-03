/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import java.util.List;

/**
 *
 * @author kaoz_
 */
public interface IServicioOfertaMockRemote {

    public void agregarOferta(Oferta oferta);

    public List<Oferta> listarOfertas();

    
}
