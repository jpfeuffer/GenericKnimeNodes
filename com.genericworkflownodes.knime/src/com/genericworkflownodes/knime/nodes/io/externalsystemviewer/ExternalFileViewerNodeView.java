/*
 * Copyright (c) 2011, Marc Röttig.
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

package com.genericworkflownodes.knime.nodes.io.externalsystemviewer;

import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.knime.core.node.ExternalApplicationNodeView;
import org.knime.core.node.NodeView;

import com.genericworkflownodes.knime.nodes.io.listimporter.ListMimeFileImporterNodeModel;

/**
 * <code>NodeView</code> for the "MimeFileImporter" Node.
 * 
 * 
 * @author roettig
 */
public class ExternalFileViewerNodeView extends ExternalApplicationNodeView<ExternalFileViewerNodeModel> {

    /**
     * Creates a new view.
     * 
     * @param nodeModel
     *            The model (class: {@link ListMimeFileImporterNodeModel})
     */
    protected ExternalFileViewerNodeView(final ExternalFileViewerNodeModel nodeModel) {
        super(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void modelChanged() {

        // TODO retrieve the new model from your nodemodel and
        // update the view.
        ExternalFileViewerNodeModel nodeModel = (ExternalFileViewerNodeModel) getNodeModel();
        assert nodeModel != null;

        // be aware of a possibly not executed nodeModel! The data you retrieve
        // from your nodemodel could be null, emtpy, or invalid in any kind.

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onClose() {

        // TODO things to do when closing the view
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onOpen(String title) {

        // TODO things to do when opening the view
    }

}
