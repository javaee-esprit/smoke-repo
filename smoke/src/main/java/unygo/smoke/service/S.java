package unygo.smoke.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unygo.smoke.model.Power;
import unygo.smoke.repositories.PowerRepository;

@Service
public class S implements I {
	
	@Autowired
	private PowerRepository repository;

	public void z(Power power) {
		System.out.println("!!!DONE!!!");
		repository.save(power);
	}

}
