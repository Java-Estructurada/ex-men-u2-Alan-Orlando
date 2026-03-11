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
    int cN,cA;
    dNiños = cAdultos * 0.30;
    cN = dNiños * cNiños;
    cA= cAdultos * cEstandarHospedaje;
    tnoche=cN + cA;
    tnoches = tnoche * nHotel;
    return tnoches; 
    }

    



}
