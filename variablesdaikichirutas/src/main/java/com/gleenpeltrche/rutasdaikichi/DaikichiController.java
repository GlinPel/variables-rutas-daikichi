package com.gleenpeltrche.rutasdaikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    @RequestMapping("")
    public String daikichi() {
            return "¡Hola, mundo!";
    }
    @RequestMapping("/today")
    public String today() {
            return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
            return "¡Mañana, una oportunidad se presentará, así que estate abierto a nuevas ideas!";
    }
    
    @RequestMapping("/travel/{ciudad}")
    public String travel(@PathVariable("ciudad") String ciudad){
    	return "¡Felicitaciones! ¡Pronto viajarás a " + ciudad + "!";
    } 
    
    @RequestMapping("/lotto/{numero}")
    public String lotto(@PathVariable("numero") String numero){
    	int numeroInt = Integer.parseInt(numero);
    	if(numeroInt % 2 == 0) {
    		return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
    	}else {
    		return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
    	}	
    } 
}
