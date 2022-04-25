package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.name("sil"));
        System.out.println(cliente.age(30));
        System.out.println(cliente.numberPhone(23233433));
        System.out.println(cliente.credit(true));

        Trabajador trabajador = new Trabajador();
        System.out.println(trabajador.name("ger"));
        System.out.println(trabajador.age(38));
        System.out.println(trabajador.numberPhone(23415142));
        System.out.println(trabajador.salario(30000));
    }
}

    class Persona {
        public int age(int a ){
            return a;
        };
        public String name(String a){
            return a;
        };
        public int numberPhone(int a){
            return a;
        };
    }
    class Cliente extends Persona {
        public boolean credit(boolean a){
            return a;
        };
    };
    class Trabajador extends Persona {
        public int salario(int a ){
            return a;
        };
    }


