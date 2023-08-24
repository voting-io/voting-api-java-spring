package com.voting.API.sessions;

import com.voting.API.sessions.model.SessionDTO;
import com.voting.API.sessions.model.SessionEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SessionService {

    private SessionRepository repository;

    public SessionEntity createSession(SessionDTO dto){
        SessionEntity entity = new SessionEntity();
        entity.setName(dto.getName());
        return repository.save(entity);
    }

    public List<SessionEntity> getAllSessions() {
        return repository.findAll();
    }
}
