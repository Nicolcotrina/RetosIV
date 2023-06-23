package figuras;

public class Pentagono extends Figura{
    private double perimetro;
    private double apotema;
    private double longitud;
    public Pentagono() {
    }
    public Pentagono(double perimetro, double apotema, double longitud) {
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.longitud= longitud;
    }
   
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    @Override
    public double calcularArea(){
        double area=(perimetro*apotema)/2;
        return area;
    
}
     @Override
    public double calcularPerimetro() {
        double perimetro=(longitud*5);
        return perimetro;
    }
}
