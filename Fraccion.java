public class Fraccion implements IFraccion{

    private int num;
    private int den;
    

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
    }


    public Fraccion() {
        num = den= 0;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public int getDen() {
        return den;
    }


    public void setDen(int den) {
        this.den = den;
    }

@Override
public String toString(){
    return "[" + num + "/" + den +"]";
}

@Override

public Fraccion suma (Fraccion fraccion1, Fraccion fraccion2){
    return new Fraccion(
        (fraccion1.getNum() + fraccion2.getNum()),
        (fraccion1.getDen() + fraccion2.getDen()));
}

@Override

public Fraccion resta (Fraccion fraccion1, Fraccion fraccion2){
    return new Fraccion(
        (fraccion1.getNum() - fraccion2.getNum()),
        (fraccion1.getDen() - fraccion2.getDen()));
}

@Override

public Fraccion multiplicacion (Fraccion fraccion1, Fraccion fraccion2){
    return new Fraccion(
        (fraccion1.getNum() * fraccion2.getNum()),
        (fraccion1.getDen() * fraccion2.getDen()));
}


@Override

public Fraccion division (Fraccion fraccion1, Fraccion fraccion2){
    return new Fraccion(
        (fraccion1.getNum() / fraccion2.getNum()),
        (fraccion1.getDen() / fraccion2.getDen()));
}
}