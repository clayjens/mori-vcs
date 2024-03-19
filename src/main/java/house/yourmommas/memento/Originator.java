package house.yourmommas.memento;

public interface Originator {
    Memento saveStateToMemento(String label);

    void getStateFromMemento(Memento memento);
}
