package br.com.dw6.gestao_vagas_final.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import templates.candidato.service.CandidatoService;

@Controller
@RequestMapping("/candidato")
public class CandidatoController {

    @GetMapping("/login")
    public String login(){
        return "candidato/login";
    }

    @PostMapping("/signIn")
    public String signIn(RedirectAttributes redirectAttributes, String username, String Password) {
        if(username.equals("bruno"))
        {
            return "candidato/profile";
        }

        redirectAttributes.addFlashAttribute("error_message", "Usuário/Senha incorretos");
        return "redirect:/candidato/login";
    }
}
