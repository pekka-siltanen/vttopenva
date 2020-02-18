package fi.vtt.openva.repositories;

import org.springframework.data.repository.CrudRepository;

import fi.vtt.openva.domain.Application;

/**
 * AccountRepository
 * 
 * @author Markus Yliker�l�
 *
 */
public interface ApplicationRepository extends CrudRepository<Application, Integer> {

   Application findByTitle(String title);

}
