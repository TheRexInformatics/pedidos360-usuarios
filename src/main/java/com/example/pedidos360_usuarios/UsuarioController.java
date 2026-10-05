package com.example.pedidos360_usuarios;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final Map<String, String> perfilUsuario = new HashMap<>();

    public UsuarioController() {
        perfilUsuario.put("nombre", "Usuario Pedidos360");
        perfilUsuario.put("email", "usuario@ejemplo.com");
        perfilUsuario.put("direccion", "Av. Principal #123");
        perfilUsuario.put("telefono", "+56912345678");
    }

    @GetMapping("/perfil")
    public Map<String, String> obtenerPerfil() {
        return perfilUsuario;
    }

    @PutMapping("/perfil")
    public String actualizarPerfil(@RequestBody Map<String, String> datosNuevos) {
        perfilUsuario.putAll(datosNuevos);
        return "Perfil actualizado correctamente";
    }
}
