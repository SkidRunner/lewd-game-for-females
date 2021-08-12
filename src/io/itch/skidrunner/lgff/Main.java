package io.itch.skidrunner.lgff;

import com.jme3.app.SimpleApplication;
import com.jme3.renderer.RenderManager;
import com.jme3.system.AppSettings;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 *
 * @author SkidRunner
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        AppSettings cfg = new AppSettings(true);
        cfg.setFrameRate(60); // set to less than or equal screen refresh rate
        cfg.setVSync(true);   // prevents page tearing
        cfg.setFrequency(60); // set to screen refresh rate
        cfg.setResolution(1366, 768);
        cfg.setFullscreen(true);
        cfg.setSamples(2);    // anti-aliasing
        cfg.setTitle("Lewd Game for Females"); // branding: window name
        try {
            // Branding: window icon
            cfg.setIcons(new BufferedImage[]{ImageIO.read(new File("assets/Interface/Icon128.png"))});
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Icon missing.", ex);
        }
        // branding: load splashscreen from assets
        cfg.setSettingsDialogImage("Interface/SplashScreen512.png");
        //app.setShowSettings(false); // or don't display splashscreen
        app.setSettings(cfg);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(false);
        
        
    }

    @Override
    public void simpleUpdate(float tpf) {
    }

    @Override
    public void simpleRender(RenderManager rm) {
    }

}
