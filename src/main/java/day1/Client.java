package day1;

public class Client {

	private Log log;
	
	public void setLog(Log log){
		this.log = log;		
	}
	
	public void bizLogic(String args){
		log.write(args);		
	}
}
