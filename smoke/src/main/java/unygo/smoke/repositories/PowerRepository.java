package unygo.smoke.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import unygo.smoke.model.Power;

public interface PowerRepository extends MongoRepository<Power, String> {

}
