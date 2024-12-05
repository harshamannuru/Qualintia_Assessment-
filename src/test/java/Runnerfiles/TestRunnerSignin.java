package Runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\harsh\\eclipse-workspace\\A1Qualintia\\src\\test\\java\\Features\\Signin.feature",
		glue="StepDefinitons",
		//tags="@Smoke",
		plugin= {"pretty",
				"html:Reports/reports.html",
				"json:Reports/reports.json",
				"rerun:target/rerun.txt",
		}
		)
public class TestRunnerSignin {

}
