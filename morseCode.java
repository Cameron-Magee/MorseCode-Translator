import javax.sound.sampled.*;
import java.util.*;
public class morseCode
{
	public static void main(String args []) throws LineUnavailableException
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		str=str.toLowerCase();
		int len=str.length();
/* 		dot();
		space();
		dash(); */
		for(int i=0;i<len;i++)
		{
			char cur=str.charAt(i);
			switch(cur)
			{
				case 'a' : dot(); dash(); space(); gap(); break;
				case 'b' : dash(); dot(); dot(); dot(); gap(); break;
				case 'c' : dash(); dot(); dash(); dot(); gap(); break;
				case 'd' : dash(); dot(); dot(); gap(); break;
				case 'e' : dot(); gap(); break;
				case 'f' : dot(); dot(); dash(); dot(); gap(); break;
				case 'g' : dash(); dash(); dot(); gap(); break;
				case 'h' : dot(); dot(); dot(); dot(); gap(); break;
				case 'i' : dot(); dot(); gap(); break;
				case 'j' : dot(); dash(); dash(); dash(); gap(); break;
				case 'k' : dash(); dot(); dash(); gap(); break;
				case 'l' : dot(); dash(); dot(); dot(); gap(); break;
				case 'm' : dash(); dash(); gap(); break;
				case 'n' : dash(); dot(); gap(); break;
				case 'o' : dash(); dash(); dash(); gap(); break;
				case 'p' : dot(); dash(); dash(); dot(); gap(); break;
				case 'q' : dash(); dash(); dot(); dash(); gap(); break;
				case 'r' : dot(); dash(); dot(); gap(); break;
				case 's' : dot(); dot(); dot(); gap(); break;
				case 't' : dash(); gap(); break;
				case 'u' : dot(); dot(); dash(); gap(); break;
				case 'v' : dot(); dot(); dot(); dash(); gap(); break;
				case 'w' : dot(); dash(); dash(); gap(); break;
				case 'x' : dash(); dot(); dot(); dash(); gap(); break;
				case 'y' : dash(); dot(); dash(); dash(); gap(); break;
				case 'z' : dash(); dash(); dot(); dot(); gap(); break;
				case ' ' : space(); break;
				//default : System.out.println("Untranslatable into morse code");
			}
		}
	}
	public static void dot() throws LineUnavailableException
	{
		int hz=500;
		int msecs=100;
		double vol=5;
        float SAMPLE_RATE = 8000f;
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(SAMPLE_RATE,8,1,true,false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        for (int i=0; i < msecs*8; i++)
	    {
         double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
         buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
         sdl.write(buf,0,1);
        } 
        sdl.drain();
        sdl.stop();
        sdl.close();
    }
	public static void dash() throws LineUnavailableException
	{
		int hz=500;
		int msecs=500;
		double vol=5;
        float SAMPLE_RATE = 8000f;
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(SAMPLE_RATE,8,1,true,false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        for (int i=0; i < msecs*8; i++)
	    {
         double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
         buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
         sdl.write(buf,0,1);
        } 
        sdl.drain();
        sdl.stop();
        sdl.close();
    }
	public static void space() throws LineUnavailableException
	{
		int hz=500;
		int msecs=400;
		double vol=0;
        float SAMPLE_RATE = 8000f;
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(SAMPLE_RATE,8,1,true,false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        for (int i=0; i < msecs*8; i++)
	    {
         double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
         buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
         sdl.write(buf,0,1);
        } 
        sdl.drain();
        sdl.stop();
        sdl.close();
    }
    public static void gap() throws LineUnavailableException
	{
		int hz=500;
		int msecs=200;
		double vol=0;
        float SAMPLE_RATE = 8000f;
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(SAMPLE_RATE,8,1,true,false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        for (int i=0; i < msecs*8; i++)
	    {
         double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
         buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
         sdl.write(buf,0,1);
        } 
        sdl.drain();
        sdl.stop();
        sdl.close();
    }
}