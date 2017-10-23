/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.TipoDocumento;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author reida
 */
public class DAOTipoDocumento extends DAOGenerico {
    public TipoDocumento consultarTipoDocumento(String nome){
        Criteria crit = criarSessao().createCriteria(TipoDocumento.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        crit.setMaxResults(1);
        TipoDocumento tDocumento = (TipoDocumento) crit.uniqueResult();
        sessao.close();
        return tDocumento;        
    }
}
