package singleton;


public class RunnableClass implements Runnable{

	FileClass fp;
	String textToBeWritenn;
	
	public RunnableClass(FileClass fc, String text) {
		fp = fc;
		textToBeWritenn = text;
	}
	
	@Override
	public void run() {
		//escrever o mesmo texto algumas vezes //

		try {
			Thread.sleep(1000);
			for (int i=0 ; i<20 ; i++)
				fp.writeToFile(textToBeWritenn);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
}
