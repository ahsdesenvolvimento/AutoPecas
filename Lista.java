/*
 André Henrique Sousa
 */
package autopecas;
public class Lista {
    private Pecas list[];
    private int count;
    
    public Lista(int capMax)
    {
        this.list = new Pecas[capMax];
        this.count = 0;

    }
   //Realiza a busca na lista pelo código 
   public int buscarCodigo(int codigo)
    {
                int index = 0;

        for (Pecas p : this.list) {

            if (p != null) {
                if (p.getCod() == codigo) {
                    return index;
                }
            }
            index++;
        }
        return -1;
    }
    
    public void adicionarPeca(Pecas pc)
    {
         if (buscarCodigo(pc.getCod()) == -1) {
            if (this.count < this.list.length) {
                this.list[this.count] = pc;
                this.count++;
                
            }
        }
    }
    //Adiciona unidades a um produto da lista
    public void acrescentarUnidades(int cod, int qtd)
    {
         for (Pecas p : this.list) {

            if (p != null) {
                if (p.getCod() == cod) {
                    p.setQtd(p.getQtd() + qtd);
                }
    }
         }
         }
    // Remove unidades de produtos na lista
    public void retirarUnidades(int cod, int qtd) throws MinimoException
    {
        for (Pecas p : this.list) {
            
            if(p != null){
                if (p.getCod() == cod && p.getQtd() < qtd) 
        {
                  
            throw new MinimoException();
        }

            if (p != null) {
                if (p.getCod() == cod && p.getQtd() > qtd) {
                    p.setQtd(p.getQtd() - qtd);
                    
                }
    }
        }
    }
    }
    
      public void relatorioReposicao(int qtdMin) {
        for (Pecas p : this.list) {
            if (p != null) {
                if (p.getQtd() < qtdMin) {
                    p.print();
                }
            }
        }
}
}