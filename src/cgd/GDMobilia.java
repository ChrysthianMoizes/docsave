package cgd;

import cdp.Mobilia;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDMobilia extends GDGenerico {
    
    public Mobilia consultar(String nome){
        Criteria crit = criarSessao().createCriteria(Mobilia.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        crit.setMaxResults(1);
        Mobilia tMobilia = (Mobilia) crit.uniqueResult();
        sessao.close();
        return tMobilia;        
    }
    
    public List consultarMobilias(String local){
        Criteria crit = criarSessao().createCriteria(Mobilia.class);
        local = local.toLowerCase();
        crit.add(Restrictions.eq("local", local));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
