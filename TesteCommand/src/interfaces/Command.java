package interfaces;

import concrets.Application;
import concrets.Editor;

public abstract class Command {

	 protected Application app;
	    protected Editor editor;
	    protected String backup;

	   public Command(Application app, Editor editor) {
	        this.app = app;
	        this.editor = editor;
	   }
	    // Faz um backup do estado do editor.
	    public void saveBackup() {
	        backup = editor.text;
	    }
	    // Restaura o estado do editor.
	    public void undo() {
	        editor.text = backup;
	    }
	    // O m�todo de execu��o � declarado abstrato para for�ar
	    // todos os comandos concretos a fornecer suas pr�prias
	    // implementa��es. O m�todo deve retornar verdadeiro ou
	    // falso dependendo se o comando muda o estado do editor.
	    public abstract void execute();
}
