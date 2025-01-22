package Ejemplo1;
public class Empleados {
     //Atributos
    public String codigo;
    public String nombre;
    public String area;
    double sueldoBase;
    double horasExtras;
    String tipo_seg;
    //Valores comunes a todos los objetos 
    private static double porc_afp=0.11;
    private static double porc_snp=0.06;
    private static double porc_Essalud=0.03;
    private static int contador=0;
    //Constructor
    public Empleados(String codigo, String nombre, String area, double sueldoBase, double horasExtras, String seguro) {
        contador++;
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipo_seg = seguro;
    }
    //********************METODOS ADICIONALES************************
    //calculando el monto extra 
    public double montoHExtras(){
        return sueldoBase*horasExtras/240;
    }
    //calculando el monto de seguro
    public double montoSeguro(){
        if (tipo_seg.equalsIgnoreCase("AFP"))
            return sueldoBase*porc_afp;
        
        if (tipo_seg.equalsIgnoreCase("SNP"))
            return sueldoBase*porc_snp;
        return 0;
    }
    //calculando el monto de essalud 
    public double montoEssalud(){
        return sueldoBase*porc_Essalud;
    }
    //calculando el monto de descuentos
    public double montoDescuentos(){
        return montoSeguro()+montoEssalud();
    }
    //calculando el monto del sueldo bruto
    public double sueldoBruto(){
        return sueldoBase + montoHExtras();
    }
    //calculando el sueldo neto
    public double sueldoNeto(){
        return sueldoBruto()-montoDescuentos();
    }
    //obteniendo el numero de objetos generados por la clase
    public static int getContador(){
        return contador;
    }
}
