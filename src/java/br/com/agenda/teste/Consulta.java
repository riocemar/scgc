/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.teste;

import br.com.agenda.dao.ContatosDao;
import br.com.agenda.model.Contatos;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author TECFFWKS03
 */
public class Consulta {
    public static void main (String[] args){
 
// Verificando as dados inseridos.
    List<Contatos> lista = new ContatosDao().list();
    String rec= "";
        for (Contatos contatos: lista){
            rec = rec +"\n Nome: "+ contatos.getNome()+ "Email: "+ contatos.getEmail()+ "Telefone: "+ contatos.getTelefone()+ "Celular: "+ contatos.getCelular();
        }
    JOptionPane.showMessageDialog(null,rec);    
    }

}
