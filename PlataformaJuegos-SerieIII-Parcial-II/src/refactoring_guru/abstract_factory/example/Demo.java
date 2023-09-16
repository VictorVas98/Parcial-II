package refactoring_guru.abstract_factory.example;

import refactoring_guru.abstract_factory.example.app.Application;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;
import refactoring_guru.abstract_factory.example.factories.LynuxFactory;
import refactoring_guru.abstract_factory.example.factories.MacOsFactory;
import refactoring_guru.abstract_factory.example.factories.WindowsFactory;

import java.util.Scanner;

public class Demo {

    public static Application configureApplication() {
        Application app;
        GUIFactory factory;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el sistema operativo:");


        String osName = sc.nextLine();
        if (osName.contains("MacOs")) {
            factory = new MacOsFactory();
        }
        if (osName.contains("Windows")){
            factory = new WindowsFactory();
        } else {
            factory = new LynuxFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}