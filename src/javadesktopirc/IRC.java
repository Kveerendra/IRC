/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesktopirc;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

/**
 *
 * @author veerendra
 */
public class IRC {

    SecureVirus window;

    IRC(SecureVirus s) {
        window = s;
       //Setup this bot
        Configuration configuration = new Configuration.Builder()
                .setName("VIRUS") //Set the nick of the bot. CHANGE IN YOUR CODE
                .setAutoNickChange(true) //Automatically change nick when the current one is in use
                .setCapEnabled(true) //Enable CAP features
                .addListener(new PircBotListner(s)) //This class is a listener, so add it to the bots known listeners
                .setServerHostname("irc.freenode.net")
                .addAutoJoinChannel("#MSIT2012")
                .buildConfiguration();
        PircBotX bot = new PircBotX(configuration);
        
        try {
            bot.startBot();
        } catch (IOException ex) {
            Logger.getLogger(IRC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IrcException ex) {
            Logger.getLogger(IRC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
