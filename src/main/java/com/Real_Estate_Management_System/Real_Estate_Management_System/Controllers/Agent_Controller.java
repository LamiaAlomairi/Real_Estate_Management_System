package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Agent;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Agent_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "agent")
public class Agent_Controller {
    //    http://localhost:8080/agent/getAll
    @Autowired
    Agent_Service agent_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Agent> getAllAgents() {

        return agent_service.getAllAgents();
    }
    @GetMapping(value = "getById")
    public Agent getAgentById(@RequestParam Long id) {

        return agent_service.getAgentById(id);
    }
}
