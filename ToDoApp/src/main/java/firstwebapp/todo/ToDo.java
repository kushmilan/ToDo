package firstwebapp.todo;

import java.util.Date;


public class ToDo {
	private int id;
	private String user;
	private String desc;
	private Date targetDate;
	private boolean isComplete;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", user=" + user + ", desc=" + desc + ", targetDate=" + targetDate + ", isComplete="
				+ isComplete + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		return result;
	}
	
	public ToDo(int id, String user, String desc, Date targetDate, boolean isComplete) {
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isComplete = isComplete;
	}
	
	public ToDo() {
		this.id = 0;
		this.user = "Your Name";
		this.desc = "Dummy task";
		this.targetDate = new Date();
		this.isComplete = false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDo other = (ToDo) obj;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		return true;
	}
		
}
