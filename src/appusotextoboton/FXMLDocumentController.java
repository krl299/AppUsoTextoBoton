/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Carlos
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private CampoTextoBoton campo1;
    @FXML
    private CampoTextoBoton campo2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText("");
        campo1.setText("Nombre");
        campo2.setText("Apellido");
       
        campo2.addEventHandler(EventType.ROOT, new EventHandler<Event>() {
            @Override
            public void handle(Event eventHandler) {
                if (eventHandler.getEventType().getName().equalsIgnoreCase("Action")) {
                    label.setText(campo2.getText() + " guardado");
                }
            }
        });
        campo1.addEventHandler(EventType.ROOT, new EventHandler<Event>() {
            @Override
            public void handle(Event eventHandler) {
                if (eventHandler.getEventType().getName().equalsIgnoreCase("Action")) {
                    label.setText(campo1.getText() + " guardado");
                }
            }
        });
    }

}