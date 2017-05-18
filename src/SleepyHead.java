import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
          //Ask the user for these values using
          int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
          JOptionPane.YES_NO_OPTION);
         
          if (answer == JOptionPane.NO_OPTION) {
        	  JOptionPane.showMessageDialog(null, "Sleep in.");
        	  
          }

          else {
        	int answerVac =  JOptionPane.showConfirmDialog(null, "Are we on Vacation?", "", JOptionPane.YES_NO_OPTION);
        	  
        	if (answerVac == JOptionPane.NO_OPTION) {
        		JOptionPane.showMessageDialog(null, "Get up lazybones.");
        	}
        	
        	else {
        		JOptionPane.showMessageDialog(null, "Sleep youngling.");
        	}
          }

        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}


 
