package simpleCarculrator;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Rain.class)
@SuiteClasses({ SimpleCarculratorTest.class, WeirdAddTest.class })
public class AllTests {
	
	

}
