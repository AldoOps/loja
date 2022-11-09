package gft.services;


import gft.entities.Usuario;
import gft.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario BuscarUsuarioPorEmail(String email){
        Optional<Usuario> optional = usuarioRepository.findByEmail(email);

        if (optional.isEmpty()){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return optional.get();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return BuscarUsuarioPorEmail(username);
    }
}
