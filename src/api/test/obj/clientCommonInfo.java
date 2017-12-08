package api.test.obj;

public class clientCommonInfo {

	 private int  terminalSource ;
	 
	 public clientCommonInfo() {
		 
	 }
	
	 public clientCommonInfo(int terminalSource ) {
		 super();
		 this.terminalSource = terminalSource;
	 }

	public int getTerminalSource() {
		return terminalSource;
	}

	public void setTerminalSource(int terminalSource) {
		this.terminalSource = terminalSource;
	}
}
