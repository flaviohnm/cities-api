package com.gitbub.flaviohnm.citiesapi.states.repository;

import com.gitbub.flaviohnm.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

