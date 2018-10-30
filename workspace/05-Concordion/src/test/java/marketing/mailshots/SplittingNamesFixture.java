package marketing.mailshots;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SplittingNamesFixture {

    public Result split(String fullName) {
        
    	SplitNames sut = new SplitNames();
    	
    	String[] resultadoObtenido = sut.split(fullName);
    	
    	Result result = new Result();

        result.firstName = resultadoObtenido[0];
        result.lastName = resultadoObtenido[1];
        
        return result;
    }

    class Result {
        public String firstName;
        public String lastName;
    }
}