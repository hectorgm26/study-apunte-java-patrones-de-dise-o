package inyecciondedependecias;

public class UsuarioMySqlRepositorio implements UsuarioRepositorio {


    @Override
    public void getUsuario() {
        System.out.println("Usuario obtenido de MySQL: Juan Pérez");

    }
}
