package Connectionutill;

public class Ebook {
	private int bid;
	private String bname;
	private String type;
	private int bpub;
	private int price;
	private int rating;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBpub() {
		return bpub;
	}
	public void setBpub(int bpub) {
		this.bpub = bpub;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Ebook [bid=" + bid + ", bname=" + bname + ", type=" + type + ", bpub=" + bpub + ", price=" + price
				+ ", rating=" + rating + "]";
	}
	

}
