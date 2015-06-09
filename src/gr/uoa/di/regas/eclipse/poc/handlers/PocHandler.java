package gr.uoa.di.regas.eclipse.poc.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 *
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class PocHandler extends AbstractHandler {

	/** The constructor. */
	public PocHandler() {}

	/**
	 * the command has been executed, so extract the needed information from the
	 * application context.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
			.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(window.getShell(), "Eclipse Plug-in Poc",
			"Hello, Eclipse world");
		return null;
	}
}
