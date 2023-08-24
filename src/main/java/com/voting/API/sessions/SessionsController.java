package com.voting.API.sessions;

import com.voting.API.sessions.model.SessionDTO;
import com.voting.API.sessions.model.SessionEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
@AllArgsConstructor
public class SessionsController {

    private SessionService service;

    @PostMapping
    public ResponseEntity<SessionEntity> createSession(@RequestBody SessionDTO dto){
        SessionEntity response = service.createSession(dto);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<SessionEntity>> getAllSession(){
        List<SessionEntity> response = service.getAllSessions();
        return ResponseEntity.ok(response);
    }
}
