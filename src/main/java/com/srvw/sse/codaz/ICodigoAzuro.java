package com.srvw.sse.codaz;

public interface ICodigoAzuro
{
    String PROVEEDOR_SpanSet = "00";

    int CARACTERES_X_CODIGO = 15;
 
    int CARACTERES_X_FAMILIA = 3;
    int CARACTERES_X_DIAMETRO = 3;
    int CARACTERES_X_TONELAJE = 3;
    int CARACTERES_X_LONGITUD = 3;
    
    int POS_FAMILIA = 0;
    int POS_SUB_FAMILIA = 1;
    int POS_SUB_SUB_FAMILIA = 2;
    int POS_PROVEEDOR = 13;
    
    String getCodigo();
    
}
