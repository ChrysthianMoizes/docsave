package cgd;

import cdp.Compartimento;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDCompartimento extends GDGenerico {
    public Compartimento consultar(String nome) {
        Criteria crit = criarSessao().createCriteria(Compartimento.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        crit.setMaxResults(1);
        Compartimento compartimento = (Compartimento) crit.uniqueResult();
        sessao.close();
        return compartimento;
    }

    public List obterCompartimentos(String mobilia) {
        Criteria crit = criarSessao().createCriteria(Compartimento.class);
        mobilia = mobilia.toLowerCase();
        crit.add(Restrictions.eq("mobilia", mobilia));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List lista = crit.list();
        sessao.close();
        return lista;
    }
}
