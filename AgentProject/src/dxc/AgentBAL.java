package dxc;

import java.io.IOException;
import java.util.List;

public class AgentBAL {
 static StringBuilder sb;
 
 
 public boolean valid(Agent agent) {
	 sb = new StringBuilder("");
	 boolean valid = true;
	 
	 if(agent.getId() <= 0 ) {
		 valid = false;
		 sb.append("ID cannnot be negative\n");

	 }
	 if(agent.getFirstName().length() < 3 || agent.getFirstName().indexOf(" ") != -1)
	 { 
		 sb.append("Fistname not valid cannot contain space\n");
		 valid = false;

	 }
	 if (agent.getLastName().length() < 3 || agent.getLastName().indexOf(" ") != -1)
  {
		 sb.append("Lasttname not valid\n");
		 valid = false;
	 }
	
		 if (!(agent.getGender().toLowerCase().equals("male") || agent.getGender().toLowerCase().equals("female")))
		 {	 
			 sb.append("Gender not valid");
			 valid =false;

		 }
	 
	 if(agent.getPayMode() != 1 && agent.getPayMode() !=2 && agent.getPayMode()  != 3)
	 { 
		 sb.append("Paymode must be betweeen 1 to 3\n");
		 valid = false;

	 }	 
		if (agent.getAnnualPremium() < 25000 || agent.getAnnualPremium() > 100000) // check less than 25000 and 100000 
		{	
			sb.append("Annual premium is not valid\n");
			valid = false; 

		  }	  
 return valid;
 }

 
 public String addAgentBAL(Agent agent) throws AgentException {
	 if(valid(agent) == true) {
	AgentDAL  dal = new AgentDAL();
        return  dal.addAgentDAL(agent);
 } else
	  throw new AgentException(sb.toString());
 }
 
 public List<Agent> showAgentBAL()
 {
		 AgentDAL dal = new AgentDAL();
		return dal.showAgentDAL();
	 
 }
 
public String writeFileBAL() throws IOException {
	AgentDAL dal = new AgentDAL();
	return dal.writeFileDAL();
	 }
 
 public String readFileBAL() throws IOException, ClassNotFoundException{
	 AgentDAL dal = new AgentDAL();
	 return dal.readFileDAL();
 }
 
public Agent searchAgentBAL(int Id)
{
	AgentDAL dal = new AgentDAL();
	 return dal.searchAgentDAL(Id);

}

public String updateAgentBAL(Agent agent) throws AgentException {
	 if(valid(agent) == true) {
	AgentDAL  dal = new AgentDAL();
       return  dal.updateAgentDAL(agent);
} else
	  throw new AgentException(sb.toString());
}
 
 public String deleteAgentBAL(int Id) {
	 AgentDAL dal = new AgentDAL();
	 return dal.deleteAgentDAL(Id);
 }
 
 
}
