public abstract class comida extends comprable {
    private double vencimiento;
    private boolean tieneMani;

    public void escogersabor(String sabor) {
        System.out.printf("Usted ha escogido el sabor %s", sabor);
    }

    public double getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(double vencimiento) {
        this.vencimiento = vencimiento;
    }

    public boolean isTieneMani() {
        return tieneMani;
    }

    public void setTieneMani(boolean tieneMani) {
        this.tieneMani = tieneMani;
    }
}

