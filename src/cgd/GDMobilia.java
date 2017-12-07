package cgd;

import cdp.Mobilia;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;

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
    
    public List consultarMobilias(int local){
        Criteria crit = criarSessao().createCriteria(Mobilia.class);
        //local = local.toLowerCase();
        crit.add(Restrictions.eq("local.id", local));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List lista = crit.list();
        sessao.close();
        return lista;
    }
    
    public void delete(Mobilia mob) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SQLException{
        sessao = criarSessao();
        sessao.beginTransaction();
        Mobilia mobManaged = procura((int)getId(mob, Mobilia.class));
        sessao.delete(mobManaged);
        
    }
    
    public Mobilia procura(int id){
        return (Mobilia)sessao.load(Mobilia.class, id);
    }
}
