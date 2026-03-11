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
    return Total;    
    }

    public static int tarifa (int cNiños,int cAdultos, int cEstandarVuelo, int cEstandarHospedaje ){
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
    
    Tari=Total * 1.2;
    return Tari;    
    }

     public static int tarifaTotal (int cNiños,int cAdultos, int cEstandarVuelo, int cEstandarHospedaje ){
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
    
    Tari=Total * 1.2;
    tarifa=Total + tari;
    return Tari;    
    }




}
/*Comisión de la Agencia:

La agencia cobra una tarifa de servicio equivalente al 12% del Subtotal del viaje. */
