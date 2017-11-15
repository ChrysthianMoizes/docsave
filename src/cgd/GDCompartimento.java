/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgd;

import cdp.Compartimento;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author reida
 */
public class GDCompartimento extends GDGenerico{
    public Compartimento consultarCompartimento(String nome){
         Criteria crit = criarSessao().createCriteria(Compartimento.class);
         crit.add(Restrictions.eq("nome", nome));
         crit.setMaxResults(1);
         Compartimento comp = (Compartimento) crit.uniqueResult();
         sessao.close();
         return comp;
    }
}
