package cgd;

import cdp.TipoDocumento;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDTipoDocumento extends GDGenerico {
    
    public TipoDocumento consultarTipoDocumento(String nome) {
        Criteria crit = criarSessao().createCriteria(TipoDocumento.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        crit.setMaxResults(1);
        TipoDocumento tDocumento = (TipoDocumento) crit.uniqueResult();
        sessao.close();
        return tDocumento;        
    }
    
    public TipoDocumento consultarId(int id) {
        Criteria crit = criarSessao().createCriteria(TipoDocumento.class);
        crit.add(Restrictions.eq("id", id));
        crit.setMaxResults(1);
        TipoDocumento tDocumento = (TipoDocumento) crit.uniqueResult();
        sessao.close();
        return tDocumento;
    }
}
