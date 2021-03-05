
package com.principal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.principal.entities.Mensagem;

public interface MensagemRepositorio extends JpaRepository<Mensagem, Long> {

}
