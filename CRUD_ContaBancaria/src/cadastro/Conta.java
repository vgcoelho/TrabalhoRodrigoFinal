package cadastro;
import java.text.DecimalFormat;
public class Conta {
    
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private int id;
    private double deposito;
    private String numero;
    private String nome;
    private String data;
    public double saldo;
    private double total=0;
    private double tranfere;
    private boolean  saca;
    
    
    
   

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", saldo=" + saldo + ", numero=" + numero + ", nome=" + nome + ", data=" + data + '}';
    }

   

    public void setId(int id) {
        this.id = id;
    }

   

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSaldo() {
    
       DecimalFormat df = new DecimalFormat("#.##");      
     
       return Double.parseDouble(df.format(saldo).replace(",", "."));
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        public Conta(){
            
        }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

    public double getTranfere() {
        return tranfere;
    }

    public void setTranfere(double tranfere) {
        this.tranfere = tranfere;
    }

    public boolean getSaca() {
        return saca;
    }

   

    public boolean isSaca() {
        return saca;
    }

    public void setSaca(boolean saca) {
        this.saca = saca;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

   

    
    
}
