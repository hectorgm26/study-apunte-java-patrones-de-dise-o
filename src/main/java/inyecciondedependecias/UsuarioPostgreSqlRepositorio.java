package inyecciondedependecias;

public class UsuarioPostgreSqlRepositorio implements UsuarioRepositorio {

    @Override
    public void getUsuario() {
        System.out.println("Usuario obtenido de PostgreSQL: Ana Martínez");
    }
}
