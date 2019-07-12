import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robo {

	public static void main(String[] args) throws IoException,
							AWTException, InterruptedException, IOException
	{
		String command = "notepad.exe";
		Runtime run = Runtime.getRuntime();
		run.exec(command);
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		//Create an instance of RObot class
		Robot robot = new Robot();
		
		//press key using robot A gap of 500 mili sec is added
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_B);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(500);
//		robot.keyPress(KeyEvent.VK_H);
	//	Thread.sleep(500);

	
	}

}


