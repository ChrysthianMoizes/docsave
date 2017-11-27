package cgd;

import cdp.Local;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDLocal extends GDGenerico {
    
    public Local consultarNome(String nome) {
        Criteria crit = criarSessao().createCriteria(Local.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        crit.setMaxResults(1);
        Local tLocal = (Local) crit.uniqueResult();
        sessao.close();
        return tLocal;        
    }
    
    public Local consultarId(int id) {
        Criteria crit = criarSessao().createCriteria(Local.class);
        crit.add(Restrictions.eq("id", id));
        crit.setMaxResults(1);
        Local tLocal = (Local) crit.uniqueResult();
        sessao.close();
        return tLocal;        
    }
}
