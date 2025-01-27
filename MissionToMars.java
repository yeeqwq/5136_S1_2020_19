package missonToMars;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MissionToMars {
	private static Shuttle shuttle;
	private static Mission mission;
	private static EmploymentDeployment em_deployment;
	private static SelectionCriteria criteria;

	public MissionToMars() {
		shuttle = new Shuttle();
		mission = new Mission();
		em_deployment = new EmploymentDeployment();
		criteria = new SelectionCriteria();
	}

	public static void displayShuttle(Shuttle shuttle) {
		System.out.println("The information of the shuttle: \nShuttle name: " + shuttle.getS_name()
				+ "\nShuttle manufacturing year: " + shuttle.getS_manufact_year() + "\nShuttle fuel capacity: "
				+ shuttle.getS_fuel_capacity() + "\nShuttle passenger capacity: " + shuttle.getS_passenger_capacity()
				+ "\nShuttle cargo capacity: " + shuttle.getS_cargo_capacity() + "\nShuttle travle speed: "
				+ shuttle.getS_travel_speed() + "\nShuttle origin: " + shuttle.getS_origin()
				+ "\nPlease press enter to view the information of employment requirements.");
	}

	public static void displayEmploymentDeployment(EmploymentDeployment em_deployment) {
		System.out.println("The information of the employment requirements: \nEmployment requirements: "
				+ em_deployment.getEmpTitle() + "\nNumber required: " + em_deployment.getEmpReq());
	}

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		Shuttle shuttle1 = new Shuttle();
		displayShuttle(shuttle1);
		console.nextLine();
		EmploymentDeployment em_deployment1 = new EmploymentDeployment();
		displayEmploymentDeployment(em_deployment1);
		console.nextLine();
		CreatingCriteria criteria1 = new CreatingCriteria();
		criteria = criteria1.create();

	}
}