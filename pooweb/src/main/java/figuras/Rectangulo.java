package figuras;
public class Rectangulo extends Figura{
    private double base;
    private double altura;
    private double longitud;
    public Rectangulo() {
    }
    public Rectangulo(double base, double altura, double longitud) {
        this.base = base;
        this.altura = altura;
        this.longitud=longitud;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double baserec) {
        this.base = baserec;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        double area=base*altura;
        return area;
    }
     @Override
    public double calcularPerimetro() {
        double perimetro=(longitud*5);
        return perimetro;
    }
}