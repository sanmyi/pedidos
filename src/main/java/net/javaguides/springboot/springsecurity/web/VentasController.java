package net.javaguides.springboot.springsecurity.web;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.javaguides.springboot.springsecurity.model.ProductoVendido;
import net.javaguides.springboot.springsecurity.model.poducto;
import net.javaguides.springboot.springsecurity.repository.ProductosVendidosRepository;
import net.javaguides.springboot.springsecurity.repository.VentasRepository;



@Controller
@RequestMapping(path = "/ventas")
public class VentasController {

	@Autowired
    VentasRepository ventasRepository;
	@Autowired
	 ProductosVendidosRepository productosVendidosRepository;

	 

 @GetMapping("/")
 public String mostrarVentas(Model model) { 
     model.addAttribute("vendido", productosVendidosRepository.findAll());
     return "ver_ventas";
 }
 


 
 



	
	
	
	
}
