/**
 * 
 */
package com.tarun.spring.di.bean.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * The Class MainWorker_SI.
 *
 * @author taruntyagi
 */
public class MainWorker_ASI {

	/** The worker one. */
	private WorkerType1 workerOne;

	/** The worker two. */
	private WorkerType2 workerTwo;

	/**
	 * Gets the worker one.
	 *
	 * @return the workerOne
	 */
	public WorkerType1 getWorkerOne() {
		return workerOne;
	}

	/**
	 * Sets the worker one.
	 *
	 * @param workerOne
	 *            the workerOne to set
	 */
	@Autowired
	public void setWorkerOne(WorkerType1 workerOne) {
		this.workerOne = workerOne;
	}

	/**
	 * Gets the worker two.
	 *
	 * @return the workerTwo
	 */
	public WorkerType2 getWorkerTwo() {
		return workerTwo;
	}

	/**
	 * Sets the worker two.
	 *
	 * @param workerTwo
	 *            the workerTwo to set
	 */
	@Autowired
	public void setWorkerTwo(WorkerType2 workerTwo) {
		this.workerTwo = workerTwo;
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
