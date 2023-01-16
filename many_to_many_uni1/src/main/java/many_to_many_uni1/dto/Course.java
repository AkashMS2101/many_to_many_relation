package many_to_many_uni1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int c_id;
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", c_duration=" + c_duration + ", c_fee=" + c_fee + "]";
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_duration() {
		return c_duration;
	}
	public void setC_duration(int c_duration) {
		this.c_duration = c_duration;
	}
	public int getC_fee() {
		return c_fee;
	}
	public void setC_fee(int c_fee) {
		this.c_fee = c_fee;
	}
	private String c_name;
	private int c_duration;
	private int c_fee;

}
