/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.model.Contatos;
import java.util.List;

/**
 *
 * @author TECFFWKS03
 */
public interface interfaceContatos {
    public Contatos getContatos(Long id);
    public void salvar(Contatos contatos);
    public void remover(Contatos contatos);
    public void atualizar(Contatos contatos);
    /**
     *
     * @return
     */
    public List<Contatos>list();
    
}
