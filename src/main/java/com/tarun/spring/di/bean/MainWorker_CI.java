/**
 * 
 */
package com.tarun.spring.di.bean;

/**
 * The Class MainWorker Constructor Injection.
 *
 * @author taruntyagi
 */
public class MainWorker_CI {

	/** The worker one. */
	private WorkerType1 workerOne;

	/** The worker two. */
	private WorkerType2 workerTwo;

	/**
	 * Instantiates a new main worker.
	 *
	 * @param type1
	 *            the type 1
	 * @param type2
	 *            the type 2
	 */
	public MainWorker_CI(WorkerType1 type1, WorkerType2 type2) {
		this.workerOne = type1;
		this.workerTwo = type2;
	}

	/**
	 * Do work type one.
	 *
	 * @return the string
	 */
	public String doWorkTypeOne() {
		return this.workerOne.getWorkTypeOne();
	}

	/**
	 * Do work type two.
	 *
	 * @return the string
	 */
	public String doWorkTypeTwo() {
		return this.workerTwo.getWorkTypeTwo();
	}

}
