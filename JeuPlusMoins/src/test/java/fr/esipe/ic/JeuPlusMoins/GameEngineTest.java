package fr.esipe.ic.JeuPlusMoins;
import junit.framework.TestCase;

public class GameEngineTest extends TestCase{

    public GameEngineTest( String testName )
    {
        super( testName );
    }
   
    // test avec assertTrue()
	public void testGameEngineLess(){
		GameEngine g1 = new GameEngine(new NbAleatoireServiceStub(42));	
		boolean message = false;
		if (g1.plusOuMoins(50).equals("less")) {
			message = true;
		} 
		assertTrue(message);
		System.out.println("premier test de la classe GameEngine : testGameEngineLess() > " + message);
	}
	// test avec assertEquals()
	public void testGameEngineMore(){
		GameEngine g1 = new GameEngine(new NbAleatoireServiceStub(60));
		g1.plusOuMoins(50);		
		assertEquals("more",g1.plusOuMoins(50));	
		System.out.println("second test de la classe GameEngine : testGameEngineMore() > expected : more, actual : " + g1.plusOuMoins(50));
	}
}
