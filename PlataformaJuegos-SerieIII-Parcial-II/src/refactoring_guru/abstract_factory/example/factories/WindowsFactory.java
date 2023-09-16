package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.buttons.WindowsBoton;
import refactoring_guru.abstract_factory.example.ventanas.Ventana;
import refactoring_guru.abstract_factory.example.ventanas.VentanaWindows;

public class WindowsFactory implements GUIFactory {
    @Override
    public Boton crearBoton(){
        return new WindowsBoton();
    }
    @Override
    public Ventana crearVentana(){
        return new VentanaWindows();
    }
}

