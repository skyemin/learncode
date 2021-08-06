package com.wei.learncode;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearncodeApplicationTests {

	@Test
	public void contextLoads() {

		Assert.assertThat("1", new Matcher<String>() {
			@Override
			public boolean matches(Object o) {
				return false;
			}

			@Override
			public void describeMismatch(Object o, Description description) {

			}

			@Override
			public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {

			}

			@Override
			public void describeTo(Description description) {

			}
		});
	}

}
