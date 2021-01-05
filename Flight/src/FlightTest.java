
public class FlightTest {

	public static void main(String[] args) {
		Flight ALF1 = new Flight("America Airline", 1203, "Kingston", "", 400);
		Flight ALF2 = new Flight("Air Canada", 1205, "Kingston", "Toronto", 650);
		Flight ALF3 = new Flight("Delta Air Lines", 972,"Kingston", "Miami", 300);
		Flight ALF4 = new Flight("America Airline", 1201, "Kingston", "Atlanta", 570);
		
		ALF1.setCost(350);
		ALF3.setCost(520);
		
		ALF3.setNum(981);
		ALF3.setDest("Regina");

		System.out.println();
		System.out.println("************************** AIRLINE FLIGHT ******************************************************************");
		System.out.println(ALF1);
		System.out.println(ALF2);
		System.out.println(ALF3);
		System.out.println(ALF4);
		System.out.println("************************************************************************************************************");
	}

}
