package com.mycompany.figurasgeometricas;

public class Principal {

import java.util.Scanner;

public class Figuras {

    abstract class FiguraGeometrica {    
        protected String nombre;
        protected String color;
        
        public FiguraGeometrica(String nombre,String color){
            this.nombre=nombre;
            this.color=color;
            }
        public abstract double obArea();
        public abstract double obPeri();
        
        public String getNombre(){return nombre;}
        public void setNombre(String nombre){this.nombre=nombre;}
        
        public String getColor(){return color;}
        public void setColor(String color){this.color=color;}
        }
    class Círculo extends FiguraGeometrica{
        private double radio;
        
        public Círculo(String nombre,String color,double radio){
            super(nombre,color);
            this.radio=radio;
        }
        @Override
        public double obArea(){
            return Math.PI * radio * radio;
        }
        @Override
        public double obPeri(){
            return 2 * Math.PI * radio;
    }
    class Rectangulo extends FiguraGeometrica{
            private double lado1;
            private double lado2;
            
            public Rectangulo(String nombre,String color,double lado1,double lado2){
                super(nombre,color);
                this.lado1=lado1;
                this.lado2=lado2;
            }
            @Override
            public double obArea(){
                return lado1*lado2;
            }
            @Override
            public double obPeri(){
                return 2*(lado1+lado2);
            }
        }
    class Triangulo extends FiguraGeometrica{
        private double base;
        private double altura;
        
        public Triangulo(String nombre,String color,double base,double altura){
                super(nombre,color);
                this.base=base;
                this.altura=altura;
        }
        @Override
            public double obArea(){
                return (base*altura)/2;
    }
            @Override
            public double obPeri(){
                return 3*base;
     }
            }
    public class Main{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            Figuras figuras=new Figuras();
            System.out.println("Ingrese el nombre de la figura");
            String nombre=sc.nextLine();
            
            System.out.println("Ingrese el color de la figura");
            String color=sc.nextLine();
            
            System.out.println("Ingrese el tipo de figura = 1: Circulo, 2: Rectángulo, 3: Triángulo");
            int tipoFigura=sc.nextInt();
            
            Figuras.FiguraGeometrica figura = null;
            
            switch(tipoFigura){
                case 1:
                    System.out.println("Ingrese el radio del círculo");
                    double radio=sc.nextDouble();
                    figura=figuras.new Círculo(nombre,color,radio);
                break;
                case 2:
                    System.out.println("Ingrese el valor del lado 1 del rectángulo");
                    double lado1=sc.nextDouble();
                    System.out.println("“Ingrese el valor del lado 2 del rectángulo");
                    double lado2=sc.nextDouble();
                    figura=figuras.new Rectangulo(nombre,color,lado1,lado2);
                break;
                case 3:
                    System.out.println("Ingrese el valor de la base del triángulo");
                    double base=sc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triángulo");
                    double altura=sc.nextDouble();
                    figura=figuras.new Triangulo(nombre,color,base,altura);
                break;
                default:
                    System.out.println("opcion no valida es diferente a circulo,triangulo y rectangulo");
                    return;
            }
            System.out.println("El area es: " + figura.obArea());
        System.out.println("El Perímetro es: " + figura.obPeri());
        }
    }
    }
    }
