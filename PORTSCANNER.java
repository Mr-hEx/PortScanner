
import java.io.IOException;
import java.net.Socket;

class a implements Runnable {
String x = "127.0.0.1";
    @Override
public void run(){
  for (int i = 0; i < 13107; i++){
    try {
        Socket s = new Socket(x,i);
        System.out.println("IP : " + x + ":"+ i+" open");
	s.close();
        } catch (IOException ex) {
        
        }
  }
}


}

class b implements Runnable{

    String x = "127.0.0.1";
    @Override
public void run(){
  for (int i = 13108; i < 26214; i++){
    try {
        Socket s = new Socket(x,i);
        System.out.println("IP : " + x + ":"+ i+" open");
	s.close();
        } catch (IOException ex) {
        
        }
  }
}
}

class c implements Runnable{
  
   String x = "127.0.0.1";
    @Override
public void run(){
  for (int i = 26215; i < 39321; i++){
    try {
        Socket s = new Socket(x,i);
        System.out.println("IP : " + x + ":"+ i+" open");
	s.close();
        } catch (IOException ex) {
        
        }
  }
}

}


class d implements Runnable{
String x = "127.0.0.1";
    @Override
public void run(){
  for (int i = 39322; i < 52428; i++){
    try {
        Socket s = new Socket(x,i);
        System.out.println("IP : " + x + ":"+ i+" open");
	s.close();
        } catch (IOException ex) {
        
        }
  }
}

}


class e implements Runnable{
String x = "127.0.0.1";
    @Override
public void run(){
  for (int i = 52429; i < 65536; i++){
    try {
        Socket s = new Socket(x,i);
        System.out.println("IP : " + x + ":"+ i+" open");
	s.close();
        } catch (IOException ex) {
        
        }
  }
}

}



public class PORTSCANNER {
    public static void main(String[] args) {
        Runnable R1 = new a();
        Runnable R2 = new b();
        Runnable R3 = new c();
        Runnable R4 = new d();
        Runnable R5 = new e();
        Thread thread1 = new Thread(R1);
        Thread thread2 = new Thread(R2);
        Thread thread3 = new Thread(R3);
        Thread thread4 = new Thread(R4);
        Thread thread5 = new Thread(R5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        
    }
    
}

