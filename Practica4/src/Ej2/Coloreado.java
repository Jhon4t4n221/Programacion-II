package Ej2;

import java.util.*;

//a) Interfaz
interface Coloreado {
 String comoColorear();
}

//b) Clase abstracta
abstract class Figura {
 protected String color;

 public Figura(String color) {
     this.color = color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 public String getColor() {
     return color;
 }

 @Override
 public String toString() {
     return "Figura de color: " + color;
 }

 public abstract double area();
 public abstract double perimetro();
}

//c) Clase Cuadrado
class Cuadrado extends Figura implements Coloreado {
 private double lado;

 public Cuadrado(double lado, String color) {
     super(color);
     this.lado = lado;
 }

 @Override
 public double area() {
     return lado * lado;
 }

 @Override
 public double perimetro() {
     return 4 * lado;
 }

 @Override
 public String comoColorear() {
     return "Colorear los cuatro lados";
 }

 @Override
 public String toString() {
     return "Cuadrado de lado " + lado + ", color " + color;
 }
}

//d) Clase Circulo
class Circulo extends Figura {
 private double radio;

 public Circulo(double radio, String color) {
     super(color);
     this.radio = radio;
 }

 @Override
 public double area() {
     return Math.PI * radio * radio;
 }

 @Override
 public double perimetro() {
     return 2 * Math.PI * radio;
 }

 @Override
 public String toString() {
     return "Círculo de radio " + radio + ", color " + color;
 }
}