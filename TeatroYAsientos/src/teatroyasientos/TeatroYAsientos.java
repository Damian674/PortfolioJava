
package teatroyasientos;

import java.util.Scanner;

public class TeatroYAsientos {

    public static void main(String[] args) {
        
        char asientos[][] = new char [10][10];
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila,asiento;
        String respuesta;
        String mapa;
     
        for(int f=0;f<asientos.length;f++){
            for(int a=0;a<asientos.length;a++){
                asientos[f][a]='L';
            }
        }
        System.out.println("-----Bienvenido al sistema de reservas-----");
        System.out.println(" ");
        
        while(bandera!=true){
            
        System.out.println("Desea ver el mapa de asientos? si/no");
        mapa = teclado.next();
        if(mapa.equalsIgnoreCase("si")){
            dibujarMapa(asientos);
        }   
        
        System.out.println("\nIngrese Fila y Asiento a reservar");
        System.out.print("Fila (entre 0 y 9):");
        fila=teclado.nextInt();
        while(fila>9){
            System.out.println("La fila solicitada no existe");
            System.out.print("Fila (entre 0 y 9:");
            fila = teclado.nextInt();                
        }
        
        System.out.print("Asiento (entre 0 y 9):");
        asiento=teclado.nextInt();
        while(asiento>9){
            System.out.println("El asiento solicitado no existe");
            System.out.print("Asiento (entre 0 y 9:");
            asiento = teclado.nextInt();                
        }
        
        if(asientos[fila][asiento]=='L'){
            asientos[fila][asiento] = 'X';
            System.out.println("El asiento fue reservado correctamente");
        }
        else{
            System.out.println("El asiento esta ocupado, por favor elija otro");
            }
        System.out.println("Desea finalizar la reserva? S:Si, Cualquier tecla:No");
        respuesta=teclado.next();
        
        if(respuesta.equalsIgnoreCase("s")){
            bandera=true;
            }
        }
    }
    
    static void dibujarMapa(char asientos[][]){
    for(int f=0;f<asientos.length;f++){
        System.out.print(f + " ");
            for(int a=0;a<asientos.length;a++){
                System.out.print("[" + asientos[f][a] + "]");
            }
               System.out.println(" ");
            } 
    }
    
}
