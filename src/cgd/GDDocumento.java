package cgd;

import cdp.Documento;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GDDocumento extends GDGenerico {
    public Documento consultar(String nome) {
        Criteria crit = criarSessao().createCriteria(Documento.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        crit.setMaxResults(1);
        Documento compartimento = (Documento) crit.uniqueResult();
        sessao.close();
        return compartimento;
    }
}
