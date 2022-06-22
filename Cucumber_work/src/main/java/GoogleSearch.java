import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\GoogleSearch\\Feature",
        glue = {"src/test/GoogleSearch/java/Steps.java"},
        monochrome = true,
        plugin = {"pretty","html:target/features.html"}
)
public class GoogleSearch {

}
