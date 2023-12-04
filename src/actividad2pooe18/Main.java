package actividad2pooe18;

public class Main {

    public static void main(String[] args) {
        //Cuerpo del ejercicio con datos del empleado y título
        String nombre = "Alfredo Pérez";
        int codigo = 20, horas = 100;
        double valor_horas = 4500, retencion = 0.30;
        
        System.out.println("Ejercicio propuesto #18");
        
        //Presentamos al usuario los datos de código, nombre, salario bruto y salario neto
        System.out.println("Código: " + codigo);
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario bruto: $" + horas*valor_horas);
        System.out.println("Salario neto: $" + ((horas*valor_horas)-(horas*valor_horas*retencion)));
        
        //Un reto sería conectar esto a una base de datos y que consulte, y que además se pueda hacer CRUD de la información
        
    }
    
}
