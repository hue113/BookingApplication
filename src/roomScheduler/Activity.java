package roomScheduler;

/** This is class Activity which implements interface Serializable
 * @author Pham Thanh Hue
 * @version 1.0
 * Date: March 26, 2020
 */
public class Activity implements java.io.Serializable{
	/** The category and description of booking's activity */ 
	private String category, description;
	
	
	/** This is two-arg constructor Activity
	 * Initializes a new instance of an activity with specified category and description
	 * @param category - This is category of booking's activity
	 * @param description - This is description of booking's activity
	 */
	public Activity(String category, String description) {
		setCategory(category); setDescription(description);	
	}
	
	
	/** This is getter method getDescription() to get description of booking's activity
	 * @return description - Return a String represents description of activity
	 */
	public String getDescription() {return description;}
	
	
	/** This is setter method setDescription to set description of activity, no return
     * @param description - This argument contains description of activity
     */
	public void setDescription(String description) {this.description = description;}

	
	/** This is getter method getCategory() to get category of booking's activity
	 * @return category - Return a String represents category of activity
	 */
	public String getCategory() {return category;}
	
	
    /** This is setter method setCategory to set category of activity, no return
     * @param category - This argument contains category of activity
     */
	public void setCategory(String category) {this.category = category;}
	

	/** This method is to override Object superclass method
	 * @return Return a String of event's category and description
	 */
	@Override
	public String toString() {
		return  "Event: " + getCategory() + "\n" + 
			((getDescription()!="")?"Description: " + getDescription():"") + "\n";
	}
}
