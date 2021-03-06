package br.usp.icmc.ssc0103;

import br.usp.icmc.ssc0103.net.ServerContext;
import javafx.application.Application;
import javafx.stage.Stage;

public class ServerApp extends Application
{
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        ServerContext.getContext();
        DefaultDatabase.getInstance();
        DefaultConfig.getConfig().setPrimaryStage(primaryStage);
        DefaultConfig.getConfig().serverGUI().show();
    }
}
