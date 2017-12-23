/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.sg.model.dao.interfaces;

import br.edu.ifpe.garanhuns.sg.model.Atendimento;
import br.edu.ifpe.garanhuns.sg.model.PostoSaude;
import java.util.List;

/**
 *
 * @author Hérikles
 */
public interface AtendimentoDAO extends DAO<Atendimento> {
    public List<Atendimento> recuperarAtendimentoPorPosto(PostoSaude posto);
}
