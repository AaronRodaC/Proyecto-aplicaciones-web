package com.tienda.controller;

import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author aroda
 */
@Controller
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/maquillaje")
    public String Maquillaje(Model model) {
        return "maquillaje";
    }
    
    @GetMapping("/contacto/contacto")
    public String Contacto (Model model) {
        return "/contacto/contacto";
    }

    @PostMapping("/guardar")
    public String guardar(Categoria categoria, @RequestParam("imageFile") MultipartFile imagenFile) {
        categoriaService.save(categoria);
        return "redirect:/categoria/listado";
    }

}
