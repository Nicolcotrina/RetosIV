package figuras;

public class Circulo extends Figura{
    private double radio;
    private double pi=3.14;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
     @Override
    public double calcularArea(){
        double area=(pi*radio*2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro=(2*pi*radio);
        return perimetro;
    }

}