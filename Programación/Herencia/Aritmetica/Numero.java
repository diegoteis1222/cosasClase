public class Numero {

    protected int num;

    public Numero(int num) {
        this.num = num;
    }

    public Numero sumar(Numero numero) {
        return new Numero(this.getNum() + numero.getNum());
    }

    public Numero restar(Numero numero) {
        return new Numero(this.getNum() - numero.getNum());
    }

    public Numero multiplicar(Numero numero) {
        return new Numero(this.getNum() * numero.getNum());
    }

    public Numero dividir(Numero numero) {
        return new Numero(this.getNum() / numero.getNum());
    }

    @Override
    public String toString() {
        return "Numero [num=" + num + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + num;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Numero other = (Numero) obj;
        if (num != other.num)
            return false;
        return true;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}