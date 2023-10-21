package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Cliente;
import com.example.demo.entity.Empleado;
import com.example.demo.entity.Laboratorio;
import com.example.demo.entity.Presentacion;
import com.example.demo.entity.Producto;
import com.example.demo.entity.TipoComprobante;
import com.example.demo.entity.Ventas;
import com.example.demo.service.ClienteServices;
import com.example.demo.service.EmpleadoServices;
import com.example.demo.service.TipoComprobanteServices;
import com.example.demo.service.VentasServices;

@Controller
@RequestMapping("/venta")
public class VentasController {
	@Autowired
	private VentasServices serviceVenta;
	
	@Autowired
	private ClienteServices serviceCliente;
	@Autowired
	private EmpleadoServices serviceEmpleado;
	@Autowired
	private TipoComprobanteServices serviceTipoComp;
	
	@RequestMapping("/lista")
	public String lista(Model model) {		
		  model.addAttribute("ventas", serviceVenta.listarTodos());
		  model.addAttribute("clientes", serviceCliente.listarTodos());
		  model.addAttribute("empleados", serviceEmpleado.listarTodos());
		  model.addAttribute("tipoComprobantes", serviceTipoComp.listarTodos());
		
		return "venta";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	       //crear dirección URL para buscar ventas por código
			@RequestMapping("/consultaPorID")
			@ResponseBody
			public Ventas consultaPorID(@RequestParam("codigo") Integer cod){
				return serviceVenta.buscarPorID(cod);	
			}
		
	

			//crear dirección URL para eliminar Medicamento por código
			@RequestMapping("/eliminarPorID")
			public String eliminarPorID(@RequestParam("codigo") Integer cod,
					RedirectAttributes redirect){
				serviceVenta.eliminar(cod);
				
				redirect.addFlashAttribute("MENSAJE","Producto Eliminado");
				return "redirect:/venta/lista";
			}
	
	
}
