package Streams;

public class News {
	int newsid;
	String postedByUser;
	String commentedByUser;
	String comment;
	
	public News(int newsid,String postedByUser,String commentedByUser,String comment)
	{
		this.newsid=newsid;
		this.postedByUser=postedByUser;
		this.commentedByUser=commentedByUser;
		this.comment=comment;
	}

	public int getNewsid() {
		return newsid;
	}

	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentedByUser() {
		return commentedByUser;
	}

	public void setCommentedByUser(String commentedByUser) {
		this.commentedByUser = commentedByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", postedByUser=" + postedByUser + ", commentedByUser=" + commentedByUser
				+ ", comment=" + comment + "]";
	}
	


}
