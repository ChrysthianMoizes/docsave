package cgd;

import cdp.Documento;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class GDDocumento extends GDGenerico {
    
    public void save(Object obj) throws Exception {
	
	Session session = criarSessao();
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
    
    public void update(Object obj)throws Exception{
        Session session = criarSessao();
	session.beginTransaction();
        try {
            session.flush();
            session.clear();
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
    
    public List consultarNome(String nome) {
        List lista = null;
        Criteria crit = criarSessao().createCriteria(Documento.class);
        nome = nome.toLowerCase();
        crit.add(Restrictions.eq("nome", nome));
        lista = crit.list();
        return lista;
    }
    
    public List consultarCodigo(String cod) {
        List lista = null;
        Criteria crit = criarSessao().createCriteria(Documento.class);
        cod = cod.toLowerCase();
        crit.add(Restrictions.like("codigo", "%"+cod+"%"));
        lista = crit.list();
        return lista;
    }

    public List consultar(String codigo, String nome) {
        List lista = null;
        Criteria crit = criarSessao().createCriteria(Documento.class);
        nome = nome.toLowerCase();
        Criterion nom = Restrictions.eq("nome", "%"+nome+"%");
        crit.add(nom);
        lista = crit.list();
        return lista;
    }
    
    public void fecharSessao(){
        sessao.close();
    } 
}
