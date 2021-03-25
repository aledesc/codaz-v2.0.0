package com.srvw.sse.domain;

public interface IComponente
{
    int getIndex();
    int getDiametro();
    int getCantidad();
    String getOtro();

    String toString();
    void add(int n);
    void remove(int n);
}
