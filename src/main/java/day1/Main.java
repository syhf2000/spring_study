package day1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		Log log = new DefaultLog();
		client.setLog(log);
		client.bizLogic("testlog");
		
		log = new PrettyLog();
		client.setLog(log);
		client.bizLogic("testlog");
	}

}
