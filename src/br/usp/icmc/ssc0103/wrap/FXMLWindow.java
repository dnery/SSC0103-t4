package br.usp.icmc.ssc0103.wrap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class FXMLWindow extends Stage
{
    public FXMLWindow(FXMLController controller, URL fxml, Window owner)
    {
        this(controller, fxml, owner, StageStyle.DECORATED);
    }

    public FXMLWindow(FXMLController controller,
                      URL fxml,
                      Window owner,
                      StageStyle style)
    {
        super(style);
        initOwner(owner);
        initModality(Modality.WINDOW_MODAL);
        FXMLLoader loader = new FXMLLoader(fxml);

        try {
            loader.setControllerFactory(param -> controller);
            setScene(new Scene(loader.load()));
            setTitle("Forever Untitled");
            controller.setView(this);
        } catch (IOException e) {
            System.err.println("Error Loading FXML...");
        }
    }
}
