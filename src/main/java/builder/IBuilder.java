package builder;

public interface IBuilder<T> {
    public T build();
}

/*
Aqui creamos el metodo build que sera implementado en cualquier clase y objeto, con un generico T
 */
