package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.ventanas.Ventana;

public interface GUIFactory {
    Boton crearBoton();
    Ventana crearVentana();
}
