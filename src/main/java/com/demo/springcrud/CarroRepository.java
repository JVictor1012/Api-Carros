package com.demo.springcrud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository <Carro, Long>{ //<Entidade, id>
    
}
