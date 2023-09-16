package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.buttons.MacOsBoton;
import refactoring_guru.abstract_factory.example.ventanas.Ventana;
import refactoring_guru.abstract_factory.example.ventanas.VentanaMacOs;

public class MacOsFactory implements GUIFactory {
    @Override
    public Boton crearBoton(){
        return new MacOsBoton();
    }
    @Override
    public Ventana crearVentana(){return new VentanaMacOs();
    }
}
