public class herramientasCalculos {


    public static int CostoVuelo (int cNiños,int cAdultos, int cEstandarVuelo ){
    int cN,cA;
    dNiños = cAdultos / 2;
    cN = dNiños * cNiños;
    cA= cAdultos * cEstandarVuelo;
    tViaje=cN + cA;
    return tViaje; 
    }

    public static int CostoHospedaje (int cNiños,int cAdultos, int cEstandarHospedaje ){
    int cNi,cAd;
    dNiños = cAdultos * 0.30;
    cNi = dNiños * cNiños;
    cAd= cAdultos * cEstandarHospedaje;
    tnoche=cNi + cAd;
    tnoches = tnoche * nHotel;
    return tnoches; 
    }

    public static int CostoTotal (int cNiños,int cAdultos, int cEstandarVuelo, int cEstandarHospedaje ){
    int cN,cA,cNi,cAd;
    dNiños = cAdultos / 2;
    cN = dNiños * cNiños;
    cA= cAdultos * cEstandarVuelo;
    tViaje=cN + cA;

    dNiños = cAdultos * 0.30;
    cNi = dNiños * cNiños;
    cAd= cAdultos * cEstandarHospedaje;
    tnoche=cNi + cAd;
    tnoches = tnoche * nHotel;

    Total = tnoches + tViaje;
    


    
    }


}
/*Subtotal del Viaje:

La suma exacta del costo total de vuelos y el costo total de hospedaje. */
