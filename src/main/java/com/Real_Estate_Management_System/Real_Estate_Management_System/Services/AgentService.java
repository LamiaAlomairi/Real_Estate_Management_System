package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Agent;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {
    @Autowired
    AgentRepository agentRepository;
    public List<Agent> getAllAgents() {

        return agentRepository.findAll();
    }

    public Agent getAgentById(Long id) {

        return agentRepository.findById(id).get();
    }
}
