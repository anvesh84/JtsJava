package dxc;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainAgent {
 static Scanner sc = new Scanner(System.in);
  static AgentBAL obj = new AgentBAL();
 
 public static void addAgent() throws AgentException {
		Agent agent = new Agent();
		System.out.println("Enter Agent Id  ");
		agent.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Agent First Name  ");
		agent.setFirstName(sc.nextLine());
		System.out.println("Enter LastName  ");
		agent.setLastName(sc.nextLine());
		System.out.println("Enter Gender");
		agent.setGender(sc.nextLine());
		System.out.println("Enter Paymode");
		agent.setPayMode(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Annual Premium");
		agent.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		AgentBAL obj = new AgentBAL();
		System.out.println(obj.addAgentBAL(agent));
	}
 public static void searchAgent() {
	 int Id;
	 System.out.println("Enter agent id");
	 Id =Integer.parseInt(sc.nextLine());
	 AgentBAL obj = new AgentBAL();
	 Agent agent =  obj.searchAgentBAL(Id);
	 if (agent != null){
		 System.out.println(agent);
	 } else
		 System.out.println("Record not found");
 }
 
 public static void showAgent()
 {
	 List<Agent> agents = new AgentBAL().showAgentBAL();
	 for (Agent agent : agents) {
		 System.out.println(agent);	
	}
 }
  
 public static void updateAgent() throws AgentException
 {
	 Agent agent =new Agent();
	 System.out.println("Enter Agent Id  ");
		agent.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Agent First Name  ");
		agent.setFirstName(sc.nextLine());
		System.out.println("Enter LastName  ");
		agent.setLastName(sc.nextLine());
		System.out.println("Enter Gender");
		agent.setGender(sc.nextLine());
		System.out.println("Enter Paymode");
		agent.setPayMode(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Annual Premium");
		agent.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		AgentBAL obj = new AgentBAL();
		System.out.println(obj.updateAgentBAL(agent));
}

 public static void deleteAgent() {
	 int Id;
	 System.out.println("Enter agent id");
	 Id = sc.nextInt();
	 AgentBAL obj = new AgentBAL();
	 System.out.println(obj.deleteAgentBAL(Id));
 }
 public static void writeAgentFile() throws IOException {
		System.out.println(obj.writeFileBAL());
	}
	
	public static void readAgentFile() throws ClassNotFoundException, IOException {
		System.out.println(obj.readFileBAL());
	}


 public static void main(String[] args) {
	 int ch;
	 do {
	 System.out.println(".......Options.....");
	 System.out.println("----------");
	 System.out.println("1. Add Agent");
	 System.out.println("2. Show Agent");
	 System.out.println("3. Search Agent");
	 System.out.println("4. Update Agent");
	 System.out.println("5. Delete Agent");
	 System.out.println("6. Write Agent File");
	 System.out.println("7. Read Agent File");
	 System.out.println("8. Exit");
	 System.out.println("Enter your choice");
	 ch = Integer.parseInt(sc.nextLine());
	 switch(ch) {
	 case 1:
		try {
			addAgent();
		}catch(AgentException e)
		{ System.err.println(e.getMessage());
		} break;
		 
	 case 2:
		 showAgent();
		break;
		 
	 case 3:
			 searchAgent();
			break;
		
	 case 4:
		 try {
			 updateAgent();
			  }catch(AgentException e)
			{ System.err.println(e.getMessage());
			} break;
	
	 case 5:
		 deleteAgent();
		 break;
		 
	 case 6:
		 try {
				writeAgentFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 7 : 
			try {
				readAgentFile();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		 
	 case 8:
		 return;	
	
		 default:
		 System.out.println( "Invalid Choice");
			
	 }
	 }while(ch != 8);
	 
	 
 }
}
