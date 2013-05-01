/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.teste;

import br.com.agenda.dao.ContatosDao;
import br.com.agenda.dao.interfaceContatos;
import br.com.agenda.model.Contatos;
import br.com.agenda.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author TECFFWKS03
 */
public class Teste {
    public static void main (String[] args){
    Contatos contatos = new Contatos();
    // Recebendo Setnome
    contatos.setNome(JOptionPane.showInputDialog("Digite seu Nome") );
    contatos.setEmail(JOptionPane.showInputDialog("Digite seu Email") );
    contatos.setTelefone(JOptionPane.showInputDialog("Digite seu Telefone") );
    contatos.setCelular(JOptionPane.showInputDialog("Digite seu Celular") );
 
    interfaceContatos dao = new ContatosDao();
    dao.salvar(contatos);            
    }
    
}
