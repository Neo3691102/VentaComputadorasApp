package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
//        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
//        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27.0);
//        System.out.println(monitorLenovo);

        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
//        System.out.println(computadoraLenovo);

        //Objeto computadora
        Monitor monitorDell = new Monitor("Dell", 15.0);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        Monitor monitorMac = new Monitor("Mac", 27.0);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac = new Computadora("iMac", monitorMac, tecladoMac, ratonMac);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraDell);
        System.out.println();
        orden2.mostrarOrden();
    }

}
