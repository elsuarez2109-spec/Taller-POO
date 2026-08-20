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
