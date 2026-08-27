import java.util.Scanner;
public class taller1{
    public static void main(String[]args){
        int op=0;
        Scanner sc=new Scanner(System.in);
        taller1 operaciones= new taller1();
        do{
            System.out.println("1.Suma \n 2.Resta \n 3.Division \n 4.Multiplicar \n 5.Salir \n");
            System.out.println("Haga su eleccion");
            op=sc.nextInt();
            if (op==1){operaciones.suma(10,15);}
            if (op==2){operaciones.restar(10,15);}
            if (op==3){operaciones.dividir(10,15);}
            if (op==4){operaciones.multiplicar(10,15);}
        }while(op<5);
    }
    public void suma(int x,int y){
        System.out.println("La suma es = "+ (x+y));
    }
    public void restar(int x,int y){
        System.out.println("La resta es = "+ (x-y));
    }
    public void dividir(int x,int y){
        System.out.println("La division es = "+ (x/y));
    }
    public void multiplicar(int x,int y){
        System.out.println("La multiplicacion es = "+ (x*y));
    }
}

public class clase{
    public static int valor;
    public static void main(String[]args){
        int valor=10;
        System.out.println(valor);
        listar();
        clase w=new clase();
        w.mostrar();
        
    }
    public static void listar(){
        System.out.println("Hello World listar" );
        int valor=20; //No afecta con el nombre de las otras variables por que es propia del metodo
        System.out.println(valor);
    }
    private void mostrar(){
        System.out.println("Hello World mostrar");
        int valor=30;
    }
}
class metodos{
    public void mostrar(){
        System.out.println("Hello World mostrar");
        int valor=30;
    }
    protected void ver(){
        System.out.println("Hello World ver");
        int valor=40;
    }
}


public class Main {
    public static void main(String[] args) {
        Main x=new Main();
        x.listar("juan");
    }
    public void listar(String v){ //Recibe un parametro tipo String
        System.out.println("Listar "+v);
        int r=sueldo(100); //Envia sueldo al metodo
        System.out.println(r);
    }
    private int sueldo(int s){
        return s*100;
    }
}
//3. crear los getter y setter y crear una  clase para ejecutar el préstamo de libros
import java.util.Scanner;
class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //constructor por defecto
    public Libro() {
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public void setPrestados(int prestados){
        this.prestados=prestados;
    }
    public int getPrestados() {
        return prestados;
    }
    //constructor con parámetros
    public Libro(String titulo, String autor, int ejemplares, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }


 //método para realizar el prestamo de un libro
    public boolean prestamo() {
        if (prestados < ejemplares) {
            prestados++;
            return true;
        }
        return false;
    }

    //método para realizar la devolución de un libro
    public boolean devolucion() {
        if (prestados != 0) {
            prestados--;
            return true;
        }
        return false;
    }

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;                                    
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el título del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese la cantidad de ejemplares totales: ");
        int ejemplares = sc.nextInt();
        System.out.print("Ingrese la cantidad de ejemplares ya prestados: ");
        int prestados = sc.nextInt();
        Libro miLibro = new Libro(titulo, autor, ejemplares, prestados);
        int opcion;
        do {
            System.out.println("1. Mostrar información del libro");
            System.out.println("2. Realizar préstamo");
            System.out.println("3. Realizar devolución");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n" + miLibro);
                    break;
                case 2:
                    if (miLibro.prestamo()) {
                        System.out.println("\nPréstamo realizado con éxito.");
                    } else {
                        System.out.println("\nNo se pudo realizar el préstamo. No hay ejemplares disponibles.");
                    }
                    break;
                case 3:
                    if (miLibro.devolucion()) {
                        System.out.println("\nDevolución realizada con éxito.");
                    } else {
                        System.out.println("\nNo se pudo realizar la devolución.");
                    }
                    break;
                case 4:
                    System.out.println("\nSaliendo del sistema");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
