/**
* Copyright (c) 2021, Angel. All rights reserved.
* Use is subject to license terms.
*/
package Contornos.Examen_17M;

/**
 * Calcula el periodo de oscilación (en segundos) y la frecuencia en
 * Hercios(Hz) de un <b>péndulo</b> dada su longitud, y la gravedad del planeta
 * en el que te
 * encuentres.
 * 
 * @author Angel
 * @version 1.0
 * @see https://es.wikipedia.org/wiki/P%C3%A9ndulo
 */
class Pendulo {
    float longitud;

    /**
     * Se declara la longitud de la cuerda
     * 
     * @param longitud en metros
     */
    public Pendulo(float longitud) {
        super();
        this.longitud = longitud;
    }

    /**
     * Este método calcula el periodo de oscilación del péndulo
     * 
     * @param gravedad la gravedad del planeta en el que te encuentres
     * @return el periodo
     * @throws ArithmeticException lanzamos una excepción cuando el péndulo no tenga
     *                             longitud correcta o el periodo sea infinito
     */
    double getPeriodo(float gravedad) throws ArithmeticException {
        if (longitud < 0)
            throw new ArithmeticException("El pendulo no tiene lontigud correcta");
        if (gravedad <= 0)
            throw new ArithmeticException("El periodo es infinito");
        return 2 * Math.PI * Math.sqrt(longitud / gravedad);

    }

    /**
     * Este método calcula el periodo de oscilación del péndulo
     * 
     * @param gravedad la gravedad del planeta en el que te encuentres
     * @return el periodo
     * @throws ArithmeticException lanzamos una excepción cuando el péndulo no tenga
     *                             longitud correcta o el periodo sea infinito
     */
    double getFrecuencia(float gravedad) {
        if (longitud < 0)
            throw new ArithmeticException("El pendulo no tiene lontigud correcta");
        if (gravedad <= 0)
            throw new ArithmeticException("El periodo es infinito");
        return 1 / getPeriodo(gravedad);
    }

    /**
     * Este método calcula la aceleración angular del péndulo
     * 
     * @param gravedad       gravedad del planeta en el que te encuentres
     * @param anguloEnGrados ángulo del péndulo en grados
     * @return aceleración angular en m/s^2
     */
    double getAceleracionAngular(float gravedad, int anguloEnGrados) {
        if (longitud < 0)
            return 0;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        return -(gravedad / longitud) * Math.sin(anguloEnRadianes);
    }
}
