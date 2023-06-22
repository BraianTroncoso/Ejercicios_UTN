package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Apellido: "+ persona.getApellido());
    }
}

// El concepto de serialización se define como convertir una clase o archivo en bits(0 y 1)
// para luego implementar dicha clase en otro servidor donde se va a deserializar y sera convertido
// nuevamente en la clase creada, es un similar como cuando usamos json.
