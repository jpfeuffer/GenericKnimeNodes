/**
 * Copyright (c) 2011-2013, Marc Röttig, Stephan Aiche.
 *
 * This file is part of GenericKnimeNodes.
 * 
 * GenericKnimeNodes is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.genericworkflownodes.knime.nodes.io.outputfile;

import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.knime.core.node.ExternalApplicationNodeView;
import org.knime.core.node.NodeView;

import com.genericworkflownodes.knime.nodes.io.listimporter.ListMimeFileImporterNodeModel;

/**
 * <code>NodeView</code> for the "MimeFileExporter" Node.
 * 
 * 
 * @author roettig
 */
public class ExternalViewerNodeView extends ExternalApplicationNodeView<OutputFileNodeModel> {

    /**
     * Creates a new view.
     * 
     * @param nodeModel
     *            The model (class: {@link ListMimeFileImporterNodeModel})
     */
    protected ExternalViewerNodeView(final OutputFileNodeModel nodeModel) {
        super(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void modelChanged() {
        try {
            super.callCloseView();
            openFile();
        } catch (IOException e) {
            getLogger().error(
                    "Could not open the folder for the selected output files.");
            getLogger().error(e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void openFile() throws IOException {
        String f_name = getNodeModel().m_filename.getStringValue();
        if (!"".equals(f_name)) {
            File f = new File(f_name);
            if (f.getParentFile() != null)
                Desktop.getDesktop().open(f);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onClose() {
    }
    
    
    

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onOpen(String title) {
        try {
            openFile();
        } catch (IOException e) {
            getLogger().error(
                    "Could not open the folder for the selected output files.");
            getLogger().error(e.getMessage());
            e.printStackTrace();
        }
    }
}
