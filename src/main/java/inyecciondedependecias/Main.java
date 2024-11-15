package inyecciondedependecias;

public class Main {

    public static void main(String[] args) {

        // al crear e instanciar el objeto, necesitara una dependencia, y la asignaremos nosotros como implementacion
        
        // Inyección de dependencia mediante el constructor
        UsuarioRepositorio usuarioRepositorio = new UsuarioMySqlRepositorio();
        UsuarioServicio usuarioServicio = new UsuarioServicio(usuarioRepositorio);

        // Obtener el usuario
        usuarioServicio.obtenerUsuario();

        // Cambiar la implementación de UsuarioRepositorio a PostgreSQL
        usuarioRepositorio = new UsuarioPostgreSqlRepositorio();
        usuarioServicio = new UsuarioServicio(usuarioRepositorio);

        // Obtener el usuario nuevamente, ahora desde PostgreSQL
        usuarioServicio.obtenerUsuario();
    }
}

/*
Patron de diseño de inyeccion de dependencias

Siempre es importante que nuestro codigo sea lo suficientemente flexible,
de manera que cuando cambiemos una parte del codigo, no afecte de manera directa a otra parte

Este patron busca la delegacion de la dependencia de que tipo de clases se van a utilizar, a traves de dependencias de una misma clase
 */
