package console.train;

public class TrainDetails {
	private int trainno;
	private String trainname;
	private String trainfrom;
	private String trainto;
	private int ticketcount;
	private int costofticket;

	TrainDetails(String trainname, String trainfrom, String trainto, int ticketcount, int costofticket) {
		this.trainname = trainname;
		this.trainfrom = trainfrom;
		this.trainto = trainto;
		this.ticketcount = ticketcount;
		this.costofticket = costofticket;

	}

	public int setTrainno(int trainno) {
		return this.trainno = trainno;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public void setTrainfrom(String trainfrom) {
		this.trainfrom = trainfrom;
	}

	public void setTrainto(String trainto) {
		this.trainto = trainto;
	}

	public void setTicketcount(int ticketcount) {
		this.ticketcount = ticketcount;
	}

	public void setCostofticket(int costofticket) {
		this.costofticket = costofticket;
	}

	TrainDetails() {
		
	}

	public int getTrainNo() {
		return trainno;
	}

	public String getTrainName() {
		return trainname;
	}

	public String getTrainFrom() {
		return trainfrom;
	}

	public String getTrainTo() {
		return trainto;
	}

	public int getTicketCount() {
		return ticketcount;
	}

	public void setTicketCount(int ticketcount) {
		this.ticketcount = ticketcount;
	}

	public int getCostOfTicket() {
		return costofticket;

	}
}
