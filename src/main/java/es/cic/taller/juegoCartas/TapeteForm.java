package es.cic.taller.juegoCartas;

import com.vaadin.data.Binder;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class TapeteForm extends FormLayout{

	private VerticalLayout layout = new VerticalLayout();
	Baraja baraja=new Baraja();
    private TextField carta1 = new TextField("carta1");
    private TextField carta2 = new TextField("carta2");
    private TextField carta3 = new TextField("carta3");
    private TextField carta4 = new TextField("carta4");
    private Button boton=new Button("MUS");
    
  
    private MyUI myUI;
    
    public TapeteForm(MyUI myUI) {
        this.myUI = myUI;
        
        
        carta1.setValue(asignaMano());
        carta2.setValue(asignaMano());
        carta3.setValue(asignaMano());
        carta4.setValue(asignaMano());
        addComponents(carta1,carta2,carta3,carta4, boton);
        boton.addClickListener( e -> {
        	carta1.setValue(asignaMano());
            carta2.setValue(asignaMano());
            carta3.setValue(asignaMano());
            carta4.setValue(asignaMano());
        });
        
  
    }
    public String asignaMano() {
    	int num=(int) (Math.random()*40);
    	return (baraja.getCarta(num).getNumero()+" "+baraja.getCarta(num).getPalo());
    	
    }
 
    
}
