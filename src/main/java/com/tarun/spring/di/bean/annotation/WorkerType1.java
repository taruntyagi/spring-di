/**
 * 
 */
package com.tarun.spring.di.bean.annotation;

/**
 * The Class WorkerType1.
 *
 * @author taruntyagi
 */
public class WorkerType1 {

	/** The work type one. */
	private String workTypeOne;

	/**
	 * Gets the work type one.
	 *
	 * @return the workTypeOne
	 */
	public String getWorkTypeOne() {
		System.out.println(workTypeOne);
		return workTypeOne;
	}

	/**
	 * Sets the work type one.
	 *
	 * @param workTypeOne
	 *            the workTypeOne to set
	 */
	public void setWorkTypeOne(String workTypeOne) {
		this.workTypeOne = workTypeOne;
	}

}
