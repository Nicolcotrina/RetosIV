import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Circulo;
import figuras.Pentagono;
import figuras.Rectangulo;
import figuras.Triangulo;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Entre al servlet");
        String control = req.getParameter("control");
        System.out.println(control);
        switch (control) {
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "circulo":
                req.getRequestDispatcher("Formucirculo.jsp").forward(req, resp);
                break;
            case "triangulo":
                req.getRequestDispatcher("Formutriangulo.jsp").forward(req, resp);
                break;
            case "rectangulo":
                req.getRequestDispatcher("Formurectangulo.jsp").forward(req, resp);
                break;
            case "pentagono":
                req.getRequestDispatcher("Formupentagono.jsp").forward(req, resp);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entre al do post");
        String control = req.getParameter("control");
        System.out.println("El control es:" + control);
        switch (control) {
            case "areatri":
                double base = Double.parseDouble(req.getParameter("base"));
                double altura = Double.parseDouble(req.getParameter("altura"));

                Triangulo tri = new Triangulo(base, altura, 0.0);

                req.setAttribute("area", tri.calcularArea());
                System.out.println("El area es:" + tri.calcularArea());
                req.getRequestDispatcher("respuesta.jsp").forward(req, resp);
                break;

            case "arearec":
                double base1 = Double.parseDouble(req.getParameter("base"));
                double altura1 = Double.parseDouble(req.getParameter("altura"));

                Rectangulo rec = new Rectangulo(base1, altura1,0.0);

                req.setAttribute("area", rec.calcularArea());
                System.out.println("El area es:" + rec.calcularArea());
                req.getRequestDispatcher("respuesta.jsp").forward(req, resp);
                break;
            case "areacir":
                double radio = Double.parseDouble(req.getParameter("radio"));
                Circulo cir = new Circulo(radio);
                req.setAttribute("area", cir.calcularArea());
                System.out.println("El area es:" + cir.calcularArea());
                req.getRequestDispatcher("respuesta.jsp").forward(req, resp);
                break;
            case "areapen":
                double perimetro = Double.parseDouble(req.getParameter("perimetro"));
                double apotema = Double.parseDouble(req.getParameter("apotema"));
                Pentagono pen = new Pentagono(perimetro, apotema, 0.0);
                req.setAttribute("area", pen.calcularArea());
                System.out.println("El area es:" + pen.calcularArea());
                req.getRequestDispatcher("respuesta.jsp").forward(req, resp);
                break;
        }
        switch (control) {
            case "perimcir":
                double radio = Double.parseDouble(req.getParameter("radio"));
                Circulo circ = new Circulo(radio);
                req.setAttribute("perimetro", circ.calcularPerimetro());
                System.out.println("El perimetro es:" + circ.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
            case "perimpen":
                double longitud = Double.parseDouble(req.getParameter("longitud"));
                Pentagono pen = new Pentagono(0.0, 0.0, longitud);
                req.setAttribute("perimetro", pen.calcularPerimetro());
                System.out.println("El perimetro es:" + pen.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
            case "perimtri":
                double longitud1 = Double.parseDouble(req.getParameter("longitud1"));
                Triangulo tri = new Triangulo(0.0, 0.0, longitud1);
                req.setAttribute("perimetro", tri.calcularPerimetro());
                System.out.println("El perimetro es:" + tri.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
                 case "perimrec":
                double longitud2 = Double.parseDouble(req.getParameter("longitud2"));
                Rectangulo rec = new Rectangulo(0.0, 0.0, longitud2);
                req.setAttribute("perimetro", rec.calcularPerimetro());
                System.out.println("El perimetro es:" + rec.calcularPerimetro());
                req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
                break;
        }
    }
}
