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
	
	@RequestMapping("/grabar")
	public String grabar(@RequestParam("codigo") Integer cod,
						 @RequestParam("serie") String ser,
						 @RequestParam("numero") String num,
						 @RequestParam("fecha") String fec,
						 @RequestParam("vtotal") double vt,
						 @RequestParam("descuento") double desc,
						 @RequestParam("stotal") double st,
						 @RequestParam("igv") double igv,
						 @RequestParam("total") double total,
						 @RequestParam("estado") String est,
						 @RequestParam("cliente") int codClie,
						 @RequestParam("comprobante") int codComp,
						 @RequestParam("empleado") int codEmp,

						 RedirectAttributes redirect) {		
		try {
			//crear objeto de la entidad producto
			Ventas vent=new Ventas();
			
			
			
	
			//setear atributos del objeto "pro" usando los parámetros
			vent.setSerie(ser);
			vent.setNumero(num);
			vent.setFecha(LocalDate.parse(fec));
			vent.setVtotal(vt);
			vent.setDescuento(desc);
			vent.setStotal(st);
			vent.setIgv(igv);
			vent.setTotal(total);
			vent.setEstado(est);

			//crear objeto de le entidad presentacion
			Cliente cli=new Cliente();
			cli.setCodigo(codClie);
			vent.setCliente(cli);
			
			TipoComprobante tcom=new TipoComprobante();
			tcom.setCodigo(codComp);
			vent.setComprobante(tcom);
			
			Empleado emp=new Empleado();
			emp.setCodigo(codEmp);
			vent.setEmpleado(emp);
			
		

			
			

			//validar codi
			if(cod==0) {
				//invocar al método registrar
				serviceVenta.registrar(vent);
				//mensaje 
				redirect.addFlashAttribute("MENSAJE","Producto Registrado");
			}
			else {
				//setear atributo codigo
				vent.setCodigo(cod);
				serviceVenta.actualizar(vent);
				//mensaje +
				redirect.addFlashAttribute("MENSAJE","Producto Actualizado");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/venta/lista";
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
