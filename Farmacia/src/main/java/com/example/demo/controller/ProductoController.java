package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Laboratorio;
import com.example.demo.entity.Presentacion;
import com.example.demo.entity.Producto;
import com.example.demo.service.LaboratorioServices;
import com.example.demo.service.PresentacionServices;
import com.example.demo.service.ProductoServices;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoServices servicioProduc;
	
	@Autowired
	private PresentacionServices servicioPresent;
	
	@Autowired
	private LaboratorioServices servicioLab;
	
	
	@RequestMapping("/lista")
	public String lista(Model model) {		
		  model.addAttribute("productos", servicioProduc.listarTodos());
		  model.addAttribute("presentaciones", servicioPresent.listarTodos());
		  model.addAttribute("laboratorios", servicioLab.listarTodos());
		
		return "producto";
	}

	@RequestMapping("/grabar")
	public String grabar(@RequestParam("codigo") Integer cod,
						 @RequestParam("descripcion") String des,
						 @RequestParam("concentracion") String con,
						 @RequestParam("stock") int stock,
						 @RequestParam("precio") double pre,
						 @RequestParam("fecha") String fec,

						 @RequestParam("presentacion") int codPre,
						 @RequestParam("laboratorio") int codLab,
						 RedirectAttributes redirect) {		
		try {
			Producto pro=new Producto();
			
			Presentacion pres=new Presentacion();
			
			Laboratorio lab=new Laboratorio();
			
			pro.setDescripcion(des);
			pro.setConcentracion(con);
			pro.setStock(stock);
			pro.setPrecio(pre);
			pro.setFecha(LocalDate.parse(fec));
			
			
			pres.setCodigo(codPre);
			pro.setPresentacion(pres);
			
			
			
			lab.setCodigo(codLab);
			pro.setLaboratorio(lab);

			if(cod==0) {
				servicioProduc.registrar(pro);
				redirect.addFlashAttribute("MENSAJE","Producto Registrado");
			}
			else {
				pro.setCodigo(cod);
				servicioProduc.actualizar(pro);
				redirect.addFlashAttribute("MENSAJE","Producto Actualizado");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/producto/lista";
	}
	
	
	
		@RequestMapping("/consultaPorID")
		@ResponseBody
		public Producto consultaPorID(@RequestParam("codigo") Integer cod){
			return servicioProduc.buscarPorID(cod);
		}
	
		
		
		@RequestMapping("/eliminarPorID")
		public String eliminarPorID(@RequestParam("codigo") Integer cod,
				RedirectAttributes redirect){
			servicioProduc.eliminar(cod);
			redirect.addFlashAttribute("MENSAJE","Producto Eliminado");
			return "redirect:/producto/lista";
		}
	
	
	
	
	

}