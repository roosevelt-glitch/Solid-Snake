/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Tienda;

import javax.swing.JOptionPane;

/**
 *
 * @author alexm
 */
public class Pago {
    private double totalAPagar;
    private double montoPagado;

    // Constructor
    public Pago(double totalAPagar) {
        this.totalAPagar = totalAPagar;
        this.montoPagado = 0;
    }

    // Método para realizar el pago
    public void realizarPago() {
        while (montoPagado < totalAPagar) {
            String entrada = JOptionPane.showInputDialog(
                "Total a pagar: $" + String.format("%.2f", totalAPagar) +
                "\nMonto pagado: $" + String.format("%.2f", montoPagado) +
                "\nIngrese el monto a pagar:"
            );

            try {
                double monto = Double.parseDouble(entrada);
                if (monto <= 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un monto válido mayor a 0.");
                } else {
                    montoPagado += monto;
                    if (montoPagado >= totalAPagar) {
                        double cambio = montoPagado - totalAPagar;
                        JOptionPane.showMessageDialog(null, 
                            "Pago completado.\nCambio: $" + String.format("%.2f", cambio)
                        );
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, 
                            "Monto insuficiente. Aún debe: $" + String.format("%.2f", (totalAPagar - montoPagado))
                        );
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }
    }
}
