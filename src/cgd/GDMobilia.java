package cgd;

import cdp.Mobilia;
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
}
