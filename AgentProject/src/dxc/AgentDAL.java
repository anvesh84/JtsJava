package dxc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AgentDAL {
	
	static List<Agent>  agentlist;
	
	static {
		agentlist = new ArrayList<Agent>();
	}
 public String addAgentDAL(Agent agent) {
	 agentlist.add(agent);
	 return "Data added successfully";
 }

 public List<Agent> showAgentDAL()
 {
	 return agentlist;
 }
 
 public Agent searchAgentDAL(int id) {
	 Agent agent = null;
	 for (Agent a : agentlist) {
		 if(a.getId() == id) {
			 agent = a;
		 }
	 }
		return agent;
	 }
 
	
 
 public String updateAgentDAL(Agent agentupdated)
 {
	 String result = "Record Not Found...";
		for (Agent agent : agentlist) {
			if (agent.getId() == agentupdated.getId()) {
				agent.setFirstName(agentupdated.getFirstName());
				agent.setLastName(agentupdated.getLastName());
				agent.setGender(agentupdated.getGender());
				agent.setPayMode(agentupdated.getPayMode());
				agent.setAnnualPremium(agentupdated.getAnnualPremium());
				result = "Student Record Updated...";
			} 
		}
		return result;
 }
 public String deleteAgentDAL(int id) {
	Agent agentfound = searchAgentDAL(id);
	{if (agentfound != null)
	{
		agentlist.remove(agentfound);
		return "Record Removed";
	}else
		return "Record not found to delete";
	}
 }
  public String writeFileDAL() throws IOException {
	  FileOutputStream fout = new FileOutputStream("E:/dxc/agent.txt");
	  ObjectOutputStream objout = new ObjectOutputStream(fout);
	  objout.writeObject(agentlist);
	  objout.close();
	  fout.close();
	  return " Record writen in file sucessfully";
	  
  }
   public String readFileDAL() throws IOException, ClassNotFoundException{
	   FileInputStream fin = new FileInputStream("E:/dxc/agent.txt");
	   ObjectInputStream objin = new ObjectInputStream(fin);
	   agentlist = (List<Agent>) objin.readObject();
		return "Student Records Retrieved from the file...";
	}
	   
   }

