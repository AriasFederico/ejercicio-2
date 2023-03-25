public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(23);
        System.out.println(persona.getEdad());

        persona.setNombre("Federico");
        System.out.println(persona.getNombre());

        persona.setTelefono(22131889);
        System.out.println(persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int valorEdad){
        this.edad = valorEdad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String valorNombre){
        this.nombre = valorNombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int valorTelefono){
        this.telefono = valorTelefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

// crear clase persona
// crear variables privadas edad,nombre y telefono de la persona
// crear gets y sets de cada propiedad
// crear un objeto persona en el main
// utilizar gets y sets para darle valores a las propiedades edad, nombre y telefono, por ultimo mostrar en consola