package cgd;

import cdp.Documento;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class GDDocumento extends GDGenerico {
    
    public void save(Object obj) throws Exception {
	
	Session session         = criarSessao();
	session.beginTransaction();
	
	try {
            session.merge(obj);
            session.getTransaction().commit();
	} catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            throw e;
	}
	finally {
            session.close();
	}
    }
    
    public Documento consultar(String nome) {
        Criteria crit = criarSessao().createCriteria(Documento.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        crit.setMaxResults(1);
        Documento documento = (Documento) crit.uniqueResult();
        sessao.close();
        return documento;
    }
}
