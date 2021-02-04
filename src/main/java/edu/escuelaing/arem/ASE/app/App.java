package edu.escuelaing.arem.ASE.app;

import static spark.Spark.*;

/**
 * @author Johan Rueda
 */

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        port(getPort());
        post("/calculadora", (request, response) -> {
            linkedList list = new linkedList();
            Double list2[] = new Double[] {};
            String req = request.body(); //String en formato json

            String[] json = req.replace("\"", "").replace("[", "").replace("]", "").split(",");

            for (int i = 0; i < json.length; i++) {
                double value = Double.parseDouble(json[i]);
                list.adiccionar(value);
            }

            calculadora cal = new calculadora(list);

            return "{\"mean\":" + cal.media() + ", \"dev\":" + cal.desviacion() + "}";

        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
