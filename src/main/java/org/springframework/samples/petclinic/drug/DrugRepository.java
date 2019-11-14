package org.springframework.samples.petclinic.drug;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.drug.Drug;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface DrugRepository extends Repository <Drug, Integer>{
    @Transactional(readOnly = true)
    Collection<Drug> findAll() throws DataAccessException;

}
