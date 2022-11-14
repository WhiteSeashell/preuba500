public class empanada extends comida {

    public empanada(boolean tienemani, double precio, double vencimiento, double peso) {
        this.setTieneMani(tienemani);
        this.setPrecio(precio);
        this.setVencimiento(vencimiento);
        this.setPeso(peso);
    }


    @Override
    public void show() {
        System.out.println("usd a elegido show de la empanada");
    }

    public void algo(){
        System.out.printf("su empanada tiene mani %b",isTieneMani());
    }
}
