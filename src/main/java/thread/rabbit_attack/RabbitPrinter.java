package thread.rabbit_attack;
public class RabbitPrinter implements Runnable {
	private static int startrabbit=0;
	public void run() {		
		if(startrabbit<=10){
			startrabbit++;
	 Runnable printer = new RabbitPrinter();
	 Thread thread = new Thread(printer);
							thread.start();	
						for(int k=0; k<120; k++)
								{String spaces = spaces(k);
								System.out.println(Thread.currentThread().getName()+" "+spaces+" "+"јтакующих кроликов : "+k);}
						System.out.println(Thread.currentThread().getName()+" - ѕсиханул и всeх убил");
		}else{return;}}

	private static String spaces(int count) {
	        String result = "";
	        for (int i = 0; i < count; i++) {
	            result += " ";
	        }
	        return result;
	    }
}