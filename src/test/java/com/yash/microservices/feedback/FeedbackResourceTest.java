package com.yash.microservices.feedback;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FeedbackResourceTest {

	
	@Test
	public void  testHashCodeConsistency() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResource = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
		assertEquals(feedbackResource, feedbackResource);
	}
	
	@Test
	public void testHashCodeEquality() throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResourceOne = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
		FeedbackResource feedbackResourceTwo = new FeedbackResource("jd123", "John Deere", 5, "greate", date);

		assertTrue(feedbackResourceOne.equals(feedbackResourceTwo));
		assertEquals(feedbackResourceOne.hashCode(), feedbackResourceTwo.hashCode());


	}
	@Test
	public void testReflexive() throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResourceOne = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
	
		assertTrue(feedbackResourceOne.equals(feedbackResourceOne));
		assertEquals(feedbackResourceOne.hashCode(), feedbackResourceOne.hashCode());
	}
	
	@Test
	public void testSymmetric() throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResourceOne = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
		FeedbackResource feedbackResourceTwo = new FeedbackResource("jd123", "John Deere", 5, "greate", date);

		assertTrue(feedbackResourceOne.equals(feedbackResourceTwo) && feedbackResourceTwo.equals(feedbackResourceOne));
		assertEquals(feedbackResourceOne.hashCode(), feedbackResourceTwo.hashCode());
	}
	
	@Test
	public void testTransitive() throws ParseException{ 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResourceOne = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
		FeedbackResource feedbackResourceTwo = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
		FeedbackResource feedbackResourceThree = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
		
		assertTrue(feedbackResourceOne.equals(feedbackResourceTwo));
		assertTrue(feedbackResourceTwo.equals(feedbackResourceThree));
		assertTrue(feedbackResourceThree.equals(feedbackResourceOne));
	}
	
	
	@Test
	public void testNonNullity() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResourceOne = new FeedbackResource("jd123", "John Deere", 5, "greate", date);
		
		assertFalse(feedbackResourceOne.equals(null));
		
		feedbackResourceOne.setUsername(null);
		assertFalse(feedbackResourceOne.equals(feedbackResourceTwo));
	}
	
	
	@Test
	public void testDifference() throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResourceOne = new FeedbackResource("jd123", "John Deere", 5, "great", date);
		FeedbackResource feedbackResourceTwo = new FeedbackResource("ysh123", "Yash", 5, "great", date);

		assertFalse(feedbackResourceOne.equals(feedbackResourceTwo));
	}
	@Test
	public void testEquality() throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date date = format.parse("2019-01-19");
		FeedbackResource feedbackResourceOriganal = new FeedbackResource("jd123", "John Deere", 5, "great", date);
		FeedbackResource feedbackResourceNew = new FeedbackResource("jd123", "John Deere", 5, "great", date);

		assertTrue(feedbackResourceOriganal.equals(feedbackResourceNew));
		assertTrue(feedbackResourceOriganal.hashCode() == feedbackResourceNew.hashCode());
		
		
		feedbackResourceOriganal.setUsername("user123");
		assertFalse(feedbackResourceOriganal.equals(feedbackResourceNew));
		assertFalse(feedbackResourceOriganal.hashCode() == feedbackResourceNew.hashCode());
			
	}

}
