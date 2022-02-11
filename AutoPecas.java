/*
 André Henrique Sousa 
 */
package autopecas;
public class AutoPecas {
    public static void main(String[] args) {
         try{
        Lista lista = new Lista(4);
        Pecas p1 = new Pecas(1, "Chave de Roda", 20, 15.4);
        Pecas p2 = new Pecas(2, "Protetor de porta", 15, 3.75);
        Pecas p3 = new Pecas (3, "Kit de capa para bancos", 3, 0.75);
        Pecas p4 = new Pecas (4, "Kit lavagem", 1, 1);
                        
        lista.adicionarPeca(p1);
        lista.adicionarPeca(p2);
        lista.adicionarPeca(p3);
        lista.adicionarPeca(p4);

        lista.acrescentarUnidades(2,3);
        lista.relatorioReposicao(27);
        lista.acrescentarUnidades(3,2);
        lista.relatorioReposicao(27);
        lista.retirarUnidades(1,3);
        lista.relatorioReposicao(27);
        lista.retirarUnidades(1, 10);
        lista.retirarUnidades(1, 10);
        lista.retirarUnidades(1, 10);
        lista.retirarUnidades(4, 2);
        lista.relatorioReposicao(5);
        
       
        lista.buscarCodigo(1);
    }
         catch(MinimoException exc)
        {
            System.out.println(exc);
        }
            
           
    }
   
    
}
 
    
    

