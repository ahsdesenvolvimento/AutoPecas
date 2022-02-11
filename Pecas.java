/*
 André Henrique Sousa 
 */
package autopecas;
public class Pecas {
    private int cod;
    private String descr;
    private int qtd;
    private double peso;
// Construtor
    //
    public Pecas(int cod, String descr, int qtd, double peso) 
    {
        this.cod = cod;
        this.descr = descr;
        this.qtd = qtd;
        this.peso = peso;
    }
    
    // Setters
    //

    public void setCod(int cod) 
    {
        this.cod = cod;
    }

    public void setDescr(String descr) 
    {
        this.descr = descr;
    }

    public void setQtd(int qtd) 
    {
        this.qtd = qtd;
    }
    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    // Getters
    //

    public int getCod() 
    {
        return cod;
    }

    public String getDescr() 
    {
        return descr;
    }

    public int getQtd() 
    {
        return qtd;
    }
       public double getPeso() 
    {
        return peso;
    }

    // Métodos
    //
    @Override
    public String toString()
    {
        return cod + "\t" + qtd + "\t" + descr + "\t" + peso;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
}
