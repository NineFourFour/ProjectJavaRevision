package questionsETS;

public class VariablesInitialisation {
	
	private int privateVar;
	public int publicVar;
	protected int protectedVar;
	int defaultVar;
	
	/*	if finalVar not initialized on the same line as it's declared then it has to be initialized in all constructors
	 * 	
	 * 	
	 * 
	 * 	
	 * */
	final int finalVar = 10;
	
	/*	if finalVar is initialised on the same line then you can't reassign it a value inside an initialization block
	 * 	because it's final
	 */
	  
	{
		//finalVar =190;
	
	}
	
	private static int privateStaticVar;
	public static int publicStaticVar;
	protected static int protectedStaticVar;
	static int defaultStaticVar;
	
	/*	
	 * 	Initialize staticFinalVar either on the same line or in a static
	 * 	initialization block
	 * 
	 * 	no where else
	 * 
	 * */
	static final int staticFinalInt;
	static{
		staticFinalInt = 120;
	}


	
	public VariablesInitialisation(){
		//finalVar = 10;
	}
	
	public VariablesInitialisation(int publicVar, int protectedVar, int defaultVar, int finalVar) {
		super();
	
		this.publicVar = publicVar;
		this.protectedVar = protectedVar;
		this.defaultVar = defaultVar;
		//this.finalVar = finalVar;
	}
	
	public VariablesInitialisation(int privateVar, int publicVar, int protectedVar, int defaultVar, int finalVar) {
		super();
		this.privateVar = privateVar;
		this.publicVar = publicVar;
		this.protectedVar = protectedVar;
		this.defaultVar = defaultVar;
		//this.finalVar = finalVar;
	}
	public void localVar(){
		int var;
		if(true){
			var = 10;
		}
		
		
	}

	public int getPrivateVar() {
		return privateVar;
	}

	public void setPrivateVar(int privateVar) {
		this.privateVar = privateVar;
	}

	public int getPublicVar() {
		return publicVar;
	}

	public void setPublicVar(int publicVar) {
		this.publicVar = publicVar;
	}

	public int getProtectedVar() {
		return protectedVar;
	}

	public void setProtectedVar(int protectedVar) {
		this.protectedVar = protectedVar;
	}

	public int getDefaultVar() {
		return defaultVar;
	}

	public void setDefaultVar(int defaultVar) {
		this.defaultVar = defaultVar;
	}

	public static int getPrivateStaticVar() {
		return privateStaticVar;
	}

	public static void setPrivateStaticVar(int privateStaticVar) {
		VariablesInitialisation.privateStaticVar = privateStaticVar;
	}

	public static int getPublicStaticVar() {
		return publicStaticVar;
	}

	public static void setPublicStaticVar(int publicStaticVar) {
		VariablesInitialisation.publicStaticVar = publicStaticVar;
	}

	public static int getProtectedStaticVar() {
		return protectedStaticVar;
	}

	public static void setProtectedStaticVar(int protectedStaticVar) {
		VariablesInitialisation.protectedStaticVar = protectedStaticVar;
	}

	public static int getDefaultStaticVar() {
		return defaultStaticVar;
	}

	public static void setDefaultStaticVar(int defaultStaticVar) {
		VariablesInitialisation.defaultStaticVar = defaultStaticVar;
	}

	public int getFinalVar() {
		return finalVar;
	}

	public static int getStaticfinalint() {
		return staticFinalInt;
	}
	
	
	
	
	
	
	
	
	
	

}
