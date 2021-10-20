package TestRunner;
import org.junit.runner.*;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C://Users//user//Desktop//aspiration.com//Features//aspiration.feature",
		glue="Step_definiton"
		
		)


public class testrunner {

}
