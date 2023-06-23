package figuras;
public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double longitud;
    public Triangulo() {
    }
    public Triangulo(double base, double altura, double longitud) {
        this.base = base;
        this.altura = altura;
        this.longitud= longitud;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        double area=(base*altura)/2;
        return area;
    }
   @Override
    public double calcularPerimetro() {
        double perimetro=(longitud*3);
        return perimetro;
    }
}





