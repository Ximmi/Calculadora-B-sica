
package calculadora;

class Calculadora {

    private int num1;
    private int num2;
    
    int sumar(int op1, int op2)
    {
        return op1+op2;
    }
    int restar (int op1, int op2)
    {
        return op1-op2;
    }
    int multiplicar (int op1, int op2)
    {
        return op1*op2;
    }
    int dividir (int op1, int op2)
    {
        return op1/op2;
    }
    int elevar(int op1, int op2)
    {
        return op1^op2;
    }
}
