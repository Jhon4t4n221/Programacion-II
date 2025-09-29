package Ej1;
import java.util.Scanner;

abstract class Empleado {
 protected String nombre;

 public Empleado(String nombre) {
     this.nombre = nombre;
 }

 public abstract double CalcularSalarioMensual();

 @Override
 public String toString() {
     return "Empleado: " + nombre;
 }
}

//Subclase Tiempo Completo
class EmpleadoTiempoCompleto extends Empleado {
 private double salarioAnual;

 public EmpleadoTiempoCompleto(String nombre, double salarioAnual) {
     super(nombre);
     this.salarioAnual = salarioAnual;
 }

 @Override
 public double CalcularSalarioMensual() {
     return salarioAnual / 12;
 }

 @Override
 public String toString() {
     return super.toString() + ", Salario Anual: " + salarioAnual +
            ", Salario Mensual: " + CalcularSalarioMensual();
 }
}

//Subclase Tiempo Horario
class EmpleadoTiempoHorario extends Empleado {
 private double horasTrabajadas;
 private double tarifaPorHora;

 public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
     super(nombre);
     this.horasTrabajadas = horasTrabajadas;
     this.tarifaPorHora = tarifaPorHora;
 }

 @Override
 public double CalcularSalarioMensual() {
     return horasTrabajadas * tarifaPorHora;
 }

 @Override
 public String toString() {
     return super.toString() + ", Horas: " + horasTrabajadas + 
            ", Tarifa: " + tarifaPorHora + 
            ", Salario Mensual: " + CalcularSalarioMensual();
 }
}
