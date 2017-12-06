package cgd;

import cdp.Referenciado;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class GDReferenciado extends GDGenerico {

    public List consultarReferente(String nome, String cpf) {
        Criteria crit = criarSessao().createCriteria(Referenciado.class);
        nome = nome.toLowerCase();
        cpf = cpf.toLowerCase();
        if(cpf.equals(""))
            crit.add( Restrictions.like("cpf", "%"+cpf+"%"));
        else
            crit.add( Restrictions.like("nome", "%"+nome+"%"));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List lista = crit.list();
        sessao.close();
        return lista;
    }
    
    public List listar(){
         List lista;
        sessao = criarSessao();
        sessao.beginTransaction();
        lista = sessao.createQuery("select r from Referenciado r").list();
//        Criteria cons = sessao.createCriteria(Referenciado.class);
//        lista = cons.list();
        sessao.getTransaction().commit();
        sessao.close();
        return lista;
    }
    
}
