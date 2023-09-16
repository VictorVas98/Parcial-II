package refactoring_guru.abstract_factory.example.app;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.ventanas.Ventana;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;

public class Application {
    private Boton boton;
    private Ventana ventana;

    public Application(GUIFactory factory) {
        boton = factory.crearBoton();
        ventana = factory.crearVentana();
    }

    public void paint() {
        boton.paint();
        ventana.paint();
    }
}


