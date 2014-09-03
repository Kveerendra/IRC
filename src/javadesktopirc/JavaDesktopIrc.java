/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javadesktopirc;

import java.io.IOException;
import java.io.StringReader;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;

/**
 *
 * @author veerendra
 */
public class JavaDesktopIrc  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, BadLocationException {
        Main m = new Main();
        JTextPane text_panel = m.getjTextPane1();
        HTMLEditorKit kit = new HTMLEditorKit();
        HTMLDocument doc = new HTMLDocument();
    text_panel.setEditorKit(kit);
    text_panel.setDocument(doc);
    kit.insertHTML(doc, doc.getLength(), "<b>hello", 0, 0, HTML.Tag.B);
    kit.insertHTML(doc, doc.getLength(), "<font color='red'><u>wor<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />l<br />ld</u></font>", 0, 0, null);
    m.setVisible(true);
        
    }
    
}
