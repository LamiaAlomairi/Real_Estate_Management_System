package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Agent;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "agent")
public class AgentController {
    //    http://localhost:8080/agent/getAll
    @Autowired
    AgentService agentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Agent> getAllAgents() {

        return agentService.getAllAgents();
    }
    @GetMapping(value = "getById")
    public Agent getAgentById(@RequestParam Long id) {

        return agentService.getAgentById(id);
    }
}
