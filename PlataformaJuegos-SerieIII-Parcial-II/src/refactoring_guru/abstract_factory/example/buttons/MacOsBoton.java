package refactoring_guru.abstract_factory.example.buttons;
public class MacOsBoton implements Boton{
    @Override
    public void paint(){
        System.out.println("Boton Mac");
    }
}
