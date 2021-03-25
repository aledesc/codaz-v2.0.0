package com.srvw.sse.domain;

import java.util.List;

public interface IDispositivo
{
    int getCantidadRamales();
    int getTipo();
    int getComponentePrincipal();
    
    String getFamilia();

    Integer getLongitud();
    Integer getLongitudSistema();
    
    Double getDiametro();

    String getReferencia();
    String getCodAleman();
    String getIdElectronica();

    int getDepartamento();

    String getDescripcion();

    String getNoSerie();
    int getFabricante();

    String getObservaciones();
    String getOtros();

    Componente getComponenteSuperior();
    List<Ramal> getRamales();
    
    

}