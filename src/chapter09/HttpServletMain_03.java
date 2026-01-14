package chapter09;

public class HttpServletMain_03 {

	public static void main(String[] args) {
		
		service(new LoginService());
		service(new FileDownloadService());
		
	}

	//method
	public static void service(HttpServlet ser) {
		ser.service();
	}
	
}
