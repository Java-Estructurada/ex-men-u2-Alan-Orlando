/*Cantidad de adultos
👦 Cantidad de niños
🌙 Días de estancia (noches de hotel)
🎫 Costo estándar del vuelo (tarifa base por adulto)
🏨 Costo estándar de hospedaje (tarifa base por noche por adulto) */

import Java.util.Scanner;

    public class cotizadorViajes {


    public static void main(string[] args ){

    Scaner scan = new Scanner(System.in);
    herramientasCalculos hc = new herramientasCalculos();
    
    
    System.out.println("Cantidad de Adultos:");
    cAdultos = scan.nextInt;

    System.out.println("Cantidad de Niños:");
    cNiños =scan.nextInt; 

    System.out.println("Noches en el Hotel:");
    nHotel =scan.nextInt;

    System.out.println("Costo Estandar del Vuelo:");
    cEstandarVuelo =scan.nextInt;

    System.out.println("Costo Estandar del Hospedaje:");
    cEstandarHospedaje =scan.nextInt;

    Costoviajetotal= herramientasCalculos.CostoVuelo(cNiños,cAdultos,cEstandarVuelo);

    Costonochestotal= herramientasCalculos.CostoHospedaje(cNiños,cAdultos,cEstandarHospedaje);

    CostoTotalViaje= herramientasCalculos.CostoTotal(cNiños,cAdultos,cEstandarVuelo,cEstandarHospedaje);

    Costonochestotal= herramientasCalculos.tarifa(cNiños,cAdultos,cEstandarVuelo,cEstandarHospedaje);

    Costonochestotal= herramientasCalculos.tarifa(cNiños,cAdultos,cEstandarVuelo,cEstandarHospedaje);

    System.out.println("El costo total por la familia en el viaje es de $" + Costoviajetotal);

    System.out.println("El costo total por la familia por las noches es de $" + Costonochestotal );

    System.out.println("El costo total por la familia del viaje sin intereses es de $" + CostoTotalViaje );


    
    }
}
