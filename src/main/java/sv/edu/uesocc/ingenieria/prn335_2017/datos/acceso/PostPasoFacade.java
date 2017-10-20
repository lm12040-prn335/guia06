/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.PostPaso;

/**
 *
 * @author ed
 */
@Stateless
public class PostPasoFacade extends AbstractFacade<PostPaso> implements PostPasoFacadeLocal {

    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria.prn335_2017_talvesFunciona_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PostPasoFacade() {
        super(PostPaso.class);
    }

    @Override
    public List<PostPaso> findByFiltro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
