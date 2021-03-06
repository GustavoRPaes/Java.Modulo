package modulo.teste.dois.interno;

public class Calculadora {

    private final DivHelper divHelper;
    private final MultHelper multHelper;
    private final SubHelper subHelper;
    private final SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum (int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub (int a, int b) {
        return subHelper.execute(a, b);
    }

    public int div (int a, int b) {
        return divHelper.execute(a, b);
    }

    public int multi(int a, int b) {
        return multHelper.execute(a, b);
    }
}
