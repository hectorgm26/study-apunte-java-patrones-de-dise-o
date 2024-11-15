package prototype;

// 1. se extiende de interfaz Cloneable implementandose
// 2. se coloca un generico T, para que el metodo clone retorne un objeto del mismo tipo que el objeto que se esta clonando
// Aqui se indica que se clonara cualquier objeto que implemente la interfaz IPrototype

public interface IPrototype<T extends IPrototype> extends Cloneable {

    // clonacion simple
    public T clone();

    // clonacion profunda
    public T deepClone();
}

// un generico es un tipo de dato que se define en la declaracion de una clase o interfaz
// para indicar que el tipo de dato sera proporcionado por el usuario
// en el momento de instanciar un objeto de la clase o al implementar la interfaz
// un generico se define con la palabra reservada <T> o con cualquier otra letra o palabra
