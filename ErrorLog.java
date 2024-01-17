public class ErrorLog {

	private String machineId;
	private String description;
	
	/** Precondition: message is a valid Error log entry */
	public ErrorLog(String message) {
		machineId=message.substring(0,message.indexOf(":"));
        description=message.substring(message.indexOf(":")+1);
	}

	/** Returns true if the description in this error log entry
	 * contains keyword; false otherwise.
	 * Postcondition: the description is unchanged
	 */
	public boolean containsKey(String keyword) {
		/* part b */
        String before = description.substring(description.indexOf(keyword)-1, description.indexOf(keyword));
        String after = description.substring(description.indexOf(keyword)+description.length(), description.indexOf(keyword)+description.length()+1);
        if (description.indexOf(keyword)!=0){
            if (before!=" ")
                return false;
        }
        else if (description.substring(description.indexOf(keyword))!=keyword){
            if (after!=" ")
                return false;      
        }
        else if (before!=" " || after!=" ")
            return false;
        else
            return true;
	}
	
	public String getMachineId() { return machineId;}
	public String getDescription() { return description; }

	public static void main(String[] args) {
		ErrorLog er1 = new ErrorLog("CLIENT2:security alert");
		ErrorLog er2 = new ErrorLog("Webserver:disk offline");
		ErrorLog er3 = new ErrorLog("SERVER22:file not found on disk3");
		ErrorLog er4 = new ErrorLog("SERVER15:read error on disk DSK7");
		ErrorLog er5 = new ErrorLog("SERVER22:write error on disk");
		ErrorLog er6 = new ErrorLog("Webserver:error on /dev/disk");
		ErrorLog er7 = new ErrorLog("Webserver:disk");
		
		System.out.println("message 1 " + er1.containsKey("disk"));
		System.out.println("message 2 " + er2.containsKey("disk"));
		System.out.println("message 3 " + er3.containsKey("disk"));
		System.out.println("message 4 " + er4.containsKey("disk"));
		System.out.println("message 5 " + er5.containsKey("disk"));
		System.out.println("message 6 " + er6.containsKey("disk"));
		System.out.println("message 6 " + er6.containsKey("error"));
		System.out.println("message 7 " + er7.containsKey("disk"));
		

	}
}

