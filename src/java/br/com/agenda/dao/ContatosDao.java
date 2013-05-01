/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.model.Contatos;
import br.com.agenda.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author TECFFWKS03
 */
public class ContatosDao  implements interfaceContatos {

    @Override
    public Contatos getContatos(Long id) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        return (Contatos) ss.load(Contatos.class, id);
        
    }

    @Override
    public void salvar(Contatos contatos) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.save(contatos);
        ss.beginTransaction().commit();
        
    }

    @Override
    public void remover(Contatos contatos) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.delete(contatos);
        ss.beginTransaction().commit();
    }

    @Override
    public void atualizar(Contatos contatos) {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        ss.update(contatos);
        ss.beginTransaction().commit();
    }

    @Override
    public List<Contatos> list() {
        Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        ss.beginTransaction();
        List lista = ss.createQuery("From contatos").list();
        ss.beginTransaction().commit();
        return lista;
    }
    
}
