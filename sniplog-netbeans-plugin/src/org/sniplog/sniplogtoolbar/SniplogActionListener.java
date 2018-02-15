/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sniplog.sniplogtoolbar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "org.sniplog.sniplogtoolbar.SniplogActionListener"
)
@ActionRegistration(
        iconBase = "org/sniplog/sniplogtoolbar/s-logo.png",
        displayName = "#CTL_SniplogActionListener"
)
@ActionReferences({
    @ActionReference(path = "Toolbars/File", position = 0)
    ,
  @ActionReference(path = "Shortcuts", name = "D-B")
})
@Messages("CTL_SniplogActionListener=Sniplog")
public final class SniplogActionListener extends AbstractAction implements Presenter.Toolbar {

    private Object o;

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }

    @Override
    public Component getToolbarPresenter() {
        
        return new SniplogPanel();
    }
}
