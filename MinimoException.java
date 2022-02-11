/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas;

/**
 *
 * @author andre
 */
public class MinimoException extends Exception
{
    @Override
    public String toString()
    {
        return "Não existe produto para ser removido!!!";
    }
}

