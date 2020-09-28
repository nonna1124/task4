package by.htp.les07.task03.main;

public class Task3 {
	
	  public static void main(String[] args) {
	    
	    Test3 counter1 = new Test3(5,2,8);
	    
	    
	    for (int i=0;i<10;i++) {
	      
	      counter1.inc();
	      
	      System.out.printf("Текущее значение счетчика: %3d\n", counter1.getI());
	    }

	    System.out.println("----------------------------");
	    
	    for (int i=0;i<10;i++) {
	      
	      counter1.dec();
	      
	      System.out.printf("Текущее значение счетчика: %3d\n", counter1.getI());
	    }
	    

	  }

	}