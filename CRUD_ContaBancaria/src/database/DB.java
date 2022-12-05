package database;

import cadastro.Conta;
import java.util.*;
import javax.swing.JOptionPane;

public class DB {

    private static List<Conta> lista = new ArrayList<>();
    private static int total = 0;
    private static int chaveSequencial = 0;
    
    private boolean saca;
    

    public void insert(Conta conta) {
        conta.setId(++chaveSequencial);
        DB.lista.add(conta);
        total++;
    }

    public List<Conta> getContas() {
        return DB.lista;
    }

    public Conta getContaById(Integer id) {
        for (Conta conta : lista) {
            if (conta.getId() == id) {
                return conta;
            }
        }

        return null;
    }

    public boolean delete(Integer id) {
        Iterator<Conta> it = lista.iterator();
        while (it.hasNext()) {
            Conta conta = it.next();
            if (conta.getId() == id) {
                it.remove();
                return true;
            }
        }

        return false;
    }

    public static int getTotal() {
        return total;
    }
    public boolean tranfere(Conta deconta, Conta paraconta, double valor ){
        
        boolean fezsaque=saca(deconta,valor);
         
        if(fezsaque){
        deposito(paraconta ,valor );
        JOptionPane.showMessageDialog(null,"Realizado " );
        return true;
        }else{
            JOptionPane.showMessageDialog(null,"nao deu para realizar ");
        }
        
        
        return false;
        
        
        
        
    }
    public boolean saca(Conta conta , double valor ){
        return true;
    }

    private void deposito(Conta paraconta, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
    
    
    
    
    


    
  
  
 


