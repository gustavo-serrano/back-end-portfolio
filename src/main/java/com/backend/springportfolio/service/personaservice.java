

package com.backend.springportfolio.service;

import com.backend.springportfolio.model.persona;
import com.backend.springportfolio.repository.personarepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class personaservice implements ipersonaservice {
     @Autowired
     public personarepository persorepo;

    @Override
    public List<persona> getpersona() {
        List<persona> persona = persorepo.findAll();
       return persona;
        
    }

    @Override
    public void crearpersona(persona per) {
        persorepo.save(per);
    }

    @Override
    public void borrarpersona(Long id) {
        persorepo.deleteById(id);
    }

    @Override
    public persona findpersona(Long id) {
        persona persona = persorepo.findById(id).orElse(null);
        return persona;
    }
    
}
