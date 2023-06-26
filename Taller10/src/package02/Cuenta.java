package package02;

/**
 *
 * @author Joseph
 */
import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private String nombreCliente;
    private static double iva;
    private static List<Menu> menus;
    private static double subtotal;
    private static double valorTotal;

    public Cuenta(String nombreCliente, double iva) {
        this.nombreCliente = nombreCliente;
        this.iva = iva;
        this.menus = new ArrayList<>();
        this.subtotal = 0.0;
        this.valorTotal = 0.0;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public static void agregarMenu(Menu menu) {
        menus.add(menu);
        menu.calcularValorMenu();
        subtotal += menu.getValorMenu();
        calcularTotal();
    }

    private static void calcularTotal() {
        valorTotal = subtotal + (subtotal * (iva / 100));
    }

    public void imprimirFactura() {
        System.out.println("Factura");
        System.out.println("Cliente: " + nombreCliente);

        for (Menu menu : menus) {
            System.out.println(menu);
        }

        System.out.println();
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva + "%");
        System.out.println("Total a pagar: " + valorTotal);
    }
}
