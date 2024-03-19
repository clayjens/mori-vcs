package house.yourmommas.memento;

import java.util.List;

public abstract class Caretaker {
    protected List<Memento> mementos;

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) throws IndexOutOfBoundsException {
        return mementos.get(index);
    }
}
