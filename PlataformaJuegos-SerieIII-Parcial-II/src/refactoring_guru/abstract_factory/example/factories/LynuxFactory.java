package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Boton;
import refactoring_guru.abstract_factory.example.buttons.LinuxBoton;
import refactoring_guru.abstract_factory.example.ventanas.Ventana;
import refactoring_guru.abstract_factory.example.ventanas.VentanaLynux;

public class LynuxFactory implements GUIFactory{
    @Override
    public Boton crearBoton(){
        return new LinuxBoton();
    }
    @Override
    public Ventana crearVentana(){return new VentanaLynux();
    }
}
