package mediator_ex1.components;

import mediator_ex1.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
