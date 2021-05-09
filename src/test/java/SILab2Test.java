import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {
    private final Time timeNegative = new Time(-1,-1,-1);
    private final Time timePositive = new Time(25,61,61);
    private final Time timeNormal = new Time(10,10,10);
    private final Time timeSpecial = new Time(24,0,0);

   @Test
   void testClassNegatives(){
       if (timeNegative.getHours() < 0 || timeNegative.getHours() > 24){
           if (timeNegative.getHours() < 0){
               assertEquals("The hours are smaller than the minimum","The hours are smaller than the minimum");
           }
           else {
               assertEquals("The hours are grater than the maximum","The hours are grater than the maximum");
           }
       }
       else if (timeNegative.getHours() < 24) {
           if (timeNegative.getMinutes() < 0 || timeNegative.getMinutes() > 59)
               assertEquals("The minutes are not valid!","The minutes are not valid!");
           else {
               if (timeNegative.getSeconds() >= 0 && timeNegative.getSeconds() <= 59)
                   assertEquals(timeNegative.getHours() * 3600 + timeNegative.getMinutes() * 60 + timeNegative.getSeconds(),timeNegative.getHours() * 3600 + timeNegative.getMinutes() * 60 + timeNegative.getSeconds());
               else
                   assertEquals("The seconds are not valid","The seconds are not valid");
           }
       }
       else if (timeNegative.getHours() == 24 && timeNegative.getMinutes() == 0 && timeNegative.getSeconds() == 0) {
           assertEquals(timeNegative.getHours() * 3600 + timeNegative.getMinutes() * 60 + timeNegative.getSeconds(),timeNegative.getHours() * 3600 + timeNegative.getMinutes() * 60 + timeNegative.getSeconds());
       }
       else {
           assertEquals("The time is greater than the maximum","The time is greater than the maximum");
       }
   }

   @Test
   void testClassPositives(){
       if (timePositive.getHours() < 0 || timePositive.getHours() > 24){
           if (timePositive.getHours() < 0){
               assertEquals("The hours are smaller than the minimum","The hours are smaller than the minimum");
           }
           else {
               assertEquals("The hours are grater than the maximum","The hours are grater than the maximum");
           }
       }
       else if (timePositive.getHours() < 24) {
           if (timePositive.getMinutes() < 0 || timePositive.getMinutes() > 59)
               assertEquals("The minutes are not valid!","The minutes are not valid!");
           else {
               if (timePositive.getSeconds() >= 0 && timePositive.getSeconds() <= 59)
                   assertEquals(timePositive.getHours() * 3600 + timePositive.getMinutes() * 60 + timePositive.getSeconds(),timePositive.getHours() * 3600 + timeNegative.getMinutes() * 60 + timeNegative.getSeconds());
               else
                   assertEquals("The seconds are not valid","The seconds are not valid");
           }
       }
       else if (timePositive.getHours() == 24 && timePositive.getMinutes() == 0 && timePositive.getSeconds() == 0) {
           assertEquals(timePositive.getHours() * 3600 + timePositive.getMinutes() * 60 + timePositive.getSeconds(),timeNegative.getHours() * 3600 + timeNegative.getMinutes() * 60 + timeNegative.getSeconds());
       }
       else {
           assertEquals("The time is greater than the maximum","The time is greater than the maximum");
       }
   }

    @Test
    void testClassNormal(){
        if (timeNormal.getHours() < 0 || timeNormal.getHours() > 24){
            if (timeNormal.getHours() < 0){
                assertEquals("The hours are smaller than the minimum","The hours are smaller than the minimum");
            }
            else {
                assertEquals("The hours are grater than the maximum","The hours are grater than the maximum");
            }
        }
        else if (timeNormal.getHours() < 24) {
            if (timeNormal.getMinutes() < 0 || timeNormal.getMinutes() > 59)
                assertEquals("The minutes are not valid!","The minutes are not valid!");
            else {
                if (timeNormal.getSeconds() >= 0 && timeNormal.getSeconds() <= 59)
                    assertEquals(timeNormal.getHours() * 3600 + timeNormal.getMinutes() * 60 + timeNormal.getSeconds(),timeNormal.getHours() * 3600 + timeNormal.getMinutes() * 60 + timeNormal.getSeconds());
                else
                    assertEquals("The seconds are not valid","The seconds are not valid");
            }
        }
        else if (timeNormal.getHours() == 24 && timeNormal.getMinutes() == 0 && timeNormal.getSeconds() == 0) {
            assertEquals(timeNormal.getHours() * 3600 + timeNormal.getMinutes() * 60 + timeNormal.getSeconds(),timeNormal.getHours() * 3600 + timeNormal.getMinutes() * 60 + timeNormal.getSeconds());
        }
        else {
            assertEquals("The time is greater than the maximum","The time is greater than the maximum");
        }
    }

    @Test
    void testSpecials(){
        if (timeSpecial.getHours() == 24 && timeSpecial.getMinutes() == 0 && timeSpecial.getSeconds() == 0) {
            assertEquals(timeSpecial.getHours() * 3600 + timeSpecial.getMinutes() * 60 + timeSpecial.getSeconds(),timeSpecial.getHours() * 3600 + timeSpecial.getMinutes() * 60 + timeSpecial.getSeconds());
        }

    }
}




