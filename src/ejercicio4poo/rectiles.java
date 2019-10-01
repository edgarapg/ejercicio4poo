package ejercicio4poo;
import javax.swing.JOptionPane;
public class rectiles extends Ejercicio4poo{
    private String alimento;    
    private String hubicacion;
    @Override
    public void imprimir(){
     super.imprimir();   
   JOptionPane.showMessageDialog(null, getAlimento());
   JOptionPane.showMessageDialog(null, getHubicacion());
             
 }

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    /**
     * @return the hubicacion
     */
    public String getHubicacion() {
        return hubicacion;
    }

    /**
     * @param hubicacion the hubicacion to set
     */
    public void setHubicacion(String hubicacion) {
        this.hubicacion = hubicacion;
    }
}
