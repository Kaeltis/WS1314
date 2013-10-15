package oot.fruh_jando.geometrie;

import java.util.LinkedList;

/**
 * @author OOT_UIB_1
 */

public class Geo {
    private LinkedList<Geo> geos = new LinkedList<Geo>();


    protected double flaeche;
    protected double umfang;

    LinkedList<Geo> getGeos() {
        return geos;
    }

    void setGeos(Object object) {
        this.geos.add((Geo) object);
    }

    double getUmfang() {
        return umfang;
    }

    double getFlaeche() {
        return flaeche;
    }

    @Override
    public String toString() {
        return this.getClass().getName().substring(25);
    }

}
