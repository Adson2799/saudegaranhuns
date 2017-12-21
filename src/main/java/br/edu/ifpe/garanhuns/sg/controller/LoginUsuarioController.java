/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.sg.controller;

import br.edu.ifpe.garanhuns.sg.model.Atendente;
import br.edu.ifpe.garanhuns.sg.model.Paciente;
import br.edu.ifpe.garanhuns.sg.model.Usuario;
import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.PacienteHibernate;
import br.edu.ifpe.garanhuns.sg.model.dao.hibernate.UsuarioHibernate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Igor Sousa PC
 */
@ManagedBean
@SessionScoped
public class LoginUsuarioController {

    private UsuarioHibernate usuarioh = new UsuarioHibernate();

    public LoginUsuarioController() {
    }

    public String realizarLogin(String login, String senha) {
        FacesContext context = FacesContext.getCurrentInstance();

        Usuario usuarioLogado = usuarioh.recuperarUsuarioPorLogin(login, senha);

        if (usuarioLogado != null) {
            ExternalContext externalContext = context.getExternalContext();
            Map<String, Object> session = externalContext.getSessionMap();

            session.put("usuarioLogado", usuarioLogado);
            context.addMessage(null, new FacesMessage("Sucesso", "Login realizado com sucesso!"));
            return "/index.xhtml";
        } else {

            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Login ou senha inválidos."));
        }
        return "";
    }
}
