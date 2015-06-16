package unygo.smoke.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import unygo.smoke.model.Power;
import unygo.smoke.service.I;

@ManagedBean
@RequestScoped
public class X {

	@ManagedProperty(value="#{s}")
	private I s;
	public void setS(I s) {
		this.s = s;
	}

	
	private Power power;
	
	@PostConstruct
	public void init(){
		power = new Power();
	}


	public String y() {
		String navigateTo = null;
		System.out.println(s);
		s.z(power);
		return navigateTo;
	}


	public Power getPower() {
		return power;
	}


	public void setPower(Power power) {
		this.power = power;
	}
	
	

}
