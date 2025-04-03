package modulo5.coleccionDatos;

class Package {
   
	public Long id;
    public double weight;
    public double height;
    double width;
    String sender;
    String receiver;
    String address;
    String dateShipped;
    String pickUpDate;

    public Package(Long id, double weight, double height, double width, String sender, String receiver,
                   String address, String dateShipped, String pickUpDate) {
        this.id = id;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.sender = sender;
        this.receiver = receiver;
        this.address = address;
        this.dateShipped = dateShipped;
        this.pickUpDate = pickUpDate;
    }

    @Override
    public String toString() {
        return "Package[ID: " + id + ", Weight: " + weight + ", Height: " + height + ", Width: " + width + ", Sender: " + sender +
               ", Receiver: " + receiver + ", Address: " + address + ", Date Shipped: " + dateShipped + ", Pick-Up Date: " + pickUpDate + "]";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(String dateShipped) {
		this.dateShipped = dateShipped;
	}

	public String getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(String pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
}