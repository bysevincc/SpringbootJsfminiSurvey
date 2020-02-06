package com.sevincbesdas.bean;


import org.primefaces.model.chart.PieChartModel;
import javax.annotation.PostConstruct;
import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.PieChartModel;
import org.springframework.stereotype.Controller;
@ManagedBean(name = "helloBean")
@Controller
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 4085285875380136779L;


	
private Kayit form= new Kayit();
private ArrayList<Kayit> liste =new ArrayList<Kayit>();


	public void kaydet() {
		getListe().add(getForm());
		setForm(new Kayit());
	}
	
	
	public void sil() {
		
		
		getListe().remove(getForm());
		setForm(new Kayit());
	}
	
	public void duzenle() {
		
		setForm(new Kayit());
	}
	@PostConstruct
	public void init() {
		System.out.println("Hello bean init calisti.");
	}

	
	public void clickHelloWorldButton() {
		
		System.out.println("Merhaba Dünya Tıklandı !");
		
	}
	



	public Kayit getForm() {
		return form;
	}


	public void setForm(Kayit form) {
		this.form = form;
	}
	public ArrayList<Kayit> getListe() {
		return liste;
	}
	public void setListe(ArrayList<Kayit> liste) {
		this.liste = liste;
	}

	
}
