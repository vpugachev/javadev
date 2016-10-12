public class Calculator{
	
	private int result;
	
	public void add(int ... params){
		for (Integer param : params){
			this.result+=param;
		}
	}
	public int GetResult(){
		return this.result;
	}
	
	public void ClearResult(){
		this.result=0;
	}
	
	
}