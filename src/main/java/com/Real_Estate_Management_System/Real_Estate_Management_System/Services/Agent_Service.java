package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Agent;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Agent_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Agent_Service {
    @Autowired
    Agent_Repository agent_repository;
    public List<Agent> getAllAgents() {

        return agent_repository.findAll();
    }

    public Agent getAgentById(Long id) {

        return agent_repository.findById(id).get();
    }
}
