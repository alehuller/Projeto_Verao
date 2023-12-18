package br.com.fiap.LoL.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.LoL.dto.UsuarioDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/paginaLoginUsuario")
public class ControllerLoginUsuario {

    @Autowired
    private HttpServletRequest request;
    
    @GetMapping
    public String init(final Model model) {
        model.addAttribute("usuarioDto", new UsuarioDTO());
        return "paginaLoginUsuario";
    }

    public ModelAndView redirect(final Model model) {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }

    @PostMapping
    public ModelAndView result(@ModelAttribute UsuarioDTO usuarioDTO) throws NoSuchAlgorithmException, UnsupportedEncodingException, SQLException {
        usuarioDTO.getEmail();
        usuarioDTO.getSenha();

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean valido = usuarioDAO.validarUsuario(usuarioDTO.getEmail(), usuarioDTO.getSenha());
        if (valido == true) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", usuarioDTO.getEmail());
            ModelAndView modelAndView = new ModelAndView("redirect:paginaEscolhaLiga");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("redirect:paginaLoginUsuario");
        return modelAndView;
    }
}

