package poly.edu.domain;

import java.util.Date;

public class ShareVideoReport {
	private String senderName;
	private String senderEmail;
	private String receiverEmail;
	private Date shareDate;
	
	public ShareVideoReport() {
	}
	
	public ShareVideoReport(String senderName, String senderEmail, String receiverEmail, Date shareDate) {
		this.senderName = senderName;
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
		this.shareDate = shareDate;
	}
	
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public Date getShareDate() {
		return shareDate;
	}
	public void setShareDate(Date shareDate) {
		this.shareDate = shareDate;
	}
	
	
}
