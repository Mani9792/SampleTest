package testSample;

public class Test1 {

	public static void main(String args[])
	{ 
		System.out.println("Pyramid pattern of star in Java : ");
		drawPyramidPattern(); 
	}

//This method draws a pyramid pattern using asterisk character.
//You can * replace the asterisk with any other character to draw a pyramid of that. 

    public static void drawPyramidPattern()
    {
    	for(int i = 0; i < 5; i++)
    	{
    		for(int j = 0; j < 5-i; j++)
    		{
    			System.out.print(" ");
    		}
    		
    		for(int k =0; k<=i; k++)
    		{
    			System.out.print("* ");
    		}
    		
    		System.out.println();

    	}
    }
	
}
