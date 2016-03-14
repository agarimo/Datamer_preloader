package datamer.preloader;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Agarimo
 */
public class PreloaderC implements Initializable {
    
    @FXML
    public ProgressBar bar;
    
    @FXML
    public ImageView image;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       Image img = new Image(getClass().getResourceAsStream("DeathStar.png")); 
       image.setImage(img);
    }    
    
}
