/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javadesktopirc;

import org.pircbotx.hooks.Event;
import org.pircbotx.hooks.Listener;
import org.pircbotx.hooks.ListenerAdapter;

/**
 *
 * @author veerendra
 */
class PircBotListner extends ListenerAdapter {
SecureVirus window;
    public PircBotListner(SecureVirus s) {
        window =s;
    }

    @Override
    public void onEvent(Event event) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
