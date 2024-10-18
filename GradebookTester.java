import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {

   private GradeBook g1;
   private GradeBook g2;

   @Before
   public void setUp() throws Exception {
      g1 = new GradeBook(5);
      g2 = new GradeBook(5);

      g1.addScore(50);
      g1.addScore(75);

      g2.addScore(85);
      g2.addScore(90);
   }

   @After
   public void tearDown() throws Exception {
      g1 = null;
      g2 = null;
   }

   @Test
   public void testAddScore() {
      assertTrue(g1.toString().equals("50.0 75.0"));
      assertTrue(g2.toString().equals("85.0 90.0"));
      assertEquals(2, g1.getScoreSize());
      assertEquals(2, g2.getScoreSize());
   }

   @Test
   public void testSum() {
      assertEquals(125, g1.sum(), .0001);
      assertEquals(175, g2.sum(), .0001);
   }

   @Test
   public void testMinimum() {
      assertEquals(50, g1.minimum(), .001);
      assertEquals(85, g2.minimum(), .001);
   }

   @Test
   public void testFinalScore() {
      assertEquals(75, g1.finalScore(), .0001);
      assertEquals(90, g2.finalScore(), .0001);
   }
}
