package edu.escuelaing.arem.ASE.app;

import static spark.Spark.*;

/**
 * @author Johan Rueda
 * Clase principal que lee el conjunto de datos ingresados, separado por comas ","
 */

public class App {

    /**
     * metodo principal que lee los datos
     * @param args principal
     */
    public static void main(String[] args) {
        staticFileLocation("/public");
        port(getPort());
        post("/calculadora", (request, response) -> {
            linkedList list = new linkedList();
            Double list2[] = new Double[] {};
            String req = request.body();

            String[] json = req.replace("\"", "").replace("[", "").replace("]", "").split(",");

            for (int i = 0; i < json.length; i++) {
                double value = Double.parseDouble(json[i]);
                list.adiccionar(value);
            }

            calculadora cal = new calculadora(list);

            return "{\"media\":" + cal.media() + ", \"desvi\":" + cal.desviacion() + "}";

        });
    }

    /**
     * metodo que nos retorna un puerto
     * @return entero que indica el puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
