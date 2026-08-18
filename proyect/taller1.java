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